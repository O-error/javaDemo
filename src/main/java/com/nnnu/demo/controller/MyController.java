package com.nnnu.demo.controller;


import com.nnnu.demo.bean.Admin;
import com.nnnu.demo.bean.Result;
import com.nnnu.demo.bean.ResultCode;
import com.nnnu.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//网站入口接口
@Controller
public class MyController {

    @Autowired
    AdminService adminService;

    //进入登录页面
    @GetMapping("/login")
    public String tologin(){
        return "login";
    }

    //进入首页页面
    @GetMapping("/index")
    public String toIndex(){
        return "index";
    }

}
