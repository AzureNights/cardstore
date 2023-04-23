package com.toyshop.server.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toyshop.server.models.Customer;
//import com.stripe.model.Customer;
import com.toyshop.server.repositories.CustomerRepository;

@Service
public class CustDeetsService {

    @Autowired
    private CustomerRepository custRepo;

    public static String createCustomer(Customer customer){ 
        return "User Created";
    }
    
    // List<CardDetails> getCards(){
    //     return cardRepo.getCards();
    // }




    
}
