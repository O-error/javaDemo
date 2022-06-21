package com.nnnu.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nnnu.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
