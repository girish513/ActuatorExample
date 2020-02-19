package com.actuatorExample.ActuatorExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping("/hello")
    public String getDisplay(){
        return sampleService.getData();

    }

    @RequestMapping(value = "/getHello",method = RequestMethod.GET)
    public String getHello(){
        return "HELLO";
    }
}
