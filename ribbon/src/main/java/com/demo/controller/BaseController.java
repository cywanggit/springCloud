package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import sun.misc.Unsafe;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class BaseController {

    @Autowired
    private HttpServletRequest request;

    public void say(){
        System.out.println(request.getRequestURI());
    }

    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address.getHostAddress() + address.getCanonicalHostName());

    }
}
