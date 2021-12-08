-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Cardapio`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Cardapio` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Cardapio` (
  `codigoSanduiche` TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nomeSanduiche` VARCHAR(45) NOT NULL,
  `precoSanduiche` DECIMAL(5,2) UNSIGNED NOT NULL,
  PRIMARY KEY (`codigoSanduiche`),
  UNIQUE INDEX `codigoSanduiche_UNIQUE` (`codigoSanduiche` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Cliente` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `codigoCliente` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nomeCliente` VARCHAR(45) NOT NULL,
  `telefoneCliente` INT UNSIGNED NOT NULL,
  `enderecoLogradouro` VARCHAR(45) NOT NULL,
  `enderecoNumero` MEDIUMINT UNSIGNED NOT NULL,
  `enderecoCep` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`codigoCliente`),
  UNIQUE INDEX `codigoCliente_UNIQUE` (`codigoCliente` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Escolhas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Escolhas` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Escolhas` (
  `codigoEscolha` TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `quantidadeSanduiche` TINYINT UNSIGNED NOT NULL,
  `Cliente_codigoCliente` INT UNSIGNED NOT NULL,
  `Cardapio_codigoSanduiche` TINYINT UNSIGNED NOT NULL,
  PRIMARY KEY (`codigoEscolha`, `Cliente_codigoCliente`, `Cardapio_codigoSanduiche`),
  INDEX `fk_Escolhas_Cliente_idx` (`Cliente_codigoCliente` ASC) VISIBLE,
  INDEX `fk_Escolhas_Cardapio1_idx` (`Cardapio_codigoSanduiche` ASC) VISIBLE,
  CONSTRAINT `fk_Escolhas_Cliente`
    FOREIGN KEY (`Cliente_codigoCliente`)
    REFERENCES `mydb`.`Cliente` (`codigoCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Escolhas_Cardapio1`
    FOREIGN KEY (`Cardapio_codigoSanduiche`)
    REFERENCES `mydb`.`Cardapio` (`codigoSanduiche`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Pedido`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Pedido` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Pedido` (
  `Pedidocol` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `dataPedido` DATETIME NOT NULL,
  `statusPedido` TINYINT UNSIGNED NOT NULL,
  `Escolhas_codigoEscolha` TINYINT UNSIGNED NOT NULL,
  `Escolhas_Cliente_codigoCliente` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`Pedidocol`, `Escolhas_codigoEscolha`, `Escolhas_Cliente_codigoCliente`),
  INDEX `fk_Pedido_Escolhas1_idx` (`Escolhas_codigoEscolha` ASC, `Escolhas_Cliente_codigoCliente` ASC) VISIBLE,
  UNIQUE INDEX `Pedidocol_UNIQUE` (`Pedidocol` ASC) VISIBLE,
  CONSTRAINT `fk_Pedido_Escolhas1`
    FOREIGN KEY (`Escolhas_codigoEscolha` , `Escolhas_Cliente_codigoCliente`)
    REFERENCES `mydb`.`Escolhas` (`codigoEscolha` , `Cliente_codigoCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Entregor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Entregor` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Entregor` (
  `codigoEntregador` TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nomeEntregador` VARCHAR(45) NOT NULL,
  `telefoneEntregador` INT UNSIGNED NOT NULL,
  `Pedido_Pedidocol` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`codigoEntregador`, `Pedido_Pedidocol`),
  UNIQUE INDEX `codigoEntregador_UNIQUE` (`codigoEntregador` ASC) VISIBLE,
  INDEX `fk_Entregor_Pedido1_idx` (`Pedido_Pedidocol` ASC) VISIBLE,
  CONSTRAINT `fk_Entregor_Pedido1`
    FOREIGN KEY (`Pedido_Pedidocol`)
    REFERENCES `mydb`.`Pedido` (`Pedidocol`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
