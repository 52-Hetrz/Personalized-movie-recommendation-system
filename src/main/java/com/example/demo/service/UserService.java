package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    int insertUser(String userId,String userName,String password,String introduction,String portrait,String sex,String date);
    int deleteUserById(String userId);
    User findByUserId(String userId);
    int updateIntroduction(String userId,String introduction);
    int updatePassword(String userId,String password);
    String searchPasswordByUserId(String userId);
}

