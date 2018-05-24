package com.sixth.unidoc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.sixth.unidoc.mapper")
public class UnidocApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnidocApplication.class, args);
    }
}
