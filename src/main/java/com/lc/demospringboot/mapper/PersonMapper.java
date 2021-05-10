package com.lc.demospringboot.mapper;

import com.lc.demospringboot.vo.Persons;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PersonMapper {
    int deleteByPrimaryKey(String id);

    int insert(Persons record);

    int insertSelective(Persons record);

    Persons selectByPrimaryKey(@Param("id") String id);

    int updateByPrimaryKeySelective(Persons record);

    int updateByPrimaryKey(Persons record);
}