package com.wang.vueuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wang.vueuser.DAO")
public class VueuserApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueuserApplication.class, args);
    }

}
