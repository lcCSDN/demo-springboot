package com.lc.demospringboot.login.controller;

import com.lc.demospringboot.login.mapper.OpuUserMapper;
import com.lc.demospringboot.login.utils.ErroMassge;
import com.lc.demospringboot.login.vo.OpuUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @Author: lichao
 * @Date: 2021/5/11 16:11
 * @Descr: $
 */
@Controller
public class LoginController {

    @Autowired
    private OpuUserMapper opuUserMapper;

    private ErroMassge erroMassge;

    @RequestMapping("/login")
    public ModelAndView login(OpuUser user){
        ModelAndView model = new ModelAndView();
        if(user.getUserName() == null || user.getUserName().equals(" ") || user.getPassword()==null || user.getPassword().equals(" ")){
            model.setStatus(HttpStatus.MULTI_STATUS);
            erroMassge.setMassage("用户名或密码不能为空");
            model.addObject(erroMassge);

        }
        OpuUser opuUser = opuUserMapper.selectByNameAndPassword(user.getUserName(),user.getPassword());
        if(opuUser !=null){
            model.addObject(opuUser);
        }else{
            model.addObject(erroMassge);
        }

        model.setViewName("index");
        return model;
    }
    //
}
