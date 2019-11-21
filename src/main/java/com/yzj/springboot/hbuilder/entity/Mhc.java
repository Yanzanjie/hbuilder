package com.yzj.springboot.hbuilder.entity;

import lombok.Data;

import javax.persistence.Table;

/**
 * 作者: yzj
 * 日期: 2019/11/6
 */
@Table(name = "mhc")
@Data
public class Mhc {

    private int id;
    private String msrc;
    private String murl;
}
