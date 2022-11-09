package com.example.eksa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients
public class EksAApplication {

    public static void main(String[] args) {
        SpringApplication.run(EksAApplication.class, args);
    }

}
