package com.example.demo.mapper;


import com.example.demo.dao.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Mapper
@ResponseBody
public interface MovieMapper {
    ArrayList<Movie> selectCollectMoviesByUserId(int userId);
    String selectMovieNameById(int id);
}
