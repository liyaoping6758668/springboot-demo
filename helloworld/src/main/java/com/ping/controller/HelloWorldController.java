package com.ping.controller;

import com.ping.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author liyaoping
 * @version 1.0
 * @date 2021-2-13 21:37
 */
@RestController
public class HelloWorldController {
    @Autowired
    private ServerSetting serverSetting;

    @RequestMapping("/")
    String home() {
        System.out.println("哈哈111。。。");
        System.out.println("666");
        return serverSetting.toString();
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
