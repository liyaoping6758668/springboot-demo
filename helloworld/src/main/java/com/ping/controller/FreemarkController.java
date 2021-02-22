package com.ping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liyaoping
 * @version 1.0
 * @date 2021-2-22 13:51
 */
@Controller
public class FreemarkController {

    @RequestMapping("/freemark")
    public String testFtl(){
        System.out.println("使用freemark模板");
        return "fm/index";
    }
}
