SELECT pd.name, pv.name, pd.price
FROM products pd
JOIN providers pv ON pd.id_providers = pv.id
JOIN categories c ON pd.id_categories = c.id
WHERE pd.price > 1000 
	AND c.name like 'Super Luxury';
