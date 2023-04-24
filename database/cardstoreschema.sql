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
    
	primary key(email)
);

create table if not exists products(

    product_id int(7) unique,
    name varchar(128) not null,
    description varchar(256) not null,
    price decimal(5,2) not null, 
    image_url varchar(256) default null,
    category varchar (128) default null,

    primary key(product_id)
    
);




create table line_item(

	cart_id int auto_increment,
	name varchar(128) not null,
	quantity int default '1',
	order_id char(8) not null,
    
    primary key(cart_id)
    
);
    
	

insert into products(product_id, name, description, price, image_url, category) values

	('2021001',
    'Pink & Purple Ganesha Deepavali Card', 
    '- Original Hand painted work on 300gsm Watercolour paper, 
	- Painting will be stuck on 200gsm card for best quality, 
	- A6 size, 
	- Complimentary envelope provided, 
	- Slight variations possible as each card is handmade' ,
    '5.00' ,
    'https://azurasdesignzimages.s3.ap-southeast-2.amazonaws.com/IMG_1076.jpeg',
    'Deepavali Card'),
    
	('2022001',
    'Purple Floral Birthday Postcard', 
    '- Original Handmade watercolour postcard,
	- Painted on light grey 100% cotton watercolour paper,  
	- A6 size,
	- Complimentary envelope provided, 
	- Slight variations possible as each card is handmade' ,
    '5.00' ,
    'https://azurasdesignzimages.s3.ap-southeast-2.amazonaws.com/Purple+Floral+Birthday+Postcard.JPG',
    'Birthday Postcard'),
    
	('2022002',
    'Snowglobe Christmas Card', 
    '- Original Hand painted work on 300gsm Watercolour paper, 
	- Painting will be stuck on 200gsm card for best quality, 
	- A6 size, 
	- Complimentary envelope provided, 
	- Slight variations possible as each card is handmade :' ,
    '5.00' ,
    'https://azurasdesignzimages.s3.ap-southeast-2.amazonaws.com/Snowglobe+edited.jpeg',
    'Christmas Card')
    
    
    
