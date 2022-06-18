package com.nnnu.demo.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
    public User getUser(User user) {

        return userMapper.selectOne(new QueryWrapper<User>(user));
    }

    @Override
    public User getUserById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> getUser() {
        return userMapper.selectList(null);
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
