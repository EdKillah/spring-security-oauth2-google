package com.springcloud.security.oauth2google.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class LoginController {

    @GetMapping
    public String hello(){
        return "Hello world!";
    }

    @GetMapping("/user")
    public Principal user(Principal principal){
        System.out.println("Username: "+principal.getName());
        return principal;
    }
}
