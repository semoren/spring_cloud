package com.sermo.system.web;

import com.sermo.system.service.ComputeClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sermo
 * @version 2016/11/30.
 */
@RestController
public class ConsumerController {

    @Resource
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(){
        return computeClient.add(10, 20);
    }
}
