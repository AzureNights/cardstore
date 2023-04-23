package com.toyshop.server.models;

import org.springframework.jdbc.support.rowset.SqlRowSet;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class Customer {

    private String username;
    private String firstname;
    private String lastname;
    private String address;
    private String email;
    private String password;


    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }



public JsonObject toJsonCardDeets() {
    return Json.createObjectBuilder()
        .add("firstname", firstname)
        .add("lastname", lastname)
        .add("address", address)
        .add("email", email)
        .add("password", password)
        .build();
}

public static Customer createCust(JsonObject json) {
    Customer customer = new Customer();
    //cardDetails.setProduct_id(rs.getInt("product_id"));
    customer.setFirstname(json.getString("firstname"));
    customer.setLastname(json.getString("lastname"));
    customer.setAddress(json.getString("address"));
    customer.setEmail(json.getString("email"));
    customer.setPassword(json.getString("password"));
    return customer;
}

}
