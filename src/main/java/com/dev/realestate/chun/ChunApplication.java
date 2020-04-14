package com.dev.realestate.chun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class ChunApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChunApplication.class, args);
    }

}
