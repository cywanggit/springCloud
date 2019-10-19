package com.example.demo.service.imp;

import com.example.demo.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @copyright (C),  2019-2019, 创蓝253
 * @Description
 * @FileName HelloServiceImpl
 * @auther cw
 * @create 2019-10-19 10:56
 */

@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String helloSay() {
        return "系统异常";
    }
}
