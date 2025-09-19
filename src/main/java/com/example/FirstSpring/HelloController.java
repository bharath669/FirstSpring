package com.example.FirstSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello/{name}/{show}")
    public HelloResponse hello(@PathVariable String name,@PathVariable String show){
        return new HelloResponse("Hello world! "+name,"state "+show);
    }//while hitting URL in postman the endpoints what i give it will reflected in o/p
//    @GetMapping("/hello")
//    public HelloResponse hello(){
//        return new HelloResponse("Hello world!");
//    }
//    @PostMapping("/hello")
//    public HelloResponse helloPost(@RequestBody  String name){
//        return new HelloResponse("hello " +name+ " !");
//    }
}
