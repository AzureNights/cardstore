package com.toyshop.server.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toyshop.server.models.CardDetails;
import com.toyshop.server.repositories.CardRepository;

@Service
public class CardDeetsService {

    @Autowired
    private CardRepository cardRepo;

    public List<CardDetails> getCards(){
        return cardRepo.getCards();
    }


    
}
