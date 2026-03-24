SELECT pd.name, pv.name
FROM products pd, providers pv
WHERE pd.id_providers = pv.id
	AND pd.id_categories = 6;
