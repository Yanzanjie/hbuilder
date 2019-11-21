package com.yzj.springboot.hbuilder.mapper;

import com.yzj.springboot.hbuilder.entity.Junior;
import com.yzj.springboot.hbuilder.mapper.bean.BeanMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JuniorMapper extends BeanMapper<Junior> {
    List<Junior> getAllJunior();
}
