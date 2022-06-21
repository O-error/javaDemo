package com.nnnu.demo.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nnnu.demo.bean.Car;
import com.nnnu.demo.bean.UserHouse;
import com.nnnu.demo.mapper.UserHouseMapper;
import com.nnnu.demo.service.UserHouserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserHouseServiceImpl implements UserHouserService {

    @Autowired
    private UserHouseMapper userHouseMapper;

    @Override
    public UserHouse getUserHouseById(int id) {
        return userHouseMapper.selectById(id);
    }

    @Override
    public List<UserHouse> getUserHouse(UserHouse userHouse) {

        QueryWrapper<UserHouse> queryWrapper=new QueryWrapper<>(userHouse);
        Page<UserHouse> page=new Page<>(userHouse.pageIndex,userHouse.pageIndex);
        Page<UserHouse> rs = userHouseMapper.selectPage(page, queryWrapper);

        return rs.getRecords();
    }

    @Override
    public boolean addUserHouse(UserHouse userHouse) {
        int i=userHouseMapper.insert(userHouse);
        return i>0;
    }

    @Override
    public boolean updateUserHouse(UserHouse userHouse) {
        int i=userHouseMapper.updateById(userHouse);
        return i>0;
    }

    @Override
    public boolean delUserHouse(UserHouse userHouse) {
        int i=userHouseMapper.delete(new QueryWrapper<>(userHouse));
        return i>0;
    }

    @Override
    public boolean delUserHouseById(int id) {
        int i=userHouseMapper.deleteById(id);
        return i>0;
    }
}
