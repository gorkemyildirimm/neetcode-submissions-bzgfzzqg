-- Write your query below
select s.id, s.name from departments d RIGHT JOIN students s
ON d.id = s.department_id
Where d.id is null;