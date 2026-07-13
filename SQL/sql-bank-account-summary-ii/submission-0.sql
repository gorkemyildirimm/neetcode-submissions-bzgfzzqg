-- Write your query below
select u.name, SUM(t.amount) as balance from users u
JOIN transactions t ON u.account = t.account 
GROUP BY u.account
HAVING SUM(t.amount) > 10000;