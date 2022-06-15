package com.nnnu.demo.controller;

import com.nnnu.demo.bean.Admin;
import com.nnnu.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    AdminService adminService;

    /*@GetMapping("index")
    public String toIndex(){
        Admin admins = adminService.getAdminById();
        System.out.println(admins);
        return "index";
    }*/

    @GetMapping("index")
    public String toIndex(){
        System.out.println("111");
        List<Admin> admins = adminService.getAdmin();
        System.out.println(admins.size());
        for (Admin a:admins) {
            System.out.println(a);
        }
        return "index";
    }

}
