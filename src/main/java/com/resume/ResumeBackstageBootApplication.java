package com.resume;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.resume.*.mapper")
@EnableAsync
public class ResumeBackstageBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumeBackstageBootApplication.class, args);
    }

}
