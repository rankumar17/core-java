package com.ranjan.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyRestApiController {

    @GetMapping("/messages")
    public String getMessage() {
        return "Hello from Docker!";
    }
}
