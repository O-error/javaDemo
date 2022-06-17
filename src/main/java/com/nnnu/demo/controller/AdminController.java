package com.nnnu.demo.controller;

import com.nnnu.demo.bean.Admin;
import com.nnnu.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/login")
    public String tologin(Admin admin){
        if(adminService.toLogin(admin)){
            return "index";
        }else {
            return "login";
        }
    }

    @PostMapping("/update")
    public boolean updateAdmin(Admin admin){
        return adminService.updateAdmin(admin);
    }

}
