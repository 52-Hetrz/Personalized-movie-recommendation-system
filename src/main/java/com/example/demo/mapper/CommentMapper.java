package com.example.demo.mapper;

import com.example.demo.model.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface CommentMapper {

    int insertComment(String comment,String userId,int musicId);
    void deleteComment(String userId,int musicId);
    ArrayList<Comment> selectCommentsByUserId(String userId);
    ArrayList<Comment> selectCommentsByMusicId(int musicId);
    ArrayList<Comment> selectCommentsByUserAndMusicId(String userId,int musicId);
}
