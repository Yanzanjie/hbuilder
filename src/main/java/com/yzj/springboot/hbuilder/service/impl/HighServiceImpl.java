package com.yzj.springboot.hbuilder.service.impl;

import com.yzj.springboot.hbuilder.entity.High;
import com.yzj.springboot.hbuilder.mapper.HighMapper;
import com.yzj.springboot.hbuilder.service.HighService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/11/6
 */

@Service("HighService")
@Transactional
public class HighServiceImpl implements HighService {

    @Autowired
    private HighMapper highMapper;

    @Override
    public List<High> getAllHigh() {
        return highMapper.selectAll();
    }
}
