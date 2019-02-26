package com.momo.lan.jvm.controller;

import com.momo.lan.jvm.entity.User;
import com.momo.lan.jvm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: jvm
 * @description:
 * @author: zhanghui2018
 * @create: 2019-02-26 11:02
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private CacheManager cacheManager;

    @GetMapping("/index")
    public User index(String name){

        return userService.getUser(name);
    }
    @GetMapping("/removeKey")
    public String removeKey(){
        cacheManager.getCache("cacheTest").clear();
        return "success";
    }
}
