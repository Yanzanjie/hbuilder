package com.yzj.springboot.hbuilder.service.impl;

import com.yzj.springboot.hbuilder.entity.Uni;
import com.yzj.springboot.hbuilder.mapper.UniMapper;
import com.yzj.springboot.hbuilder.service.UniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/11/6
 */

@Service("UuiService")
@Transactional
public class UniServiceImpl implements UniService {

    @Autowired
    private UniMapper uniMapper;

    @Override
    public List<Uni> getAllUni() {
        return uniMapper.selectAll();
    }
}
