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
    email varchar(128) not null unique,
    password need to check,

    primary key(email)

)

create table cartItems (
	id integer auto_increment,
	item varchar(128) not null,
	quantity integer default '1',
	order_id char(8) not null,

	primary key(id),
	constraint fk_line_item_order_id foreign key(order_id)
		references purchase_order(order_id)
);

create table order_status (
	id int auto_increment,
	order_id char(8) not null,
	delivery_id varchar(128),
	status enum('pending', 'dispatched') default 'pending',
	status_update timestamp default current_timestamp, 

	primary key(id),
	constraint fk_order_status_order_id foreign key(order_id)
		references purchase_order(order_id)
);
