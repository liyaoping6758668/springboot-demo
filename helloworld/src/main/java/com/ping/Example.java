package com.ping;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan
public class Example {

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}