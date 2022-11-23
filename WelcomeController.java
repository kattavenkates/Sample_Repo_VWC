package com.sb.controller; 

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class WelcomeController {
 
    @Value("${var}")
    String message;
    
    @Value("${var1}")
    String message1;
   

 
    @GetMapping("/welcome")
    public String getMessage()
    {
        return "Hi "+message+message1;
    }
}