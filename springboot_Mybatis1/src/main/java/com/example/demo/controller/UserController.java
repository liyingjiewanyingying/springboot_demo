package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

//    @RequestMapping("/findAll")
//    public ModelAndView findAll(){
//        ModelAndView mv = new ModelAndView();
//
//        List<User> users = service.findAll();
//
//        mv.addObject("userList",users);
//
//        return mv;
//    }

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){
//        ModelAndView mv = new ModelAndView();

        List<User> users = service.findAll();

//        mv.addObject("userList",users);
        StringBuilder sb = new StringBuilder();
        for (User user : users){
            sb.append(user);
        }

        return sb.toString();
    }

}
