package com.yzj.springboot.hbuilder.service.impl;

import com.yzj.springboot.hbuilder.entity.User;
import com.yzj.springboot.hbuilder.mapper.UserMapper;
import com.yzj.springboot.hbuilder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/11/6
 */

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAll();
    }
}
