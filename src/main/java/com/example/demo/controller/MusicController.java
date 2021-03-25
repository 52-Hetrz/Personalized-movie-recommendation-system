package com.example.demo.controller;

import com.example.demo.model.Music;
import com.example.demo.service.impl.MusicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;


@Controller
@RestController
public class MusicController {

    @Autowired
    MusicServiceImpl musicService;

    @RequestMapping("/insertMusicWithoutId")
    @ResponseBody
    public String insertMusicWithoutId(HttpServletRequest httpServletRequest){
        String musicName=httpServletRequest.getParameter("musicName");
        String userId=httpServletRequest.getParameter("userId");
        String address=httpServletRequest.getParameter("address");
        String image=httpServletRequest.getParameter("image");
        return Integer.toString(musicService.insertMusicWithoutId(musicName,userId,address,image,0,0));
    }

    @RequestMapping("/deleteMusicById")
    @ResponseBody
    public String deleteMusicById(int musicId){
        return Integer.toString(musicService.deleteMusicById(musicId));
    }

    @RequestMapping("/findMusicById")
    @ResponseBody
    public String findMusicById(int musicId){
        return musicService.findMusicById(musicId).toString();
    }

    @RequestMapping("/findMusicByUserId")
    @ResponseBody
    public String findMusicByUserId(String userId){
        ArrayList<Integer> musicIdList=musicService.findMusicByUserId(userId);
        ArrayList<Music> musicList=new ArrayList<>();
        for(Integer musicId:musicIdList){
            musicList.add(musicService.findMusicById(musicId));
        }
        return musicList.toString();
    }

}
