package com.yzj.springboot.hbuilder.service;

import com.yzj.springboot.hbuilder.entity.Log;

public interface LogService {

    //    登陆
    int toLogin(Log log);

    //        获取ID
    int getUId(String name);

    //    注册
    int toReg(Log log);
}
