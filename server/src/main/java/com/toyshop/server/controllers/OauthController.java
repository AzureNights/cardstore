package com.toyshop.server.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class OauthController {

    @GetMapping(path="/googleLogin")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello from the other side");
    }

    
}
