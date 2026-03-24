SELECT d.name,
      ROUND(SUM((150 * a.hours) + (150 * a.hours * ws.bonus / 100)), 1) AS salary
FROM doctors d
JOIN attendances a ON a.id_doctor = d.id
JOIN work_shifts ws ON a.id_work_shift = ws.id
GROUP BY d.id
ORDER BY salary DESC;
