SELECT pd.name, pv.name, c.name
FROM products pd
JOIN providers pv ON pd.id_providers = pv.id
JOIN categories c ON pd.id_categories = c.id
WHERE pv.name like 'Sansul SA' AND c.name like 'Imported';
