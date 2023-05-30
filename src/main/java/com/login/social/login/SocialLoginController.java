package com.login.social.login;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SocialLoginController {
    @GetMapping("/")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello from unsecure endpoint");
    }
    @GetMapping("/secure")
    public String secured(){
        return "Hello, Secured!";
    }
}
