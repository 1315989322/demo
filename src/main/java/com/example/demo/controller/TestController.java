package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: TestController
 * @Author: wangxu
 * @Description:
 * @Date: 2021/2/20 0020 9:29
 * @Version: 1.0
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String  test(){
        System.out.println("success");
        return "test success";
    }
}
