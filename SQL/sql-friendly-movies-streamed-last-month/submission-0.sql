-- Write your query below
select DISTINCT c.title from tv_program t
JOIN content c ON t.content_id = c.content_id
where kids_content = 'Y' AND c.content_type = 'Movies'
AND t.program_date BETWEEN '2020-06-01 00:00' AND '2020-06-30 24:00';