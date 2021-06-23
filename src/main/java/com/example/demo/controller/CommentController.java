package com.example.demo.controller;

import com.example.demo.VO.CommentVO;
import com.example.demo.service.impl.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName CommentController
 * @Description
 * @Author Life
 * @Date 2021/6/23 16:01
 * @Version 1.0
 */

@Controller
@RestController
public class CommentController {

    @Autowired
    CommentServiceImpl commentService;

    @GetMapping("/searchCommentById")
    @ResponseBody
    public CommentVO searchCommentById(HttpServletRequest httpServletRequest){
        String id = httpServletRequest.getParameter("id");
        return commentService.searchCommentById(Integer.parseInt(id));
    }
}
