package com.example.demo.controller;

import com.example.demo.VO.MovieVO;
import com.example.demo.VO.RegisterAndLoginReturn;
import com.example.demo.VO.UserVO;
import com.example.demo.dao.Movie;
import com.example.demo.dao.User;
import com.example.demo.service.impl.CommentServiceImpl;
import com.example.demo.service.impl.MovieServiceImpl;
import com.example.demo.service.impl.UserServiceImpl;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * @ClassName UserController
 * @Description
 * @Author Life
 * @Date 2021/6/22 15:38
 * @Version 1.0
 */

@Controller
@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;
    @Autowired
    MovieServiceImpl movieService;
    @Autowired
    CommentServiceImpl commentService;


    /**
     * 向数据库中插入用户数据
     * @param servletRequest 网络协议请求
     * @return null
     */
    @GetMapping("/register")
    @ResponseBody
    public RegisterAndLoginReturn insertUser(HttpServletRequest servletRequest){
        RegisterAndLoginReturn registerAndLoginReturn = new RegisterAndLoginReturn(false, "", null);
        String name = servletRequest.getParameter("name");
        String firstPassword = servletRequest.getParameter("firstPassword");
        String secondPassword = servletRequest.getParameter("secondPassword");
        String mail = servletRequest.getParameter("mail");
        String image = "//";
        if(userService.selectUserIdByName(name)!= null)
            registerAndLoginReturn.setWarning("用户名已存在");
        else{
            int comparePassword = comparePassword(firstPassword, secondPassword);
            if (comparePassword == 2){
                registerAndLoginReturn.setWarning("两次密码输入不一致");
            }else if(comparePassword == 3){
                registerAndLoginReturn.setWarning("输入密码少于六个字符");
            }else{
                userService.insertUser(new User(name, firstPassword, mail, image));
                registerAndLoginReturn.setIsSuccessful(true);
                int id = userService.selectUserIdByName(name);
                registerAndLoginReturn.setUserVO(makeUserVOById(id));
            }

        }
        return registerAndLoginReturn;
    }

    /**
     * 检测两次输入的密码是否合法
     * @param firstPassword 第一次输入的密码
     * @param secondPassword 第二次输入的密码
     * @return  1：输入合法
     *          2：两次密码不一致
     *          3：输入密码一致，但长度小于6个字符
     */
    private int comparePassword(String firstPassword, String secondPassword){
        if(!firstPassword.equals(secondPassword)){
            return 2;
        }else{
            if(firstPassword.length()<6)
                return 3;
            else
                return 1;
        }
    }

    /**
     * 根据用户id返回该用户的VO对象
     * @param userId 用户id
     * @return UserVO类：存储用户前端交互的用户的所有信息
     */
    private UserVO makeUserVOById(int userId){

        return new UserVO(userService.selectUserById(userId),
                movieService.selectCollectMoviesByUserId(userId),
                commentService.selectCommentsByUserId(userId));
    }

}
