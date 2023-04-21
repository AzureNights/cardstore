drop database if exists cardstore; 

create database if not exists cardstore; 

use cardstore;

-- -----------------------------------------------------
-- create schema/database chuk wkshp 24 and eshop 
-- Table `cardstore`.`product_category`
-- Include this ?? 
-- -----------------------------------------------------

create table products(
    product_id integer(8) null unique auto_increment,
    name varchar(128) default null,
    description varchar(256) default null,
    price decimal(5,2) default null, 
    image_url varchar(256) default null,
    category varchar (128) default null,

    primary key(product_id)
    
)


create table customer(
    username varchar(128) unique, (inclyde must have)
    firstname varchar(128),
    lastname varchar(128),
    address varchar(256),
    email varchar(128),
    password need to check,

    primary key(username)


    private String username;
    private String firstname;
    private String lastname;
    private String address;
    private String email;
    private String password;

)