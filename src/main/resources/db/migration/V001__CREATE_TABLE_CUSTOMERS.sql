CREATE TABLE customers (
  id BIGINT NOT NULL AUTO_INCREMENT, 
  name VARCHAR(60) NOT NULL, 
  email VARCHAR(255) NOT NULL, 
  phone VARCHAR(20) NOT NULL, 
  cpf CHAR(11) NOT NULL, 
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
  deleted_at TIMESTAMP NULL DEFAULT NULL,
  primary key (id)
);
