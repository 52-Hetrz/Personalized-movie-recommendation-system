package com.example.demo.mapper;


import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserMapper {
    int insertUser(String userId,String userName,String password,String introduction,String portrait,String sex,String date);
    int deleteUserById(String userId);
    User findByUserId(String userId);
    int updateIntroduction(String userId,String introduction);
    int updatePassword(String userId,String password);
    String searchPasswordByUserId(String userId);
}
