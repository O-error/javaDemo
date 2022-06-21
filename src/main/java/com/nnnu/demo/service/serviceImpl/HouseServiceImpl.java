package com.nnnu.demo.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nnnu.demo.bean.Car;
import com.nnnu.demo.bean.House;
import com.nnnu.demo.mapper.HouseMapper;
import com.nnnu.demo.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseMapper;


    @Override
    public House getHouseById(int id) {
        return houseMapper.selectById(id);
    }

    @Override
    public List<House> getHouse(House house) {
        QueryWrapper<House> queryWrapper=new QueryWrapper<>(house);
        Page<House> page=new Page<>(house.pageIndex,house.pageIndex);
        Page<House> rs = houseMapper.selectPage(page, queryWrapper);
        return rs.getRecords();
    }

    @Override
    public boolean addHouse(House house) {
        int i=houseMapper.insert(house);
        return i>0;
    }

    @Override
    public boolean updateHouse(House house) {
        int i=houseMapper.updateById(house);
        return i>0;
    }

    @Override
    public boolean delHouse(House house) {
        int i=houseMapper.delete(new QueryWrapper<House>(house));
        return i>0;
    }

    @Override
    public boolean delHouseById(int id) {
        int i=houseMapper.deleteById(id);
        return i>0;
    }
}
