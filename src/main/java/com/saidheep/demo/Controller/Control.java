package com.saidheep.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {

    @GetMapping("/hello")
    public String hello(){

        return  " please smile :)";
    }
}