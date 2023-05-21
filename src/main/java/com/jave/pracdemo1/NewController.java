package com.jave.pracdemo1;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    private final AtomicLong counter = new AtomicLong();
    private final String template = "Hello, %s, its a %s day.";

    @GetMapping("/greeting")
    public Hey Hey(@RequestParam(value = "name", defaultValue = "Everyone") String name){
        return new Hey(counter.incrementAndGet(), String.format(template,name)); 
    }
}
