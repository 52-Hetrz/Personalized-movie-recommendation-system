package com.example.demo.model;

/**
 *  用户类，和数据库对接
 */
public class User {

    String userId;
    String userName;
    String password;
    String introduction;
    String portrait;
    String sex;
    String date;


    public User(String userId,String userName,String password,String sex,String introduction,String portrait,String date){
        this.userId=userId;
        this.userName=userName;
        this.password=password;
        //this.date=simpleDateFormat.format(new Date());
        this.sex=sex;
        this.introduction=introduction;
        this.portrait=portrait;
        this.date=date;
    }

    /**
     *  没有用户简介时，User类初始化函数
     * @param userId    用户id
     * @param userName  用户名
     * @param password  用户密码
     * @param sex       用户性别
     */
    public User(String userId,String userName,String password,String sex){
        this.userId=userId;
        this.userName=userName;
        this.password=password;
        //this.date=simpleDateFormat.format(new Date());
        this.sex=sex;
    }

    /**
     *  有用户简介时，User类的初始化函数
     * @param userId        用户id
     * @param userName      用户名
     * @param password      用户密码
     * @param introduction  用户简介
     * @param sex           用户性别
     */
    public User(String userId,String userName,String password,String introduction,String sex){
        this.userId=userId;
        this.userName=userName;
        this.password=password;
        this.introduction=introduction;
        //this.date=simpleDateFormat.format(new Date());
        this.sex=sex;

    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getSex() {
        return sex;
    }

    public String getDate() {
        return date;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", introduction='" + introduction + '\'' +
                ", portrait='" + portrait + '\'' +
                ", sex='" + sex + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

