package com.toyshop.server.models;

import org.springframework.jdbc.support.rowset.SqlRowSet;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class CardDetails {

    private Integer product_id;
    private String name;
    private String description;
    private float price;
    private String image_url;
    private String category;

    
    public Integer getProduct_id() {
        return product_id;
    }
    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getImage_url() {
        return image_url;
    }
    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public static CardDetails create(SqlRowSet rs) {
        return null;
    }

    public JsonObject toJsonCardDeets() {
        return Json.createObjectBuilder()
            .add("name", name)
            .add("description", description)
            .add("price", price)
            .add("image_url", image_url)
            .add("category", category)
            .build();
    }

    public static CardDetails createDeets(SqlRowSet rs) {
        CardDetails cardDetails = new CardDetails();
        cardDetails.setProduct_id(rs.getInt("product_id"));
        cardDetails.setName(rs.getString("name"));
        cardDetails.setDescription(rs.getString("description"));
        cardDetails.setPrice(rs.getFloat("price"));
        cardDetails.setImage_url(rs.getString("image_url"));
        cardDetails.setCategory(rs.getString("category"));

        return cardDetails;
    }

    
    
}
