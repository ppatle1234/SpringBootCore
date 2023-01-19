package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping
    public String sayHello(){
        return "WELCOME TO CSI PUNE";
    }

    @GetMapping("/services")
    public String sayServices(){
        return "SOFTWARE DEVELOPMENT";
    }

    @GetMapping("/address")
    public String sayAddress(){
        return "INSPIRIA MALL | PUNE";
    }

    @GetMapping("/product")
    public String sayProduct(){
        return "SOFTWARE";
    }

    @GetMapping("/file")
    public String file()
    {
        return "dgil";
    }
}

