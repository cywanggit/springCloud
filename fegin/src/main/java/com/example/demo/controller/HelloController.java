package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @copyright (C),  2019-2019, 创蓝253
 * @Description qaq
 * @FileName HelloController
 * @auther cw
 * @create 2019-10-19 10:40
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;


    @RequestMapping("/hello")
    public String hello(){
        return helloService.helloSay();
    }

}
