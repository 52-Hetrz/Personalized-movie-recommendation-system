package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RestController
public class UserController {

    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    UserServiceImpl userService;

    @GetMapping("/insertUser")
    @ResponseBody
    public String insertUser(HttpServletRequest servletRequest){
        String userId=servletRequest.getParameter("userId");
        String userName=servletRequest.getParameter("userName");
        String password=servletRequest.getParameter("password");
        String introduction=servletRequest.getParameter("introduction");
        String sex=servletRequest.getParameter("sex");
        String date=simpleDateFormat.format(new Date());
        int a=userService.insertUser(userId,userName,password,introduction,"C://life//image",sex,date);
        return Integer.toString(a);
    }

    @RequestMapping("/deleteUserById")
    @ResponseBody
    public String deleteUserById(HttpServletRequest servletRequest){
        String userId=servletRequest.getParameter("id");
        return Integer.toString(userService.deleteUserById(userId));
    }

    @RequestMapping("/findByUserId")
    @ResponseBody
    public String findByUserId(String id){
        User user=userService.findByUserId(id);
        return user.toString();
    }

    @RequestMapping("/updateIntroduction")
    @ResponseBody
    public String updateIntroduction(HttpServletRequest servletRequest){
        String userId=servletRequest.getParameter("userId");
        String introduction=servletRequest.getParameter("introduction");
        return Integer.toString(userService.updateIntroduction(userId,introduction));
    }

    @RequestMapping("/updatePassword")
    @ResponseBody
    public String updatePassword(HttpServletRequest httpServletRequest){
        String userId=httpServletRequest.getParameter("userId");
        String oldPassword=httpServletRequest.getParameter("oldPassword");
        String newPassword1=httpServletRequest.getParameter("newPassword1");
        String newPassword2=httpServletRequest.getParameter("newPassword2");
        String oldPasswordSql=userService.searchPasswordByUserId(userId);
        if(!oldPassword.equals(oldPasswordSql))
            return "old Password is wrong!";
        if(!newPassword1.equals(newPassword2))
            return "The two passwords don't match!";
        userService.updatePassword(userId,newPassword1);
        return "1";
    }
}
