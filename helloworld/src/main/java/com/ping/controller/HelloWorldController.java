package com.ping.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyaoping
 * @version 1.0
 * @date 2021-2-13 21:37
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
