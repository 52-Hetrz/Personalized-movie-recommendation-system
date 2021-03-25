package com.example.demo.model;

public class Music {
    Integer musicId;
    String musicName;
    String userId;
    String image;
    String address;
    int comments;
    int likes;

    public Music(Integer musicId,String musicName,String userId,String image,String address,Integer comments,Integer likes ){
        this.musicId=musicId;
        this.musicName=musicName;
        this.userId=userId;
        this.image=image;
        this.address=address;
        this.comments=comments;
        this.likes=likes;
    }

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Music{" +
                "musicId=" + musicId +
                ", musicName='" + musicName + '\'' +
                ", userId='" + userId + '\'' +
                ", image='" + image + '\'' +
                ", address='" + address + '\'' +
                ", comments=" + comments +
                ", likes=" + likes +
                '}';
    }
}
