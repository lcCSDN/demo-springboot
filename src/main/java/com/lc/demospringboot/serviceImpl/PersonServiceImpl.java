package com.lc.demospringboot.serviceImpl;

import com.lc.demospringboot.interfaces.PersonService;
import com.lc.demospringboot.mapper.PersonMapper;
import com.lc.demospringboot.vo.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lichao
 * @Date: 2021/5/8 14:42
 * @Descr: $
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public Persons getPerson() {

        Persons persons = personMapper.selectByPrimaryKey("1");

        return persons;
    }
    //
}
