package com.yoyo;

import com.yoyo.handler.StudentRestController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@RestController
@MapperScan("com.yoyo.mappers")
public class HelloApp {
    @RequestMapping("/index")
    public String index(){
        return "qwe";
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloApp.class,args);
        System.out.print("Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!");
    }
}
