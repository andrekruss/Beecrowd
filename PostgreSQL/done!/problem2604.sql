-- creating database and tables
CREATE DATABASE beecrowd_db;

CREATE TABLE products(
	id SERIAL PRIMARY KEY,
	name VARCHAR(100),
	amount NUMERIC(10, 2),
	price NUMERIC(10, 2)
);

-- inserting data
INSERT INTO products(name, amount, price)
VALUES 
	('Two-door wardrobe', 100, 80),
	('Dining table', 1000, 560),
	('Towel holder', 10000, 5.50),
	('Computer desk', 350, 100),
	('Chair', 3000, 210.64),
	('Single bed', 750, 99);

-- products with price < 10 or > 100
SELECT id, name
FROM products
WHERE price < 10 OR price > 100;

-- drop database
DROP DATABASE beecrowd_db;