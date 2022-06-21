package com.nnnu.demo.controller;

import com.nnnu.demo.bean.Admin;
import com.nnnu.demo.bean.Result;
import com.nnnu.demo.bean.ResultCode;
import com.nnnu.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//系统用户接口
@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    //登录验证
    @PostMapping("/toLogin")
    public Result toLogin(Admin admin){
        if(adminService.toLogin(admin)){
            return new Result(ResultCode.SUCCESS_CODE,admin);
        }else{
            return new Result(ResultCode.UNSUCCESS_CODE,admin);
        }
    }

    //添加用户
    @PostMapping("admin/add")
    public Result addAdmin(Admin admin){
        if(adminService.addAdmin(admin)){
            return new Result(ResultCode.SUCCESS_CODE,null);
        }
        return new Result(ResultCode.UNSUCCESS_CODE,null);
    }

    //修改用户
    @PostMapping("admin/update")
    public Result updateAdmin(Admin admin){
        if(adminService.updateAdmin(admin)){
            return new Result(ResultCode.SUCCESS_CODE,null);
        }
        return new Result(ResultCode.UNSUCCESS_CODE,null);
    }

}
