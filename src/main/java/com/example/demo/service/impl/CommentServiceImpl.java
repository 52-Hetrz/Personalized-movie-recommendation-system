package com.example.demo.service.impl;

import com.example.demo.VO.CommentVO;
import com.example.demo.dao.Comment;
import com.example.demo.mapper.CommentMapper;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @ClassName CommentServiceImpl
 * @Description
 * @Author Life
 * @Date 2021/6/23 10:14
 * @Version 1.0
 */


@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;
    @Autowired
    UserServiceImpl userService;
    @Autowired
    MovieServiceImpl movieService;

    @Override
    public ArrayList<CommentVO> searchCommentsByUserId(int userId) {
        ArrayList<Comment> comments = commentMapper.selectCommentsByUserId(userId);
        ArrayList<CommentVO> commentVOS = new ArrayList<>();
        for(Comment comment:comments){
            commentVOS.add(new CommentVO(comment,
                    userService.searchUserNameById(comment.getUserId()),
                    movieService.searchMovieNameById(comment.getMovieId())));
        }
        return commentVOS;
    }
}
