package com.nnnu.demo.controller;

import com.nnnu.demo.bean.Car;
import com.nnnu.demo.bean.Result;
import com.nnnu.demo.bean.ResultCode;
import com.nnnu.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//车接口
@RestController
public class CarController {

    @Autowired
    CarService carService;

    //分页查询列表
    @GetMapping("car/list")
    public Result getList(Car car){
        return new Result(ResultCode.SUCCESS_CODE,carService.getCar(car));
    }

    //单个id查询
    @GetMapping("car/getById")
    public Result getCar(int id){
        return new Result(ResultCode.SUCCESS_CODE,carService.getCarrById(id));
    }

    //添加
    @PostMapping("car/add")
    public Result addCar(Car car){
        boolean b=carService.addCar(car);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //修改
    @PostMapping("car/update")
    public Result updateCar(Car car){
        boolean b=carService.updateCar(car);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //删除根据id
    @GetMapping("car/deleteByid")
    public Result deleteCarById(int id){
        boolean b=carService.delCarById(id);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //删除根据实体
    @PostMapping("car/deleteByBean")
    public Result deleteCarById(Car car){
        boolean b=carService.delCar(car);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

}
