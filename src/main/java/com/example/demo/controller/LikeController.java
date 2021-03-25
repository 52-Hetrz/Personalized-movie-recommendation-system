package com.example.demo.controller;

import com.example.demo.service.impl.LikeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
@RestController
public class LikeController {

    @Autowired
    LikeServiceImpl likeService;

    @RequestMapping("/insertLike")
    @ResponseBody
    public void insertLike(HttpServletRequest httpServletRequest){
        String userId=httpServletRequest.getParameter("userId");
        int musicId=Integer.parseInt(httpServletRequest.getParameter("musicId"));
        likeService.insertLike(userId,musicId);
    }

    @RequestMapping("/deleteLike")
    @ResponseBody
    public void deleteLike(HttpServletRequest httpServletRequest){
        String userId=httpServletRequest.getParameter("userId");
        int musicId=Integer.parseInt(httpServletRequest.getParameter("musicId"));
        likeService.deleteLikeByUserAndMusicId(userId,musicId);
    }




}
