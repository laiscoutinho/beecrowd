SELECT c.name, SUM(pd.amount)
FROM products pd
JOIN categories c ON pd.id_categories = c.id
GROUP BY c.name;
