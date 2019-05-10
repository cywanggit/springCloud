package com.demo.controller;

import com.demo.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/com")
public class WelcomeController extends BaseController{
    @Autowired
    private WelcomeService welcomeService;

    @Autowired
    private HttpServletRequest request;
    @RequestMapping("/welcome")
    public String welcome(){
        String requestURI = request.getRequestURI();
        String[] split = requestURI.split("/");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }



        return welcomeService.welcome();
    }
}
