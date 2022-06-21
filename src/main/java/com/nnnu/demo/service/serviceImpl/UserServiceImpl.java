package com.nnnu.demo.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nnnu.demo.bean.Car;
import com.nnnu.demo.bean.User;
import com.nnnu.demo.mapper.UserMapper;
import com.nnnu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> getUser(User user) {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>(user);
        Page<User> page=new Page<>(user.pageIndex,user.pageSize);
        Page<User> rs = userMapper.selectPage(page, queryWrapper);
        return rs.getRecords();
    }

    @Override
    public boolean addUser(User user) {
        int i=userMapper.insert(user);

        return i > 0;

    }

    @Override
    public boolean updateUser(User user) {
        int i=userMapper.updateById(user);
        return i > 0;
    }

    @Override
    public boolean delUser(User user) {
        int i=userMapper.delete(new QueryWrapper<User>(user));
        return i > 0;
    }

    @Override
    public boolean delUserById(int id) {
        int i=userMapper.deleteById(id);
        return i > 0;
    }
}
