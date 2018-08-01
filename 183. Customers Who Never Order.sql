# Write your MySQL query statement below
SELECT c.Name as Customers
FROM Customers c
LEFT JOIN ORDERS o
ON c.Id = o.CustomerId
WHERE o.CustomerId IS NULL