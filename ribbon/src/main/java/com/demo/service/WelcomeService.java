package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WelcomeService {

    @Autowired
    private RestTemplate restTemplate;

    public String welcome(){
        return restTemplate.getForObject("http://SPRINGCLOUD/say",String.class);
    }
}
