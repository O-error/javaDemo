package com.nnnu.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nnnu.demo.bean.Car;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarMapper extends BaseMapper<Car> {

}
