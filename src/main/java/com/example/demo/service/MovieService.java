package com.example.demo.service;


import com.example.demo.VO.MovieVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface MovieService {
    /**
     * 根据用户id选取用户收藏的电影
     * @param userId 用户id
     * @return ArrayList<MovieVO>:存储着该用户收藏的电影
     */
    ArrayList<MovieVO> searchCollectMoviesByUserId(int userId);

    /**
     * 根据电影id查找电影名称
     * @param id 电影id
     * @return String：电影名
     */
    String searchMovieNameById(int id);

    /**
     * 根据电影id查找电影
     * @param id 电影id
     * @return MovieVO：存储该电影信息的MovieVO对象
     */
    MovieVO selectMovieById(int id);

}
