package com.nnnu.demo.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    @TableId
    private Integer id;
    @TableField
    private String name;
    @TableField
    private String sex;
    @TableField
    private String age;
    @TableField
    private String idcard;
    @TableField
    private String phone;
}
