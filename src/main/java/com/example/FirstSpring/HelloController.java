package com.example.FirstSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello/{name}")
    public HelloResponse hello(@PathVariable String name){
        return new HelloResponse("Hello world! "+name);
    }
    @GetMapping("/hello")
    public HelloResponse hello(){
        return new HelloResponse("Hello world!");
    }
    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody  String name){
        return new HelloResponse("hello " +name+ " !");
    }
}
