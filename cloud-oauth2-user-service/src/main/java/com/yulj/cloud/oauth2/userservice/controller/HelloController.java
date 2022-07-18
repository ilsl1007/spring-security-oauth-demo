package com.yulj.cloud.oauth2.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description <h1>匿名访问控制器</h1>
 * @Author yulj
 * @Date 2022/07/18 15:18
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

}
