package com.example.demosecurityjpa.controller;

import com.example.demosecurityjpa.service.UserService;
import com.example.demosecurityjpa.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String home(Model model){
        model.addAttribute("users", userService.getUsers());
        return "index";
    }



}
