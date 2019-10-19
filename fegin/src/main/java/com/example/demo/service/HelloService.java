package com.example.demo.service;

import com.example.demo.service.imp.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @copyright (C),  2019-2019, 创蓝253
 * @Description first
 * @FileName HelloService
 * @auther cw
 * @create 2019-10-19 10:38
 */
@FeignClient(value = "springcloud",fallback = HelloServiceImpl.class)
public interface HelloService {
    @RequestMapping(value = "/say")
     String helloSay();
}
