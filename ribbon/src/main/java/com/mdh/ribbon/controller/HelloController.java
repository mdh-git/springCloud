package com.mdh.ribbon.controller;

import com.mdh.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author madonghao
 * @create 2019-11-14 10:58
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello")
    public String hello(String name){
        return helloService.helloService(name);
    }
}
