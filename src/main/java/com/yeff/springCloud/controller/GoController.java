package com.yeff.springCloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoController {

    @GetMapping("/go")
    public String go(){
        return "200 spring cloud test success";
    }
}
