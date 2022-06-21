package com.nnnu.demo.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nnnu.demo.bean.Car;
import com.nnnu.demo.bean.UserCar;
import com.nnnu.demo.mapper.UserCarMapper;
import com.nnnu.demo.service.UserCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCarServiceImpl implements UserCarService {

    @Autowired
    private UserCarMapper userCarMapper;

    @Override
    public UserCar getUserCarById(int id) {
        return userCarMapper.selectById(id);
    }

    @Override
    public List<UserCar> getUserCar(UserCar userCar) {
        QueryWrapper<UserCar> queryWrapper=new QueryWrapper<>(userCar);
        Page<UserCar> page=new Page<>(userCar.pageIndex,userCar.pageIndex);
        Page<UserCar> rs = userCarMapper.selectPage(page, queryWrapper);
        return rs.getRecords();
    }

    @Override
    public boolean addUserCar(UserCar userCar) {
        int i=userCarMapper.insert(userCar);
        return i>0;
    }

    @Override
    public boolean updateUserCar(UserCar userCar) {
        int i=userCarMapper.updateById(userCar);
        return i>0;
    }

    @Override
    public boolean delUserCar(UserCar userCar) {
        int i=userCarMapper.delete(new QueryWrapper<>(userCar));
        return i>0;
    }

    @Override
    public boolean delUserCarById(int id) {
        int i=userCarMapper.deleteById(id);
        return i>0;
    }
}
