package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: HelloWorld
 * @Author: wangxu
 * @Description:
 * @Date: 2021/2/19 0019 17:14
 * @Version: 1.0
 */
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String helloWorld(){

        return "hello world";
    }
}
