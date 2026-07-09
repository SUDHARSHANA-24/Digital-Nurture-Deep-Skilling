package com.cognizant.jwt_authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt_authentication.util.JwtUtil;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public String authenticate() {

        String token = JwtUtil.generateToken("user");

        return "{\"token\":\"" + token + "\"}";
    }

}