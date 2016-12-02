package com.sermo.system.web;

import com.sermo.system.service.ComputeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author sermo
 * @version 2016/11/30.
 */
@RestController
public class ConsumerController {

    /*@Resource
    RestTemplate restTemplate;*/
    @Resource
    private ComputeService service;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(){
//        return restTemplate.getForEntity("http://DISOVERY-SERVICE/add?a=10&b=5", String.class).getBody();
        return service.addService();
    }
}
