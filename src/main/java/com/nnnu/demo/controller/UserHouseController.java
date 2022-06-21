package com.nnnu.demo.controller;

import com.nnnu.demo.bean.Result;
import com.nnnu.demo.bean.ResultCode;
import com.nnnu.demo.bean.UserHouse;
import com.nnnu.demo.service.UserHouserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//人房子接口
@RestController
public class UserHouseController {

    @Autowired
    UserHouserService userHouserService;

    //分页查询列表
    @GetMapping("userHouse/list")
    public Result getList(UserHouse UserHouse){
        return new Result(ResultCode.SUCCESS_CODE,userHouserService.getUserHouse(UserHouse));
    }

    //单个id查询
    @GetMapping("userHouse/getById")
    public Result getCar(int id){
        return new Result(ResultCode.SUCCESS_CODE,userHouserService.getUserHouseById(id));
    }

    //添加
    @PostMapping("userHouse/add")
    public Result addCar(UserHouse UserHouse){
        boolean b=userHouserService.addUserHouse(UserHouse);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //修改
    @PostMapping("userHouse/update")
    public Result updateCar(UserHouse UserHouse){
        boolean b=userHouserService.updateUserHouse(UserHouse);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //删除根据id
    @GetMapping("userHouse/deleteByid")
    public Result deleteCarById(int id){
        boolean b=userHouserService.delUserHouseById(id);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //删除根据实体
    @PostMapping("userHouse/deleteByBean")
    public Result deleteCarById(UserHouse UserHouse){
        boolean b=userHouserService.delUserHouse(UserHouse);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

}
