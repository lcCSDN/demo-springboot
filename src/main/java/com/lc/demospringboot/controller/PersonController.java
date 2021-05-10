package com.lc.demospringboot.controller;

import com.lc.demospringboot.interfaces.PersonService;
import com.lc.demospringboot.vo.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: lichao
 * @Date: 2021/5/8 14:29
 * @Descr: $
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/getPerson")
    public void getPerson(){

        Persons persons = personService.getPerson();
        System.out.println(persons);
    }
    //
}
