package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/")
    public String index(){
        return "{'a':1}";
    }

    @GetMapping("/test")
    public String test(){
        return "{'test' : 'arthur'}";
    }
}
