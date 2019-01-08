package com.five.animailss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(value = "com.five.animailss.mapper")
@ServletComponentScan
@SpringBootApplication
@ComponentScan(basePackages={"com"})
public class AnimailssApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnimailssApplication.class, args);
    }

}

