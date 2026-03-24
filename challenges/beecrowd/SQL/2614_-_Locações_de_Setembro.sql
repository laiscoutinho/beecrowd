SELECT c.name, r.rentals_date
FROM rentals r
JOIN customers c ON r.id_customers = c.id
WHERE EXTRACT(YEAR FROM r.rentals_date) = 2016
  AND EXTRACT(MONTH FROM r.rentals_date) = 9;
