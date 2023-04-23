drop database if exists cardstore; 

create database if not exists cardstore; 

use cardstore;

-- -----------------------------------------------------
-- create schema/database chuk wkshp 24 and eshop 
-- Table `cardstore`.`product_category`
-- Include this ?? 
-- -----------------------------------------------------

create table customer(
	firstname varchar(64) not null,
    lastname varchar(64) not null,
	password varchar(100) not null,
	email varchar(128) not null unique,
    address varchar(128),
	primary key(name)
);

create table if not exists products(

    product_id int auto_increment unique,
    name varchar(128) not null,
    description varchar(256) not null,
    price decimal(5,2) not null, 
    image_url varchar(256) default null,
    category varchar (128) default null,

    primary key(product_id)
    
);

create table order(

	name varchar(128) not null,
    description varchar(256) not null,
    price decimal(5,2) not null, 
    image_url varchar(256) default null,
    category varchar (128) default null,


create table line_item(

	cart_id int auto_increment,
	name varchar(128) not null,
	quantity int default '1',
	order_id char(8) not null,
    
    primary key(cart_id),
    
	

insert into products(name, description, price, image_url, category) values

	('Pink & Purple Ganesha Deepavali Card', 
    '- Original Hand painted work on 300gsm Watercolour paper, 
	- Painting will be stuck on 200gsm card for best quality, 
	- A6 size, 
	- Complimentary envelope provided, 
	- Slight variations possible as each card is handmade' ,
    '5.00' ,
    'https://azurasdesignzimages.s3.ap-southeast-2.amazonaws.com/Pink+%26+Purple+Ganesha+Deepavali+Card.JPG',
    'Deepavali Card'),
    
	('Purple Floral Birthday Postcard', 
    '- Original Handmade watercolour postcard,
	- Painted on light grey 100% cotton watercolour paper,  
	- A6 size,
	- Complimentary envelope provided, 
	- Slight variations possible as each card is handmade' ,
    '5.00' ,
    'https://azurasdesignzimages.s3.ap-southeast-2.amazonaws.com/Purple+Floral+Birthday+Postcard.JPG',
    'Birthday Postcard'),
    
	('Yellow Floral Birthday Card', 
    '- Original Hand painted work on 300gsm Watercolour paper, 
	- Painting will be stuck on 200gsm card for best quality, 
	- A6 size, 
	- Complimentary envelope provided, 
	- Slight variations possible as each card is handmade :' ,
    '5.00' ,
    '/Users/kokila/Desktop/Biz Images for NUS PROJECT /Yellowy Floral Birthday Card.JPG',
    'Birthday Card')
    
    
    
