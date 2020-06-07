package com.itwyf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itwyf.dao")
public class EchartsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EchartsApplication.class, args);
    }

}
