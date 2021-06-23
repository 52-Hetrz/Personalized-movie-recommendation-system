package com.example.demo.service;


import com.example.demo.VO.CommentVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface CommentService {

    /**
     * 根据用户id查找用户评论的电影
     * @param userId 用户id
     * @return ArrayList<Comment> 存储该用户的所有影评
     */
    ArrayList<CommentVO> searchCommentsByUserId(int userId);

    /**
     * 根据电影id查找对该电影的评论
     * @param movieId 电影id
     * @return ArrayList<Comment> 存储该电影的所有影评
     */
    ArrayList<CommentVO> searchCommentsByMovieId(int movieId);

    /**
     * 根据评论的id查找评论
     * @param id 评论id
     * @return Comment：存有该评论的CommentVO对象
     */
    CommentVO searchCommentById(int id);

}
