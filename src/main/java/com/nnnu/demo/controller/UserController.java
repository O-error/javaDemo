package com.nnnu.demo.controller;

import com.nnnu.demo.bean.Result;
import com.nnnu.demo.bean.ResultCode;
import com.nnnu.demo.bean.User;
import com.nnnu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//人口信息接口
@RestController
public class UserController {

    @Autowired
    UserService userService;

    //分页查询列表
    @GetMapping("user/list")
    public Result getList(User user){
        return new Result(ResultCode.SUCCESS_CODE,userService.getUser(user));
    }

    //单个id查询
    @GetMapping("user/getById")
    public Result getCar(int id){
        return new Result(ResultCode.SUCCESS_CODE,userService.getUserById(id));
    }

    //添加
    @PostMapping("user/add")
    public Result addCar(User user){
        boolean b=userService.addUser(user);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //修改
    @PostMapping("user/update")
    public Result updateCar(User user){
        boolean b=userService.updateUser(user);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //删除根据id
    @GetMapping("user/deleteByid")
    public Result deleteCarById(int id){
        boolean b=userService.delUserById(id);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //删除根据实体
    @PostMapping("user/deleteByBean")
    public Result deleteCarById(User user){
        boolean b=userService.delUser(user);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

}
