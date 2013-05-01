package com.dubbo.demo.impl;

import com.dubbo.demo.HelloService;

/**
 * @author Jerry Lee
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello, " + name + "!";
    }
}
