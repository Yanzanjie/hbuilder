package com.yzj.springboot.hbuilder.mapper;

import com.yzj.springboot.hbuilder.entity.Dz;
import com.yzj.springboot.hbuilder.mapper.bean.BeanMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DzMapper extends BeanMapper<Dz> {

    List<Dz> findAllDz();
}
