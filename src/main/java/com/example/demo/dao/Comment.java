package com.example.demo.dao;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @ClassName Comment
 * @Description Comment的Dao类，存储从数据库中读取的Comment数据
 * @Author Life
 * @Date 2021/6/22 14:44
 * @Version 1.0
 */


public class Comment {
    private int id;
    private String content;
    private String time;
    private int score;
    private int userId;
    private int movieId;

    public Comment(Integer id, String content, String time, Integer score, Integer userId, Integer movieId){
        setId(id);
        setContent(content);
        setTime(time);
        setScore(score);
        setUserId(userId);
        setMovieId(movieId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}
