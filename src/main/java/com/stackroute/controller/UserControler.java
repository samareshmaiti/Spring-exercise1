package com.stackroute.controller;

import com.stackroute.module.User;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class UserControler {
    @RequestMapping("/")
    public ModelAndView sendMessage() {
        com.stackroute.module.User user= new User();
        user.setName("Samaresh");
        ModelAndView modelAndView= new ModelAndView("index");
        modelAndView.addObject("message",user.getName()+" Welcome to Stackroute!!!");
        return modelAndView;
    }
    }

