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