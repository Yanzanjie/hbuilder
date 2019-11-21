package com.yzj.springboot.hbuilder.entity;

import lombok.Data;

import javax.persistence.Table;

/**
 * 作者: yzj
 * 日期: 2019/11/10
 */
@Table(name = "dz")
@Data
public class Dz {

    private int id;
    private Integer mk;
    private Integer num;
}
