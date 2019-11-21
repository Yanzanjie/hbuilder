package com.yzj.springboot.hbuilder.entity;

import lombok.Data;

import javax.persistence.Table;

/**
 * 作者: yzj
 * 日期: 2019/11/6
 */
@Table(name = "user")
@Data
public class User {

    private int id;
    private String infor;
    private String name;
    private String phone;
}
