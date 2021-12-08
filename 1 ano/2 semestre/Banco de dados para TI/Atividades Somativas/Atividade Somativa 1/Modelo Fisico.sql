-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema Geral
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Geral` ;

-- -----------------------------------------------------
-- Schema Geral
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Geral` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `Geral` ;

-- -----------------------------------------------------
-- Table `Geral`.`Cardapio`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Geral`.`Cardapio` ;

CREATE TABLE IF NOT EXISTS `Geral`.`Cardapio` (
  `CodigoSanduiche` TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nomeSanduiche` VARCHAR(45) NOT NULL,
  `precoSanduiche` DECIMAL(5,2) NOT NULL,
  PRIMARY KEY (`CodigoSanduiche`),
  UNIQUE INDEX `CodigoSanduiche_UNIQUE` (`CodigoSanduiche` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Geral`.`Entregador`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Geral`.`Entregador` ;

CREATE TABLE IF NOT EXISTS `Geral`.`Entregador` (
  `codigoEntregador` TINYINT NOT NULL,
  `nomeEntregador` VARCHAR(45) NULL DEFAULT NULL,
  `telefoneEntregador` INT NULL DEFAULT NULL,
  PRIMARY KEY (`codigoEntregador`))
  
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Geral`.`Cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Geral`.`Cliente` ;

CREATE TABLE IF NOT EXISTS `Geral`.`Cliente` (
  `codigoCliente` MEDIUMINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nomeCliente` VARCHAR(45) NOT NULL,
  `telefoneCliente` INT UNSIGNED NOT NULL,
  `enderecoLogradouro` VARCHAR(45) NOT NULL,
  `enderecoNumero` MEDIUMINT UNSIGNED NOT NULL,
  `EnderecoCEP` INT UNSIGNED NOT NULL,
  `enderecoComplemento` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`codigoCliente`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Geral`.`Pedido`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Geral`.`Pedido` ;

CREATE TABLE IF NOT EXISTS `Geral`.`Pedido` (
  `codigoPedido` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Cliente_codigoCliente` MEDIUMINT UNSIGNED NOT NULL,
  `dataEmissao` DATETIME NOT NULL,
  `statusPedido` TINYINT UNSIGNED NOT NULL,
  `Entregador_codigoEntregador` TINYINT NOT NULL,
  `nomeEntregador` VARCHAR(45) NULL,
  PRIMARY KEY (`codigoPedido`, `Cliente_codigoCliente`, `Entregador_codigoEntregador`),
  UNIQUE INDEX `codigoPedido_UNIQUE` (`codigoPedido` ASC) VISIBLE,
  INDEX `fk_Pedido_Entregador1_idx` (`Entregador_codigoEntregador` ASC) VISIBLE,
  INDEX `fk_Pedido_Cliente1_idx` (`Cliente_codigoCliente` ASC) VISIBLE,
  CONSTRAINT `fk_Pedido_Entregador1`
    FOREIGN KEY (`Entregador_codigoEntregador`)
    REFERENCES `Geral`.`Entregador` (`codigoEntregador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_Cliente1`
    FOREIGN KEY (`Cliente_codigoCliente`)
    REFERENCES `Geral`.`Cliente` (`codigoCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Geral`.`CardapioPedido`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Geral`.`CardapioPedido` ;

CREATE TABLE IF NOT EXISTS `Geral`.`CardapioPedido` (
  `codigoCardapioPedido` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `quantidadeSanduche` TINYINT UNSIGNED NOT NULL,
  `Cardapio_CodigoSanduiche` TINYINT UNSIGNED NOT NULL,
  `Pedido_codigoPedido` INT UNSIGNED NOT NULL ,
  PRIMARY KEY (`codigoCardapioPedido`, `Cardapio_CodigoSanduiche`, `Pedido_codigoPedido`),
  UNIQUE INDEX `codigoCardapioPedido_UNIQUE` (`codigoCardapioPedido` ASC) VISIBLE,
  INDEX `fk_CardapioPedido_Cardapio1_idx` (`Cardapio_CodigoSanduiche` ASC) VISIBLE,
  INDEX `fk_CardapioPedido_Pedido1_idx` (`Pedido_codigoPedido` ASC) VISIBLE,
  CONSTRAINT `fk_CardapioPedido_Cardapio1`
    FOREIGN KEY (`Cardapio_CodigoSanduiche`)
    REFERENCES `Geral`.`Cardapio` (`CodigoSanduiche`),
  CONSTRAINT `fk_CardapioPedido_Pedido1`
    FOREIGN KEY (`Pedido_codigoPedido`)
    REFERENCES `Geral`.`Pedido` (`codigoPedido`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
