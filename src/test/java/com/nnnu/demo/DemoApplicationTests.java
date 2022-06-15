package com.nnnu.demo;

import com.nnnu.demo.bean.Admin;
import com.nnnu.demo.mapper.AdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    AdminMapper adminMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void textAdmin(){
        List<Admin> admins = adminMapper.selectList(null);
        for (Admin a:admins) {
            System.out.println(a);
        }
    }

}
