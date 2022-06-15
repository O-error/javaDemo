package com.nnnu.demo.service;

import com.nnnu.demo.bean.Admin;

import java.util.List;

public interface AdminService {
    public Admin getAdminById();
    public List<Admin> getAdmin();
}
