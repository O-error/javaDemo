package com.nnnu.demo.service;

import com.nnnu.demo.bean.Car;

import java.util.List;

public interface CarService {

    Car getCarrById(int id);

    List<Car> getCar(Car car);

    boolean addCar(Car car);

    boolean updateCar(Car car);

    boolean delCar(Car car);

    boolean delCarById(int id);

}
