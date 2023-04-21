package com.toyshop.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.toyshop.server.services.CardDeetsService;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;

@Controller
@RequestMapping(path="/api")
public class CardDeetsController {

    @Autowired
    private CardDeetsService cardSvc;

    @GetMapping(path="/cards", produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @CrossOrigin()
    public ResponseEntity<String> getCards(){
        JsonArrayBuilder arrBuilder = Json.createArrayBuilder();
        cardSvc.getCards().stream()
            .forEach(v -> {
                arrBuilder.add(v.toJsonCardDeets());
            });

            System.out.println("controller");
        return ResponseEntity.ok(arrBuilder.build().toString());
    }


    
}
