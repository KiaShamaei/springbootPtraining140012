package com.ptaring.ptraining140012.testController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/greeting")
    public String test(){
        return "index.html";
    }
    @GetMapping("/restString")
    public  String testString(){
        return  "hello kooofte" ;
    }

}
