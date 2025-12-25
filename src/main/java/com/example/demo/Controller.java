package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class Controller {

    @GetMapping
    public String demoController (@RequestParam("a")int a , @RequestParam("b") int b ){
        return String.valueOf(a + b) ;
    }
}
