package com.example.demo.service;


import com.example.demo.VO.CommentVO;
import com.example.demo.dao.Comment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface CommentService {

    /**
     * 根据用户id查找用户评论的电影
     * @param userId 用户id
     * @return ArrayList<Comment> 存储该用户的所有影评
     */
    ArrayList<CommentVO> selectCommentsByUserId(int userId);
}
