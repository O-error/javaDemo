package com.nnnu.demo.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user_car")
public class UserCar {
    @TableId
    private Integer id;
    @TableField
    private Integer uid;
    @TableField
    private Integer cid;
    @TableField
    private Date time;
}
