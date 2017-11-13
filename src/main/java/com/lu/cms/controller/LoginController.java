/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lu.cms.controller;

import com.lu.cms.model.User;
import com.lu.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author huanlu
 */
@Controller
@RequestMapping("/")
public class LoginController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "/login";
    }
    
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){
        return "home";
    }
    
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ModelAndView checkLogin(@RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password) {
        System.out.println("com.lu.cms.controller.LoginController.checkLogin()" + username + password);
        ModelAndView mv = new ModelAndView();
        if (username != null || username.equals("")) {
            User user = userService.selectByUsernameAndPassword(username, password);
            mv.addObject("currentUser", user)
                    .setViewName("/home");
        }
        return mv;
    }
}
