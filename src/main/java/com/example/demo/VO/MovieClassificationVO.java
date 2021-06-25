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
    private int classificationId;
    private String name;
    private ArrayList<MovieVO> movieList;

    public MovieClassificationVO(int classificationId, String name, ArrayList<MovieVO> movieList){
        setClassificationId(classificationId);
        setMovieList(movieList);
        setName(name);
    }

    public int getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(int classificationId) {
        this.classificationId = classificationId;
    }

    public ArrayList<MovieVO> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<MovieVO> movieList) {
        this.movieList = movieList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
