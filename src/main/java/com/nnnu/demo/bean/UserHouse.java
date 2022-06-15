package com.nnnu.demo.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user_house")
public class UserHouse {
    @TableId
    private Integer id;
    @TableField
    private Integer uid;
    @TableField
    private Integer hid;
    @TableField
    private Date time;
    @TableField
    private String type;

}
