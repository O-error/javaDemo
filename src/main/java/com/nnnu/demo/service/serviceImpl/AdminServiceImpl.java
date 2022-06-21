package com.nnnu.demo.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
    public boolean toLogin(Admin admin) {
        Admin a=adminMapper.selectOne(new QueryWrapper<Admin>(admin).eq("name",admin.getName())
                .eq("password",admin.getPassword()));
        return null != a;
    }

    @Override
    public Admin getAdminById(int id) {
        return adminMapper.selectById(id);
    }

    @Override
    public List<Admin> getAdmin() {
        return adminMapper.selectList(null);
    }

    @Override
    public boolean addAdmin(Admin admin) {
        int i=adminMapper.insert(admin);
        return i>0;
    }

    @Override
    public boolean updateAdmin(Admin admin) {
        int i=adminMapper.updateById(admin);
        return i>0;
    }

    @Override
    public boolean delAdmin(Admin admin) {
        int i = adminMapper.deleteById(admin);
        return i>0;
    }
}
