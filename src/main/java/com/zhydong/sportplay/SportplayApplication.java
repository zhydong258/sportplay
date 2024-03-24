package com.zhydong.sportplay;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zhydong.sportplay.dao")
@SpringBootApplication
public class SportplayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportplayApplication.class, args);
    }

}
