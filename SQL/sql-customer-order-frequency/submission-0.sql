-- Write your query below
select c.customer_id, c.name from customers c JOIN orders o
ON c.customer_id = o.customer_id
JOIN product p ON o.product_id = p.product_id
Where o.order_date BETWEEN '2020-06-01' AND '2020-08-01'
GROUP BY c.customer_id, c.name
HAVING SUM(CASE
    WHEN o.order_date >= '2020-06-01' AND o.order_date < '2020-07-01'
    THEN p.price * o.quantity
    ELSE 0
    END)>= 100
AND 
SUM(CASE
            WHEN o.order_date >= '2020-07-01' AND o.order_date < '2020-08-01'
            THEN p.price * o.quantity
            ELSE 0
END) >= 100;