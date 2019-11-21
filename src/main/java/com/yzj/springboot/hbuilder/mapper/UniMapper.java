package com.yzj.springboot.hbuilder.mapper;

import com.yzj.springboot.hbuilder.entity.Uni;
import com.yzj.springboot.hbuilder.mapper.bean.BeanMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/11/6
 */

@Mapper
public interface UniMapper  extends BeanMapper<Uni> {

    List<Uni> getAllUni();
}
