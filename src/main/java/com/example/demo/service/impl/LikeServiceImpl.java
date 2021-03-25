package com.example.demo.service.impl;


import com.example.demo.mapper.LikeMapper;
import com.example.demo.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    LikeMapper likeMapper;

    @Autowired
    MusicServiceImpl musicService;

    @Override
    public void insertLike(String userId, int musicId) {
        likeMapper.insertLike(userId,musicId);
        plusMusicLikesByMusicId(musicId);
    }

    @Override
    public void deleteLikeByUserAndMusicId(String userId, int musicId) {
        likeMapper.deleteLikeByUserAndMusicId(userId,musicId);
        minusMusicLikesByMusicId(musicId);
    }

    public void plusMusicLikesByMusicId(int musicId) {
        int likes=musicService.selectLikesByMusicId(musicId);
        musicService.updateLikesByMusicId(musicId,likes+1);
    }


    public void minusMusicLikesByMusicId(int musicId) {
        int likes=musicService.selectLikesByMusicId(musicId);
        musicService.updateLikesByMusicId(musicId,likes-1);
    }
}
