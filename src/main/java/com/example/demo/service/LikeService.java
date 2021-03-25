package com.example.demo.service;

public interface LikeService {
    void insertLike(String userId,int musicId);
    void deleteLikeByUserAndMusicId(String userId,int musicId);

}
