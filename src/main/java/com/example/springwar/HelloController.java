package com.example.springwar;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
@GetMapping("/hello")
@CrossOrigin("http://localhost:50588/")
    public Map<String, String> Hello(){
    Map<String, String> response = new HashMap<>();
    response.put("message", "Hello World!");
    return response;
    }
}
