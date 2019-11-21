package com.yzj.springboot.hbuilder.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 作者: yzj
 * 日期: 2019/11/10
 */

@Table(name = "ul")
@Data
public class Ul {

    @Id
    private int id;

    private Integer uid;
    private Integer mk;

}
