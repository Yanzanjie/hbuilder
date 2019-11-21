package com.yzj.springboot.hbuilder.service.impl;

import com.yzj.springboot.hbuilder.entity.Dz;
import com.yzj.springboot.hbuilder.mapper.DzMapper;
import com.yzj.springboot.hbuilder.service.DzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/11/10
 */

@Service("DzService")
@Transactional
public class DzServiceImpl implements DzService {

    @Autowired
    private DzMapper dzMapper;


    @Override
    public List<Dz> findAllDz() {
        return dzMapper.selectAll();
    }

}
