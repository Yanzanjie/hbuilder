package com.yzj.springboot.hbuilder.mapper;


import com.yzj.springboot.hbuilder.entity.Music;
import com.yzj.springboot.hbuilder.mapper.bean.BeanMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MusicMapper extends BeanMapper<Music> {


    List<Music> getAllMusic();
}
