package com.momo.lan.jvm.mapper;

import com.momo.lan.jvm.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

/**
 * @program: jvm
 * @description:
 * @author: zhanghui2018
 * @create: 2019-02-26 11:30
 */
@Mapper
@CacheConfig(cacheNames = "cacheTest")
public interface UserMapper {

    /*
        @Cacheable 对查询结果进行缓存
     */
    @Cacheable
    User getUser(@Param("name") String name);
}
