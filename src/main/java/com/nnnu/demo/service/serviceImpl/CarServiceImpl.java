package com.nnnu.demo.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nnnu.demo.bean.Car;
import com.nnnu.demo.bean.User;
import com.nnnu.demo.mapper.CarMapper;
import com.nnnu.demo.mapper.UserMapper;
import com.nnnu.demo.service.CarService;
import com.nnnu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Override
    public Car getCarrById(int id) {
        return carMapper.selectById(id);
    }

    //分页
    @Override
    public List<Car> getCar(Car car) {

        QueryWrapper<Car> queryWrapper=new QueryWrapper<>(car);
        Page<Car> page=new Page<>(car.pageIndex,car.pageIndex);
        Page<Car> rs = carMapper.selectPage(page, queryWrapper);
        return rs.getRecords();
    }

    @Override
    public boolean addCar(Car car) {
        int i=carMapper.insert(car);
        return i>0;
    }

    @Override
    public boolean updateCar(Car car) {
        int i=carMapper.updateById(car);
        return i>0;
    }

    @Override
    public boolean delCar(Car car) {
        int i=carMapper.delete(new QueryWrapper<Car>(car));
        return i>0;
    }

    @Override
    public boolean delCarById(int id) {
        int i=carMapper.deleteById(id);
        return i>0;
    }
}
