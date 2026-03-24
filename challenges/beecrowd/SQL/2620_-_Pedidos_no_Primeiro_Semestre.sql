SELECT c.name, o.id
FROM customers c
join orders o
on o.id_customers = c.id
where o.orders_date BETWEEN '2016-01-01' AND '2016-06-30';
