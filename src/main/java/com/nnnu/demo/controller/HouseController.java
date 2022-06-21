package com.nnnu.demo.controller;

import com.nnnu.demo.bean.House;
import com.nnnu.demo.bean.Result;
import com.nnnu.demo.bean.ResultCode;
import com.nnnu.demo.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//房子接口
@RestController
public class HouseController {

    @Autowired
    HouseService houseService;

    //分页查询列表
    @GetMapping("house/list")
    public Result getList(House house){
        return new Result(ResultCode.SUCCESS_CODE,houseService.getHouse(house));
    }

    //单个id查询
    @GetMapping("house/getById")
    public Result getHouse(int id){
        return new Result(ResultCode.SUCCESS_CODE,houseService.getHouseById(id));
    }

    //添加
    @PostMapping("house/add")
    public Result addHouse(House house){
        boolean b=houseService.addHouse(house);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //修改
    @PostMapping("house/update")
    public Result updateHouse(House house){
        boolean b=houseService.updateHouse(house);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //删除根据id
    @GetMapping("house/deleteByid")
    public Result deleteHouseById(int id){
        boolean b=houseService.delHouseById(id);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

    //删除根据实体
    @PostMapping("house/deleteByBean")
    public Result deleteHouseById(House house){
        boolean b=houseService.delHouse(house);
        if(b){
            return new Result(ResultCode.UNSUCCESS_CODE,null);
        }
        return new Result(ResultCode.SUCCESS_CODE,null);
    }

}
