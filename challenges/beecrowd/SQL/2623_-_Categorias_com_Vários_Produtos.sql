SELECT p.name, c.name
FROM products p 
join categories c
on p.id_categories = c.id
where amount > 100 and
		id_categories in (1,2,3,6,9)
order by id_categories;
