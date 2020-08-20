CREATE TABLE stock (
id INT AUTO_INCREMENT PRIMARY KEY,
code VARCHAR(10),
description VARCHAR(60),
purchase_date DATE,
purchase_price DOUBLE,
target_price DOUBLE
);