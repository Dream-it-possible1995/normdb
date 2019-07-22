package com.glodon.normdb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.glodon.normdb.dao")
public class NormdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(NormdbApplication.class, args);
    }

}
