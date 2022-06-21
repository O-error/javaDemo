package com.nnnu.demo.service;

import com.nnnu.demo.bean.UserCar;
import java.util.List;

public interface UserCarService {

    UserCar getUserCarById(int id);

    List<UserCar> getUserCar(UserCar userCar);

    boolean addUserCar(UserCar userCar);

    boolean updateUserCar(UserCar userCar);

    boolean delUserCar(UserCar userCar);

    boolean delUserCarById(int id);

}
