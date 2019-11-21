package com.yzj.springboot.hbuilder.service.impl;

import com.yzj.springboot.hbuilder.entity.Music;
import com.yzj.springboot.hbuilder.mapper.MusicMapper;
import com.yzj.springboot.hbuilder.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/11/6
 */

@Service("MusicService")
@Transactional
public class MusicServiceImpl implements MusicService {

    @Autowired
    private MusicMapper musicMapper;

    @Override
    public List<Music> getAllMusic() {
        return musicMapper.selectAll();
    }
}
