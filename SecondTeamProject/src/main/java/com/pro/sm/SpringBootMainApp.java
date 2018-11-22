package com.pro.sm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * className:SpringBootMainApp
 * discription:
 * author:sjq
 * createTime:2018-11-20 18:50
 */
@SpringBootApplication
@MapperScan("com.pro.sm.dao")
public class SpringBootMainApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMainApp.class);
    }
}
