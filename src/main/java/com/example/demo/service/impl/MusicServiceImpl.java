package com.example.demo.service.impl;

import com.example.demo.mapper.MusicMapper;
import com.example.demo.model.Music;
import com.example.demo.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    MusicMapper musicMapper;

    @Override
    public int insertMusic(int musicId, String musicName, String userId, String address, String image, int comments, int likes) {
        return musicMapper.insertMusic(musicId,musicName,userId,address,image,comments,likes);
    }

    /**
     * 向数据库中插入音乐
     * @param musicName 音乐的名称
     * @param userId    音乐出品人的id
     * @param address   音乐文件存储的地址
     * @param image     音乐的封面照地址
     * @param comments  音乐的评论数
     * @param likes     音乐的喜欢数
     * @return  返回1表示插入成功，返回0表示插入失败
     */
    @Override
    public int insertMusicWithoutId(String musicName, String userId, String address, String image, int comments, int likes) {
        return musicMapper.insertMusicWithoutId(musicName,userId,address,image,comments,likes);
    }

    /**
     * 删除数据库中的音乐
     * @param musicId   要删除的音乐的id
     * @return  返回1表示删除成功，返回0表示删除失败
     */
    @Override
    public int deleteMusicById(int musicId) {
        return musicMapper.deleteMusicById(musicId);
    }

    /**
     * 根据musicId查询音乐
     * @param musicId   音乐的id
     * @return  返回Music类，存储该音乐的信息
     */
    @Override
    public Music findMusicById(int musicId) {
        return musicMapper.findMusicById(musicId);
    }

    /**
     * 根据用户id查找该用户所发布的所有的音乐id
     * @param userId    用户id
     * @return  返回该用户发布的音乐id的集合，类型为ArrayList<Integer>
     */
    @Override
    public ArrayList<Integer> findMusicByUserId(String userId) {
        return musicMapper.findMusicByUserId(userId);
    }

    /**
     * 根据音乐id更新该音乐的喜欢数
     * @param musicId   音乐的id
     * @param likes     更新之后的喜欢数
     * @return  返回1表示更新成功，返回0表示更新失败
     */
    @Override
    public int updateLikesByMusicId(int musicId, int likes) {
        return musicMapper.updateLikesByMusicId(musicId,likes);
    }

    /**
     * 根据音乐id查询该音乐的喜欢数
     * @param musicId   音乐id
     * @return  返回该音乐的喜欢数
     */
    @Override
    public int selectLikesByMusicId(int musicId) {
        return musicMapper.selectLikesByMusicId(musicId);
    }

    /**
     * 根据音乐id更新该音乐的评论数
     * @param musicId   音乐id
     * @param comments  更新之后音乐的平路数
     * @return  返回1表示更新成功，返回0表示更新失败
     */
    @Override
    public int updateCommentsByMusicId(int musicId, int comments) {
        return musicMapper.updateCommentsByMusicId(musicId,comments);
    }

    /**
     * 根据音乐id查找该音乐的评论数
     * @param musicId   音乐id
     * @return  返回该音乐的评论数
     */
    @Override
    public int selectCommentsByMusicId(int musicId) {
        return musicMapper.selectCommentsByMusicId(musicId);
    }
}
