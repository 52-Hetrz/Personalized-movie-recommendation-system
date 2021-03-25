package com.example.demo.service.impl;


import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 向数据库中插入用户信息
     * @param userId    用户id
     * @param userName  用户名
     * @param password  用户的密码
     * @param introduction  用户简介
     * @param portrait      用户头像
     * @param sex       用户性别
     * @param date      用户账号创建的时间
     * @return  返回1时插入成功，返回0表示插入失败
     */
    @Override
    public int insertUser(String userId,String userName,String password,
                           String introduction,String portrait,String sex,String date) {
        if(userId!=null && userName!=null && password!=null)
            return userMapper.insertUser(userId,userName,password,introduction,portrait,sex,date);
        else
            return -1;
    }

    /**
     * 根据用户id删除数据库中的用户信息
     * @param userId    用户id
     * @return  返回1表示删除成功，返回0表示删除失败
     */
    @Override
    public int deleteUserById(String userId) {
        return userMapper.deleteUserById(userId);
    }

    /**
     * 根据用户id查找用户信息
     * @param userId    用户id
     * @return  返回为User类，保存有查询的用户信息
     */
    @Override
    public User findByUserId(String userId) {
        User user=userMapper.findByUserId(userId);
        return user;
    }

    /**
     * 更新用户的自我介绍
     * @param userId    用户id
     * @param introduction  新的用户介绍
     * @return 返回1表示修改成功，返回0表示修改失败
     */
    @Override
    public int updateIntroduction(String userId, String introduction) {
        return userMapper.updateIntroduction(userId,introduction);
    }

    /**
     * 更新数据库中的用户密码
     * @param userId    用户id
     * @param password  需要更新的用户密码
     * @return  返回1表示更新成功，返回0表示更新失败
     */
    @Override
    public int updatePassword(String userId,String password) {
        return userMapper.updatePassword(userId,password);
    }

    /**
     * 查询数据库中的用户密码
     * @param userId    需要查询密码的用户id
     * @return  返回该用户的密码
     */
    @Override
    public String searchPasswordByUserId(String userId){
        return userMapper.searchPasswordByUserId(userId);
    }
}
