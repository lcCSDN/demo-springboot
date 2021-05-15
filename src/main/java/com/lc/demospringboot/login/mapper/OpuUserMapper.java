package com.lc.demospringboot.login.mapper;

import com.lc.demospringboot.login.vo.OpuUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface OpuUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(OpuUser record);

    int insertSelective(OpuUser record);

    OpuUser selectByPrimaryKey(String id);

    OpuUser selectByNameAndPassword(String userName,String password);

    int updateByPrimaryKeySelective(OpuUser record);

    int updateByPrimaryKey(OpuUser record);
}