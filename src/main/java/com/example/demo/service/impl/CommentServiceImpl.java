package com.example.demo.service.impl;

import com.example.demo.mapper.CommentMapper;
import com.example.demo.model.Comment;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    MusicServiceImpl musicService;
    @Autowired
    CommentMapper commentMapper;

    @Override
    public int insertComment(String comment, String userId, int musicId) {
        plusMusicCommentsNumByMusicId(musicId);
        return commentMapper.insertComment(comment,userId,musicId);
    }

    @Override
    public void deleteComment(String userId, int musicId) {
        minusMusicCommentsNumByMusicId(musicId);
        commentMapper.deleteComment(userId,musicId);
    }

    @Override
    public ArrayList<Comment> selectCommentsByUserId(String userId) {
        return commentMapper.selectCommentsByUserId(userId);
    }

    @Override
    public ArrayList<Comment> selectCommentsByMusicId(int musicId) {
        return commentMapper.selectCommentsByMusicId(musicId);
    }

    @Override
    public ArrayList<Comment> selectCommentsByUserAndMusicId(String userId, int musicId) {
        return commentMapper.selectCommentsByUserAndMusicId(userId,musicId);
    }

    void plusMusicCommentsNumByMusicId(int musicId){
        int comments=musicService.selectCommentsByMusicId(musicId);
        musicService.updateCommentsByMusicId(musicId,comments+1);
    }

    void minusMusicCommentsNumByMusicId(int musicId){
        int comments=musicService.selectCommentsByMusicId(musicId);
        musicService.updateCommentsByMusicId(musicId,comments-1);
    }
}
