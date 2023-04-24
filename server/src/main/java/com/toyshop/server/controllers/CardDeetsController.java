package com.toyshop.server.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.toyshop.server.models.CardDetails;
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


    @GetMapping(path="/cards/{product_id}", produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @CrossOrigin()
    public ResponseEntity<String> getCardById(@PathVariable Integer product_id) {
        Optional<CardDetails> opt = cardSvc.getCardById(product_id);
        if(opt.isEmpty())
            return ResponseEntity
            .status(404)
            .body(
                Json.createObjectBuilder()
                .add("message", "Cannot find product_id %s".formatted(product_id))
                .build().toString()
            );
    return ResponseEntity.ok(opt.get().toJsonCardDeets().toString());
    }

    
}
