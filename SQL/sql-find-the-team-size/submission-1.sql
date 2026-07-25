-- Write your query below
select e.employee_id, COUNT(e2.employee_id) as team_size from employee e
JOIN employee e2 ON e.team_id = e2.team_id
GROUP BY e.employee_id