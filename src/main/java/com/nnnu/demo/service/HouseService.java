package com.nnnu.demo.service;

import com.nnnu.demo.bean.House;

import java.util.List;

public interface HouseService {

    House getHouseById(int id);

    List<House> getHouse(House house);

    boolean addHouse(House house);

    boolean updateHouse(House house);

    boolean delHouse(House house);

    boolean delHouseById(int id);

}
