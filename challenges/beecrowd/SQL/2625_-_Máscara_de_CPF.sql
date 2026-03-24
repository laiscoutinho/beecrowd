SELECT 
  CONCAT(
    SUBSTRING(cpf::TEXT, 1, 3), '.', 
    SUBSTRING(cpf::TEXT, 4, 3), '.', 
    SUBSTRING(cpf::TEXT, 7, 3), '-', 
    SUBSTRING(cpf::TEXT, 10, 2)
  ) AS CPF
FROM natural_person;
