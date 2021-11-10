DROP DATABASE IF EXISTS shop;
CREATE DATABASE shop;
USE shop;

CREATE TABLE Items (
         item_id int PRIMARY KEY AUTO_INCREMENT,
         name varchar(150),
         price double,
         quantity int
         );

CREATE TABLE customers(
        custmer_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
        name varchar(100),
        email varchar(100),
        userpswd varchar(100)
        );

CREATE TABLE offers(
       id int PRIMARY KEY AUTO_INCREMENT,
       item_id int,
       custmer_id int,
       quantity int,
       Amount double,
       status varchar(20) DEFAULT 'Pending',
	   FOREIGN KEY (custmer_id) REFERENCES customers(custmer_id),
       FOREIGN KEY (item_id) REFERENCES items(item_id)
       );

CREATE TABLE employees (
       id int PRIMARY KEY AUTO_INCREMENT,
       name varchar(100)
       );

CREATE TABLE ownership_pmnts(
       id int PRIMARY KEY AUTO_INCREMENT,
       custmer_id int,
       item_id int,
       Amount double,
       quantity int,
       pmnt_made double,
	   FOREIGN KEY (custmer_id) REFERENCES customers(custmer_id),
       FOREIGN KEY (item_id) REFERENCES items(item_id)
       );


INSERT INTO items (name, price)
VALUES ("Pen", 1.99),
       ("Pencil",0.99),
       ("Note Book",1.99),
       ("Back Bag",10.99),
       ("Marker",2.49),
       ("Paper Glue",3.49),
       ("Stapler",7.99),
       ("Printing Papers",4.49),
       ("Fancy Note Book",10.99),
       ("Plastic laminaters",0.89),
       ("sharpner",0.99);


INSERT INTO customers (email, username, userpswd)
VALUES ('sam@email.com','sam23', 'ygfxiycwviyvwiycgcyc'),
       ('john@email.com','john23', 'hibcuohb087hb1uh3fuhb'),
       ('larry@email.com','larry23', 'jhqbdouhboquhdv'),
       ('barry@email.com','barry23', 'hsdcguvhvdvcihdiyg'),
       ('dante@email.com','dante23', 'hdchgbwuvcygdcogc');

INSERT INTO offers (item_id, custmer_id,quantity,Amount)
VALUES (1,1,3,1.95),
       (2,3,4,0.79),
       (3,4,7,1.89),
       (4,1,3,10.89),
       (5,3,4,2.49),
       (6,4,7,3.29);

INSERT INTO employees (id,name)
VALUES (1, 'cassandra'),
	   (2, 'manuel');
--SELECT name,username, price, Amount,quantity, Amount*quantity AS total
--FROM customers, Items, offers
--WHERE offers.item_id=Items.item_id
--AND offers.custmer_id=customers.custmer_id
--ORDER By username;

