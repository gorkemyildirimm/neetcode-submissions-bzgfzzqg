-- Write your query below
select MIN(ABS(p1.x - p2.x)) as shortest from point p1 CROSS JOIN point p2
where p1.x != p2.x;
