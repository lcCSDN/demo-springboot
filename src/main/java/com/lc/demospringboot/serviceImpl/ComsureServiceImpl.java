package com.lc.demospringboot.serviceImpl;

import com.lc.demospringboot.interfaces.ComsureService;
import com.lc.demospringboot.mapper.ComsuerMapper;
import com.lc.demospringboot.vo.Comsuer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lichao
 * @Date: 2021/5/11 14:56
 * @Descr: $
 */
@Service
public class ComsureServiceImpl implements ComsureService {

    @Autowired
    private ComsuerMapper comsuerMapper;

    @Override
    public List<Comsuer> getComsuers() {

        List<Comsuer> lists = comsuerMapper.selectComsuerAll();
        return lists;
    }

    //
}
