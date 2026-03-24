SELECT pd.name
FROM products pd, providers pv
WHERE pd.id_providers = pv.id AND
	(pd.amount between 10 AND 20) AND
    pv.name like 'P%';
