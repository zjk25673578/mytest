package com.test.mytest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.chenva.*.dao")
@ComponentScan({"com.chenva"})
public class MytestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MytestApplication.class, args);
    }

}

