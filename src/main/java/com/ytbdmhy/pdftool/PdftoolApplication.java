package com.ytbdmhy.pdftool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ytbdmhy.pdftool.dao")
public class PdftoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(PdftoolApplication.class, args);
    }

}
