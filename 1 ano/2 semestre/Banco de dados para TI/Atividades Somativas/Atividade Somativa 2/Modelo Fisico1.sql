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
-- Table `mydb`.`Regiao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Regiao` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Regiao` (
  `codRegiao` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nomeRegiao` VARCHAR(100) NOT NULL,
  `descricaoRegiao` TEXT NULL,
  PRIMARY KEY (`codRegiao`),
  UNIQUE INDEX `codRegiao_UNIQUE` (`codRegiao` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`Vinicola`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Vinicola` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Vinicola` (
  `codVinicola` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nomeVinicola` VARCHAR(100) NOT NULL,
  `descricaoVinicola` TEXT NULL,
  `foneVinicola` VARCHAR(15) NULL,
  `emailVincola` VARCHAR(45) NULL,
  `Regiao_codRegiao` BIGINT UNSIGNED NOT NULL,
  PRIMARY KEY (`codVinicola`),
  UNIQUE INDEX `codVinicola_UNIQUE` (`codVinicola` ASC) VISIBLE,
  INDEX `fk_Vinicola_Regiao1_idx` (`Regiao_codRegiao` ASC) VISIBLE,
  CONSTRAINT `fk_Vinicola_Regiao1`
    FOREIGN KEY (`Regiao_codRegiao`)
    REFERENCES `mydb`.`Regiao` (`codRegiao`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`Vinho`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Vinho` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Vinho` (
  `codVinho` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nomeVinho` VARCHAR(50) NOT NULL,
  `tipoVinho` VARCHAR(30) NOT NULL,
  `anoVinho` INT UNSIGNED NOT NULL,
  `descricaoVinho` TEXT NULL,
  `Vinicola_codVinicola` BIGINT UNSIGNED NOT NULL,
  PRIMARY KEY (`codVinho`),
  UNIQUE INDEX `codVinho_UNIQUE` (`codVinho` ASC) VISIBLE,
  INDEX `fk_Viho_Vinicola_idx` (`Vinicola_codVinicola` ASC) VISIBLE,
  CONSTRAINT `fk_Viho_Vinicola`
    FOREIGN KEY (`Vinicola_codVinicola`)
    REFERENCES `mydb`.`Vinicola` (`codVinicola`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
