package com.example.teste;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/webhook")
public class TestController {
    @PostMapping
    public void teste(@RequestBody String str){
        System.out.println(str);
    }

    @GetMapping
    public void statusCall(HttpServletRequest req, HttpServletResponse res, @RequestBody String str){
        System.out.println(str);
    }
}
