SELECT pd.id, pd.name
FROM products pd, categories c
WHERE pd.id_categories = c.id
	AND c.name like 'super%';
