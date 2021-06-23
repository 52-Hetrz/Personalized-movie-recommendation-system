package com.example.demo.mapper;

import com.example.demo.dao.Movie;
import com.example.demo.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @ClassName UserMapper
 * @Description
 * @Author Life
 * @Date 2021/6/22 15:17
 * @Version 1.0
 */

@Mapper
@ResponseBody
public interface UserMapper {
    int insertUser(User user);
    Integer selectUserIdByName(String name);
    User selectUserById(int id);
    String selectUserNameById(int id);
}