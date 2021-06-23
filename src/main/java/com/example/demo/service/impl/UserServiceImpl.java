package com.example.demo.service.impl;

import com.example.demo.VO.MovieVO;
import com.example.demo.dao.Movie;
import com.example.demo.dao.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author Life
 * @Date 2021/6/22 15:36
 * @Version 1.0
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public Integer selectUserIdByName(String name){
        return userMapper.selectUserIdByName(name);
    }

    @Override
    public User selectUserById(int id){
        return userMapper.selectUserById(id);
    }

    @Override
    public String selectUserNameById(int id) {
        return userMapper.selectUserNameById(id);
    }
}
