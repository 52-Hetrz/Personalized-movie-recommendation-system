package com.example.demo.model;

public class Comment {
    int commentId;
    String comment;
    String userId;
    int musicId;

    Comment(Integer commentId,String comment,String userId,Integer musicId){
        this.commentId=commentId;
        this.comment=comment;
        this.userId=userId;
        this.musicId=musicId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
        return "Comment{" +
                "commentId=" + commentId +
                ", comment='" + comment + '\'' +
                ", userId='" + userId + '\'' +
                ", musicId=" + musicId +
                '}';
    }
}
