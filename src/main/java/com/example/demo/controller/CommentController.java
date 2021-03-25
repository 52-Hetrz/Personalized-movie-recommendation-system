package com.example.demo.controller;

import com.example.demo.model.Comment;
import com.example.demo.service.impl.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RestController
public class CommentController {

    @Autowired
    CommentServiceImpl commentService;

    @RequestMapping("/insertComment")
    @ResponseBody
    void insertComment(HttpServletRequest httpServletRequest){
        String userId=httpServletRequest.getParameter("userId");
        String musicId=httpServletRequest.getParameter("musicId");
        String comment=httpServletRequest.getParameter("comment");
        commentService.insertComment(comment,userId,Integer.parseInt(musicId));

    }

    @RequestMapping("/deleteComment")
    @ResponseBody
    void deleteComment(HttpServletRequest httpServletRequest){
        String userId=httpServletRequest.getParameter("userId");
        String musicId=httpServletRequest.getParameter("musicId");
        commentService.deleteComment(userId,Integer.parseInt(musicId));
    }

    @RequestMapping("/selectCommentsByUserId")
    @ResponseBody
    String selectCommentsByUserId(String userId){
        ArrayList<Comment> commentArrayList=commentService.selectCommentsByUserId(userId);
        return commentArrayList.toString();
    }

    @RequestMapping("/selectCommentsByMusicId")
    @ResponseBody
    String selectCommentsByMusicId(String musicId){
        ArrayList<Comment> commentArrayList=commentService.selectCommentsByMusicId(Integer.parseInt(musicId));
        return commentArrayList.toString();
    }

    @RequestMapping("/selectCommentsByUserAndMusicId")
    @ResponseBody
    String selectCommentsByMusicId(String musicId,String userId){
        ArrayList<Comment> commentArrayList=commentService.selectCommentsByUserAndMusicId(userId,Integer.parseInt(musicId));
        return commentArrayList.toString();
    }

}
