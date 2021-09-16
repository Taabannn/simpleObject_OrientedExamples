-- show databases;
SELECT email 
FROM classicmodels.employees
WHERE jobTitle = 'Sales Rep';
SELECT contactLastName, postalCode 
FROM classicmodels.customers
WHERE country = 'USA' OR country = 'Spain';
SELECT phone, customerName 
FROM classicmodels.customers
WHERE creditLimit < 100000;
SELECT productName, buyPrice 
FROM classicmodels.products
INNER JOIN orderdetails ON quantityOrdered > 30;
SELECT * FROM payments 
WHERE (paymentDate BETWEEN '0000-00-00' AND '2005-00-00') AND amount > 10000.00;