-- Write your query below
SELECT
    d.name AS department,
    e.name AS employee,
    e.salary
FROM employee e
JOIN department d
    ON e.department_id = d.id
JOIN (
    SELECT
        department_id,
        MAX(salary) AS max_salary
    FROM employee
    GROUP BY department_id
) m
    ON e.department_id = m.department_id
   AND e.salary = m.max_salary;