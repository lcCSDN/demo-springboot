package com.lc.demospringboot.mapper;

import com.lc.demospringboot.vo.Comsuer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ComsuerMapper {
    int deleteByPrimaryKey(String id);

    int insert(Comsuer record);

    int insertSelective(Comsuer record);

    Comsuer selectByPrimaryKey(String id);

    List<Comsuer> selectComsuerAll();

    int updateByPrimaryKeySelective(Comsuer record);

    int updateByPrimaryKey(Comsuer record);
}