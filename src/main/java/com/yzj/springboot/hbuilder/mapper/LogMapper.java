package com.yzj.springboot.hbuilder.mapper;

import com.yzj.springboot.hbuilder.entity.Log;
import com.yzj.springboot.hbuilder.mapper.bean.BeanMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogMapper extends BeanMapper<Log> {

//    登陆
    int toLogin(Log log);

//        获取ID
    int getUId(String name);

//    注册
    int toReg(Log log);
}
