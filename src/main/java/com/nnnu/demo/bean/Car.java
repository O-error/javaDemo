package com.nnnu.demo.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("car")
public class Car {
    @TableId
    private Integer id;
    @TableField
    private String card;
    @TableField
    private String type;
    @TableField
    private String state;
}
