package com.yzj.springboot.hbuilder.service.impl;

import com.yzj.springboot.hbuilder.mapper.UlMapper;
import com.yzj.springboot.hbuilder.service.UlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 作者: yzj
 * 日期: 2019/11/11
 */

@Service("UlService")
@Transactional
public class UlServiceImpl implements UlService {

    @Autowired
    private UlMapper ulMapper;

    @Override
    public int getLikeById(int uid) {
        return ulMapper.getLikeById(uid);
    }

    @Override
    public int findCount() {
        return ulMapper.findCount();
    }

    @Override
    public void findDelDz(int uid) {
        ulMapper.findDelDz(uid);
    }

    @Override
    public void findAddDz(int uid) {
        ulMapper.findAddDz(uid);
    }
}
