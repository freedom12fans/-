package com.igeek.egobuy;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
//启用swagger
@EnableSwagger2Doc
public class ManagerWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerWebApplication.class, args);
    }
}
