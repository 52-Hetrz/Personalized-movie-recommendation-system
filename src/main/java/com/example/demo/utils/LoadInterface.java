package com.example.demo.utils;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoadInterface {

    @GetMapping("/test")
    public String test(){
        return "test";
    }


}
