package com.example.teste;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webhook")
public class TestController {
    @PostMapping
    public void teste(@RequestBody String str){
        System.out.println(str);
    }
}
