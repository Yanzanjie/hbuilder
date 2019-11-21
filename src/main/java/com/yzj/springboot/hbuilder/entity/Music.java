package com.yzj.springboot.hbuilder.entity;

import lombok.Data;

import javax.persistence.Table;

/**
 * 作者: yzj
 * 日期: 2019/11/6
 */
@Table(name = "music")
@Data
public class Music {

    private int id;
    private String murl;
}
