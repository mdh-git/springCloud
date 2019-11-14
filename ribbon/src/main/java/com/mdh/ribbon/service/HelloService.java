package com.mdh.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author madonghao
 * @create 2019-11-14 10:55
 **/
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String helloService(String name){
        return restTemplate.getForObject("http://CLIENT-01/hi?name=" + name, String.class);
    }

    public String hiError(String name){
        return "hi," + name + ",sorry,error!";
    }
}
