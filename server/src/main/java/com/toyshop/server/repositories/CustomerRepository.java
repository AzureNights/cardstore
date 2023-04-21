package com.toyshop.server.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.toyshop.server.models.Customer;
import static com.toyshop.server.repositories.Queries.*;

@Repository
public class CustomerRepository {

    @Autowired
    private JdbcTemplate template;

    public Optional<Customer> findCustomerByName(String username) {
        SqlRowSet rs = template.queryForRowSet(SQL_FIND_CUSTOMER_BY_NAME);
        	if (!rs.next())
			return Optional.empty();
            return null;


		//return Optional.of(toCustomer(rs));
    }   
}
