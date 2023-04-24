package com.toyshop.server.repositories;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.toyshop.server.models.CardDetails;

import static com.toyshop.server.repositories.Queries.*;

@Repository
public class CardRepository {

    @Autowired
    private JdbcTemplate template;

    public List<CardDetails> getCards(){
        SqlRowSet rs = template.queryForRowSet(SQL_SELECT_ALL_CARDS);
        List<CardDetails> results = new LinkedList<>();
        while(rs.next())
            results.add(CardDetails.createDeets(rs));
        return results;

    }

    public Optional<CardDetails> getCardById(Integer product_id) {
        SqlRowSet rs = template.queryForRowSet(SQL_SELECT_CARD_BY_ID, product_id);
        if (!rs.next())
            return Optional.empty();
        return Optional.of(CardDetails.createDeets(rs));
    }
    
}

    

