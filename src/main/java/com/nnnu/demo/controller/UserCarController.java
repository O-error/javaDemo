package com.nnnu.demo.controller;

import com.nnnu.demo.bean.Result;
import com.nnnu.demo.bean.ResultCode;
import com.nnnu.demo.bean.UserCar;
import com.nnnu.demo.service.UserCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//人车接口
@RestController
public class UserCarController {

    @Autowired
    UserCarService userCarService;

    //分页查询列表
    @GetMapping("userCar/list")
    public Result getList(UserCar userCar){
        return new Result(ResultCode.SUCCESS_CODE,userCarService.getUserCar(userCar));
    }

    //单个id查询
    @GetMapping("userCar/getById")
    public Result getCar(int id){
        return new Result(ResultCode.SUCCESS_CODE,userCarService.getUserCarById(id));
    }

    //添加
    @PostMapping("userCar/add")
    public Result addCar(UserCar userCar){
        boolean b=userCarService.addUserCar(userCar);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //修改
    @PostMapping("userCar/update")
    public Result updateCar(UserCar userCar){
        boolean b=userCarService.updateUserCar(userCar);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //删除根据id
    @GetMapping("userCar/deleteByid")
    public Result deleteCarById(int id){
        boolean b=userCarService.delUserCarById(id);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //删除根据实体
    @PostMapping("userCar/deleteByBean")
    public Result deleteCarById(UserCar userCar){
        boolean b=userCarService.delUserCar(userCar);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

}
