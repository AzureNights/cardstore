package com.toyshop.server.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.toyshop.server.models.Customer;
import static com.toyshop.server.repositories.Queries.*;

@Repository
public class CustomerRepository {

    @Autowired
    private JdbcTemplate template;

    public void createCustomer(Customer customer) {
        template.update(SQL_INSERT_CUSTOMER, customer.getFirstname(), customer.getLastname(), 
                        customer.getPassword(), customer.getEmail(), customer.getAddress());
    }

    // public Optional<Customer> loginCustomer(String email, String password){

    //     SqlRowSet rs = template.queryForRowSet(SQL_FIND_CUSTOMER_BY_NAME, null, null);
    // }

    // public Optional<Customer> findCustomerByName(String name) {
	// 	// TODO: Task 3 

	// 	SqlRowSet rs = jdbcTemplate.queryForRowSet(SQL_FIND_CUSTOMER_BY_NAME, name);
	// 	if (!rs.next())
	// 		return Optional.empty();

	// 	return Optional.of(toCustomer(rs));
}




