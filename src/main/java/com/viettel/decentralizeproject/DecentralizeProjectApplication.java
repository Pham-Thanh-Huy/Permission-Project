package com.viettel.decentralizeproject;

import com.viettel.decentralizeproject.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class DecentralizeProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecentralizeProjectApplication.class, args);
    }

}
