package com.yzj.springboot.hbuilder.mapper;

import com.yzj.springboot.hbuilder.entity.Lb;
import com.yzj.springboot.hbuilder.mapper.bean.BeanMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LbMapper extends BeanMapper<Lb> {

    List<Lb> getToAll();
}
