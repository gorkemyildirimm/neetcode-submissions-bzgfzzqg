-- Write your query below
select DISTINCT  c1.seat_id from cinema c1 JOIN cinema c2
    ON c1.seat_id = c2.seat_id + 1
    OR c1.seat_id = c2.seat_id - 1
where c1.free = 1 AND c2.free = 1
ORDER BY c1.seat_id;

