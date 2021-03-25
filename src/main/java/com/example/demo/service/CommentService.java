package com.example.demo.service;


import com.example.demo.model.Comment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface CommentService {
    int insertComment(String comment,String userId,int musicId);
    void deleteComment(String userId,int musicId);
    ArrayList<Comment> selectCommentsByUserId(String userId);
    ArrayList<Comment> selectCommentsByMusicId(int musicId);
    ArrayList<Comment> selectCommentsByUserAndMusicId(String userId,int musicId);
}
