package com.example.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 罗亚龙
 * @date 2022/2/11 11:32
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public Object test(String str){
        if (str == null || "".equals(str)){
            return "nothing to do";
        }
        return "start doing : " + str;
    }
}
