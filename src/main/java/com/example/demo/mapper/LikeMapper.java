package com.example.demo.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LikeMapper {
    void insertLike(String userId,int musicId);
    void deleteLikeByUserAndMusicId(String userId,int musicId);
}
