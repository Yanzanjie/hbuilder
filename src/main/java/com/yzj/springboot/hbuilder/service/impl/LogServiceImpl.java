package com.yzj.springboot.hbuilder.service.impl;

import com.yzj.springboot.hbuilder.entity.Log;
import com.yzj.springboot.hbuilder.mapper.LogMapper;
import com.yzj.springboot.hbuilder.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 作者: yzj
 * 日期: 2019/11/10
 */

@Service("LogService")
@Transactional
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

    @Override
    public int toLogin(Log log) {
        return logMapper.selectCount(log);
    }

    @Override
    public int getUId(String name) {
        return logMapper.getUId(name);
    }

    @Override
    public int toReg(Log log) {
        return logMapper.insert(log);
    }
}
