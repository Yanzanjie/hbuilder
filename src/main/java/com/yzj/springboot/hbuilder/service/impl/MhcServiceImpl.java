package com.yzj.springboot.hbuilder.service.impl;

import com.yzj.springboot.hbuilder.entity.Mhc;
import com.yzj.springboot.hbuilder.mapper.MhcMapper;
import com.yzj.springboot.hbuilder.service.MhcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/11/6
 */

@Service("MhcService")
@Transactional
public class MhcServiceImpl implements MhcService {

    @Autowired
    private MhcMapper mhcMapper;

    @Override
    public List<Mhc> getAllMhc() {
        return mhcMapper.selectAll();
    }
}
