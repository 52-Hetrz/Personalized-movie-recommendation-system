package com.example.demo.model;

public class Like {

    String userId;
    int musicId;

    Like(String userId,int musicId){
        this.userId=userId;
        this.musicId=musicId;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    @Override
    public String toString() {
        return "Like{" +
                "userId='" + userId + '\'' +
                ", musicId=" + musicId +
                '}';
    }
}
