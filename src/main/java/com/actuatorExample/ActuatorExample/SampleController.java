package com.actuatorExample.ActuatorExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping("/hello")
    public String getDisplay(){
        String result = sampleService.getData();
        return result;
    }
}
