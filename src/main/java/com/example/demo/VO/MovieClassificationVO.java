package com.example.demo.VO;

import java.util.ArrayList;

/**
 * @ClassName MovieClassificationVO
 * @Description
 * @Author Life
 * @Date 2021/6/22 15:10
 * @Version 1.0
 */


public class MovieClassificationVO {
    private int typeId;
    private ArrayList<MovieVO> movieList;

    public MovieClassificationVO(int typeId, ArrayList<MovieVO> movieList){
        setTypeId(typeId);
        setMovieList(movieList);
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public ArrayList<MovieVO> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<MovieVO> movieList) {
        this.movieList = movieList;
    }
}
