package com.yzj.springboot.hbuilder.mapper;

import com.yzj.springboot.hbuilder.entity.Mhc;
import com.yzj.springboot.hbuilder.mapper.bean.BeanMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MhcMapper extends BeanMapper<Mhc> {

    List<Mhc> getAllMhc();
}
