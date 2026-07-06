-- Write your query below
select u.name, COALESCE(SUM(r.distance),0)as travelled_distance
from users u LEFT JOIN rides r ON u.id = r.user_id
GROUP BY r.user_id, u.name
ORDER BY travelled_distance DESC, u.name ASC;