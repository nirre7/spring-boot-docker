package com.niso.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    private ApplicationContext appContext;

    @GetMapping("/")
    public String index() {
        return "I'm groot!";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/api/shutdown")
    public void shutdown() {
        int exit = SpringApplication.exit(appContext, () -> 0);
        System.exit(exit);
    }
}
