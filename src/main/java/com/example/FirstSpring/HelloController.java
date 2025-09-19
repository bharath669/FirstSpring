package com.example.FirstSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }
    @PostMapping("/hello")
    public String helloPost(@RequestBody  String name){
        return "hello " +name+ " !";
    }
}
