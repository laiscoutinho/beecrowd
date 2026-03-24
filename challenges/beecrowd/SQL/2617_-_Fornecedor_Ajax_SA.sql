SELECT pd.name, pv.name
FROM products pd
JOIN providers pv ON pd.id_providers = pv.id
WHERE pv.name like 'Ajax SA';
