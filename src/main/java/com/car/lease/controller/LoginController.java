package com.car.lease.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: yanghaojie 31648
 * @date: 2020/8/7 9:46
 */

@RestController
@RequestMapping("login")
public class LoginController {


    @RequestMapping("toLogin")
    public ModelAndView toLogin(ModelAndView modelAndView){
        modelAndView.setViewName("sys/mian/login");
        return modelAndView;
    }
}
