-- Write your query below
select w.name as warehouse_name, SUM((p.width * p.length * p.height) * w.units) as volume
from products p JOIN warehouse w ON
w.product_id = p.product_id
GROUP BY w.name;