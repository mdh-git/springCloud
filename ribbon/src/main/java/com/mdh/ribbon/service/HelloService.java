package com.mdh.ribbon.service;

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

    public String helloService(String name){
        return restTemplate.getForObject("http://CLIENT-01/client-01?name=" + name, String.class);
    }
}
