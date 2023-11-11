package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);

    @RequestMapping("/sample")
    public String greeting(){
        logger.debug("SampleController's greeting method called");

        return "안녕안녕 아리미";
    }

}