package com.example.demo.controller;

import com.example.demo.VO.MovieVO;
import com.example.demo.service.impl.MovieServiceImpl;
import org.aspectj.weaver.patterns.HasThisTypePatternTriedToSneakInSomeGenericOrParameterizedTypePatternMatchingStuffAnywhereVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * @ClassName MovieController
 * @Description
 * @Author Life
 * @Date 2021/6/23 15:11
 * @Version 1.0
 */


@Controller
@RestController
public class MovieController {

    @Autowired
    MovieServiceImpl movieService;

    /**
     * 根据前端传递的电影id，返回电影的数据
     * @param httpServletRequest
     * @return
     */
    @GetMapping("/searchMovieById")
    @ResponseBody
    public MovieVO searchMoveById(HttpServletRequest httpServletRequest){
        String movieId = httpServletRequest.getParameter("id");
        return movieService.selectMovieById(Integer.parseInt(movieId));
    }

    @GetMapping("/fuzzySearchMovieByName")
    @ResponseBody
    public ArrayList<MovieVO> fuzzySearchMovieByName(HttpServletRequest httpServletRequest){
        String content = httpServletRequest.getParameter("content");
        return movieService.fuzzySearchMovieByName(content);
    }

}
