package com.demo.jdk8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})

@EnableScheduling
@ComponentScan(basePackages = {"com.demo.jdk8.**"})
@EnableAsync
public class Jdk8Application {

    public static void main(String[] args) {
        SpringApplication.run(Jdk8Application.class, args);
    }

}
