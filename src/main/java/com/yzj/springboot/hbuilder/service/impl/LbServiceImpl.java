package com.yzj.springboot.hbuilder.service.impl;

import com.yzj.springboot.hbuilder.entity.Lb;
import com.yzj.springboot.hbuilder.mapper.LbMapper;
import com.yzj.springboot.hbuilder.service.LbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/11/5
 */

@Service("LbService")
@Transactional
public class LbServiceImpl implements LbService {

    @Autowired
    private LbMapper lbMapper;

    @Override
    public List<Lb> getToAll() {
        return lbMapper.selectAll();
    }
}
