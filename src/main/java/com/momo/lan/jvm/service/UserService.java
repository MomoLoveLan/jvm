package com.momo.lan.jvm.service;

import com.momo.lan.jvm.entity.User;
import com.momo.lan.jvm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: jvm
 * @description:
 * @author: zhanghui2018
 * @create: 2019-02-26 11:26
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(String name){
        User user = userMapper.getUser(name);
        return user;
    }


}
