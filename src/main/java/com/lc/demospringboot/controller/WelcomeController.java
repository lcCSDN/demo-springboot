package com.lc.demospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: lichao
 * @Date: 2021/5/11 15:33
 * @Descr: $
 */
@Controller
public class WelcomeController {
    @RequestMapping("/")
    public String wecometo(){
        return "/login";
    }
    //
}
