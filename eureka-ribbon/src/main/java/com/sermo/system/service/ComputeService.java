package com.sermo.system.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author sermo
 * @version 2016/12/1.
 */
@Service
public class ComputeService {

    @Resource
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallBack")
    public String addService() {
        return restTemplate.getForEntity("http://DISOVERY-SERVICE/add?a=10&b=5", String.class).getBody();
    }

    public String addServiceFallBack(){
        return "error";
    }
}
