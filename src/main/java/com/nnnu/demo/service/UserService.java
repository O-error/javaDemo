package com.nnnu.demo.service;

import com.nnnu.demo.bean.User;

import java.util.List;

public interface UserService {

    public User getUser(User user);

    public User getUserById(int id);

    public List<User> getUser();

    public boolean addUser(User user);

    public boolean updateUser(User user);

    public boolean delUser(User user);

    public boolean delUserById(int id);

}
