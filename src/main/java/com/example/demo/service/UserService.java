package com.example.demo.service;


import com.example.demo.VO.MovieVO;
import com.example.demo.dao.Movie;
import com.example.demo.dao.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {
    /**
     * 向数据库中插入用户数据
     * @param user 存储用户信息的User类
     * @return 插入正确返回1
     */
    int insertUser(User user);

    /**
     * 根据用户名选择用户的id
     * @param name 用户名
     * @return 该用户id
     */
    Integer selectUserIdByName(String name);

    /**
     * 根据用户id选取用户信息
     * @param id 用户id
     * @return User类：存储该用户信息
     */
    User selectUserById(int id);

    /**
     * 根据用户id查找用户名
     * @param id    用户id
     * @return  String：用户名
     */
    String selectUserNameById(int id);
}
