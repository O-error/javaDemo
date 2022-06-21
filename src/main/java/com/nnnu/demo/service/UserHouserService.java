package com.nnnu.demo.service;


import com.nnnu.demo.bean.UserHouse;

import java.util.List;

public interface UserHouserService {

    UserHouse getUserHouseById(int id);

    List<UserHouse> getUserHouse(UserHouse userHouse);

    boolean addUserHouse(UserHouse userHouse);

    boolean updateUserHouse(UserHouse userHouse);

    boolean delUserHouse(UserHouse userHouse);

    boolean delUserHouseById(int id);

}
