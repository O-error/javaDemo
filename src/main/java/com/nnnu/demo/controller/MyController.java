package com.nnnu.demo.controller;

import com.nnnu.demo.bean.Admin;
import com.nnnu.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @Autowired
    AdminService adminService;

    @GetMapping("toLogin")
    public String toLogin(){
        return "index";
    }

    @GetMapping("index")
    public String toIndex(){
        return "index";
    }
    @GetMapping("Login")
    public String Login(){return "login";}

}
