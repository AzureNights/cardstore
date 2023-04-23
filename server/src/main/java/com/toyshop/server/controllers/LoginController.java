package com.toyshop.server.controllers;

import java.io.StringReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toyshop.server.models.Customer;
import com.toyshop.server.repositories.CustomerRepository;
import com.toyshop.server.services.CustDeetsService;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

@Controller 
@RequestMapping(path="/api")
public class LoginController {

    @Autowired
    private CustDeetsService custDeetsSvc;

    @Autowired
    private CustomerRepository custRepo;

    @GetMapping(path="/signup")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello from the other side");
    }


    @PostMapping(path="/signup", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addCustomer(@RequestBody String payload){
        
        JsonReader reader = Json.createReader(new StringReader(payload));
        JsonObject json = reader.readObject();
        // if (custDeetsSvc.checkUserExist(json.getString("email"))) {
        //     return ResponseEntity.ok("login");
        // }
        Customer newCust = Customer.createCust(json);
        CustDeetsService.createCustomer(newCust);
        return ResponseEntity.ok(payload);
    }

}