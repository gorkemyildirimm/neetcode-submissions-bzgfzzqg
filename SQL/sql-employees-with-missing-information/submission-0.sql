-- Write your query below
select COALESCE(e.employee_id, s.employee_id) as employee_id
from employees e FULL OUTER JOIN salaries s
ON e.employee_id = s.employee_id
WHERE e.name is null OR s.salary is null
ORDER BY employee_id ASC