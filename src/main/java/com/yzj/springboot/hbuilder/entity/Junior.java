package com.yzj.springboot.hbuilder.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 作者: yzj
 * 日期: 2019/11/6
 */
@Table(name = "junior")
@Data
public class Junior {

    @Id
    private int id;

    private String jurl;
    private String jv;
}
