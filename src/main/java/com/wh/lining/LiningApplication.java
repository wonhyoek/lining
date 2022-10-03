package com.wh.lining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class LiningApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiningApplication.class, args);
    }

}
