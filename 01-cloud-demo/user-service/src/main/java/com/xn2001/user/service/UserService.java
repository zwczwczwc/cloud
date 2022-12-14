package com.xn2001.user.service;

import com.xn2001.user.mapper.UserMapper;
import com.xn2001.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}