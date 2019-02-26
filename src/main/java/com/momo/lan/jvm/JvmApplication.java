package com.momo.lan.jvm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.momo.lan.jvm.mapper")
@EnableCaching //开启缓存的注解
public class JvmApplication {

    public static void main(String[] args) {
        SpringApplication.run(JvmApplication.class, args);
    }

}
