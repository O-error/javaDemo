package com.nnnu.demo.service.serviceImpl;

import com.nnnu.demo.bean.Admin;
import com.nnnu.demo.mapper.AdminMapper;
import com.nnnu.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin getAdminById() {
        return adminMapper.selectById("1");
    }

    @Override
    public List<Admin> getAdmin() {
        return adminMapper.selectList(null);
    }
}
