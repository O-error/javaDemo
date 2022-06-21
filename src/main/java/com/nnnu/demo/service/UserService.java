package com.nnnu.demo.service;

import com.nnnu.demo.bean.User;

import java.util.List;

public interface UserService {


    User getUserById(int id);

    List<User> getUser(User user);

    boolean addUser(User user);

    boolean updateUser(User user);

    boolean delUser(User user);

    boolean delUserById(int id);

}
