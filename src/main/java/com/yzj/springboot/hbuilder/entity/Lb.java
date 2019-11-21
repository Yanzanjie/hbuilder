package com.yzj.springboot.hbuilder.entity;

import lombok.Data;

import javax.persistence.Table;

/**
 * 作者: yzj
 * 日期: 2019/11/5
 */
@Table(name = "lb")
@Data
public class Lb {

    private int id;
    private String lbsrc;

}
