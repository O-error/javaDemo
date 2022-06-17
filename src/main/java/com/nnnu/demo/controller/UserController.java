package com.nnnu.demo.controller;

import com.nnnu.demo.bean.Admin;
import com.nnnu.demo.bean.Result;
import com.nnnu.demo.bean.User;
import com.nnnu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list")
    public Result tologin(User user){
        Result result=new Result();
        List<User> list=userService.getUser();
        result.setBean(list);
        return result;
    }

    /*@PostMapping("/update")*/
    /*public boolean updateAdmin(Admin admin){
        return adminService.updateAdmin(admin);
    }*/

}
