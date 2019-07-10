package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/say")
    public String sayHello(){
        int i = 1 / 0;

        return "hello"+port;
    }

    public static void main(String[] args) {
        System.out.println(Ac1.log.name());
    }

    enum Ac1{
        log,
    }
}
