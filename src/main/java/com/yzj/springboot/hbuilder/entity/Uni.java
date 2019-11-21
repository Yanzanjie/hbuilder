package com.yzj.springboot.hbuilder.entity;

import lombok.Data;

import javax.persistence.Table;

/**
 * 作者: yzj
 * 日期: 2019/11/6
 */
@Table(name = "uni")
@Data
public class Uni {

    private int id;
    private String uurl;
    private String uv;
}
