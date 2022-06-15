package com.nnnu.demo.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("house")
public class House {
    @TableId
    private Integer id;
    @TableField
    private String size;
    @TableField
    private String vrurl;
    @TableField
    private String address;
}
