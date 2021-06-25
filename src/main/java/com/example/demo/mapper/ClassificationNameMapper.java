package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClassificationNameMapper {

    String selectClassificationName(int classifid);
}
