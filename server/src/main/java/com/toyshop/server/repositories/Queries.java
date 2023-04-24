package com.toyshop.server.repositories;

public interface Queries {

    public String SQL_SELECT_ALL_CARDS = "select * from products";
    //public String SQL_SELECT_BOOK_BY_BOOKID = "select * from book2018 where book_id = ?";

    public String SQL_FIND_CUSTOMER_BY_NAME = "select ? from customer";
    //need to check again
    
    public String SQL_INSERT_CUSTOMER = "insert into customer(firstname, lastname, password, email, address) values (?, ?, sha2_512(?), ?);";

    public String SQL_SELECT_CARD_BY_ID = "select * from products where product_id = ?";
    //select * from products where product_id = '2021001';



    
}
