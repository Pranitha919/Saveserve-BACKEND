package com.saveserve.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "SaveServe Backend Running 🚀";
    }

    @GetMapping("/test")
    public String test() {
        return "API is working ✅";
    }
}