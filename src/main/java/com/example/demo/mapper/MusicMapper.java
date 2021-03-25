package com.example.demo.mapper;

import com.example.demo.model.Music;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;

@Mapper
@Repository
public interface MusicMapper {
    int insertMusic(int musicId,String musicName,String userId,String address,
                    String image,int comments,int likes);
    int insertMusicWithoutId(String musicName,String userId,String address,
                    String image,int comments,int likes);
    int deleteMusicById(int musicId);
    Music findMusicById(int musicId);
    ArrayList<Integer> findMusicByUserId(String userId);
    int updateLikesByMusicId(int musicId,int likes);
    int selectLikesByMusicId(int musicId);
    int updateCommentsByMusicId(int musicId,int comments);
    int selectCommentsByMusicId(int musicId);

}
