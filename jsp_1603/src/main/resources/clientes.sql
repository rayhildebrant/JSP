CREATE TABLE `lojajdbc`.`clientes` (
  `clienteid` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(150) NOT NULL,
  `cpf` BIGINT(10) NOT NULL,
  `datanascimento` DATE NOT NULL,
  `sexo` CHAR(1) NOT NULL,
  `senha` VARCHAR(100) NOT NULL,
  `ofertas` CHAR(1) NOT NULL,
  PRIMARY KEY (`clienteid`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC));