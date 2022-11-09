package com.example.eksa.controller;

import com.example.eksa.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/A")
public class AController {

    @Autowired
    private AService aService;

    @GetMapping("")
    public String returnA() {
        return "A";
    }

    @GetMapping("/B")
    public Map<String, String> returnB() {
        return aService.getB();
    }
}
