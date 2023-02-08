package shop.mtcoding.blog1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class test {
    
    @GetMapping("/")
    public String test1(){
        return "test";
    }
}
