package com.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@RequestMapping
@Controller
@Slf4j
public class helloController {
//    public static final Logger logger = LoggerFactory.getLogger(helloController.class);


    @RequestMapping("/index")
    public String hello(){
        log.error("严重警告");
        return "index";
    }

    @GetMapping("/hhh")
    public String hhh(){
        return "hhh";
    }

}
