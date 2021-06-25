package com.example.demo.dao;

/**
 * @ClassName ClassificatonName
 * @Description
 * @Author Life
 * @Date 2021/6/25 10:42
 * @Version 1.0
 */


public class ClassificatonName {
    private int classifid;
    private String name;

    ClassificatonName(int classifid, String name){
        setClassifid(classifid);
        setName(name);
    }

    public int getClassifid() {
        return classifid;
    }

    public void setClassifid(int classifid) {
        this.classifid = classifid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
