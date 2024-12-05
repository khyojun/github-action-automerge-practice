package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.security.servlet.ApplicationContextRequestMatcher;
import org.springframework.context.annotation.Bean;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {
    //

    @Bean
    ApplicationRunner applicationRunner(){
        return args ->{
            HashMap<String, Integer> map = new HashMap<>();
            map.entrySet().stream().
                    sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder())).
        };
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
