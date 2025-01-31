-- creating database and tables
CREATE DATABASE beecrowd_db;

CREATE TABLE customers(
	id SERIAL PRIMARY KEY,
	name VARCHAR(100),
	street VARCHAR(100),
	city VARCHAR(100),
	state CHAR(2),
	credit_limit DECIMAL(9,2)
);

-- inserting data
INSERT INTO customers(name, street, city, state, credit_limit)
VALUES
    (
        'Pedro Augusto da Rocha', 
        'Rua Pedro Carlos Hoffman', 
        'Porto Alegre', 
        'RS', 
        700.00
    ),
    (
        'Antonio Carlos Mamel',    
        'Av. Pinheiros',
        'Belo Horizonte',
        'MG',
        3500.50
    ),
    (
        'Luiza Augusta Mhor',    
        'Rua Salto Grande',
        'Niteroi', 
        'RJ',
        4000.00
    ),
    (
        'Jane Ester', 
        'Av 7 de setembro',
        'Erechim',
        'RS',
        800.00
    ),
    (
        'Marcos Antônio dos Santos',    
        'Av Farrapos',
        'Porto Alegre',
        'RS',
        4250.25
    );
   
-- selecting names and adresses of people who live in Porto Alegre
SELECT name, street
FROM customers 
WHERE city = 'Porto Alegre';

-- dropping db
DROP DATABASE beecrowd_db;