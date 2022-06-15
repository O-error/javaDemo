package com.nnnu.demo.service;

import com.nnnu.demo.bean.Admin;

import java.util.List;

public interface AdminService {

    public boolean toLogin(Admin admin);

    public Admin getAdminById(int id);

    public List<Admin> getAdmin();

    public boolean addAdmin(Admin admin);

    public boolean updateAdmin(Admin admin);

    public boolean delAdmin(Admin admin);

}
