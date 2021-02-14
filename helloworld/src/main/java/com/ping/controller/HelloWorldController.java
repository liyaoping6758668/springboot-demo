package com.ping.controller;

import com.ping.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author liyaoping
 * @version 1.0
 * @date 2021-2-13 21:37
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/testJson")
    public User printJson(){
        return new User(1111,"liyaoping",new Date());
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/uploadview")
    public String uploadview(){
        return "upload";
    }
}
