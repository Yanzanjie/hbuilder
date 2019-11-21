package com.yzj.springboot.hbuilder.mapper;

import com.yzj.springboot.hbuilder.entity.User;
import com.yzj.springboot.hbuilder.mapper.bean.BeanMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BeanMapper<User> {

    List<User> getAllUser();
}
