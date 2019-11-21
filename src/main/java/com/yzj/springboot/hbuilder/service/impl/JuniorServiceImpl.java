package com.yzj.springboot.hbuilder.service.impl;

import com.yzj.springboot.hbuilder.entity.Junior;
import com.yzj.springboot.hbuilder.mapper.JuniorMapper;
import com.yzj.springboot.hbuilder.service.JuniorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/11/6
 */

@Service("JuniorService")
@Transactional
public class JuniorServiceImpl implements JuniorService {

    @Autowired
    private JuniorMapper juniorMapper;

    @Override
    public List<Junior> getAllJunior() {
        return juniorMapper.selectAll();
    }
}
