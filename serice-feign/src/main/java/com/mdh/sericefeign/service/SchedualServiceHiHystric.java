package com.mdh.sericefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author madonghao
 * @create 2019-11-15 15:06
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry," + name;
    }
}
