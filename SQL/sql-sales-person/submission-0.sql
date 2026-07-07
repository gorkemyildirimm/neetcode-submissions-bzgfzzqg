-- Write your query below
select s.name from sales_person s 
LEFT JOIN orders o ON s.sales_id = o.sales_id
LEFT JOIN company c ON c.com_id = o.com_id
AND c.name = 'CRIMSON'
GROUP BY s.sales_id, s.name
HAVING COUNT(c.com_id) = 0;