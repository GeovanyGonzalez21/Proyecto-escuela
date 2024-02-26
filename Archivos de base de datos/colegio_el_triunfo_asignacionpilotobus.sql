CREATE DATABASE  IF NOT EXISTS `colegio_el_triunfo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `colegio_el_triunfo`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: colegio_el_triunfo
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `asignacionpilotobus`
--

DROP TABLE IF EXISTS `asignacionpilotobus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignacionpilotobus` (
  `CodigoAsignacion` int NOT NULL,
  `CodigoPiloto` int NOT NULL,
  `CodigoAutobus` int NOT NULL,
  `RutaAsignada` varchar(70) NOT NULL,
  PRIMARY KEY (`CodigoAsignacion`),
  UNIQUE KEY `CodigoPiloto_UNIQUE` (`CodigoPiloto`),
  UNIQUE KEY `CodigoAutobus_UNIQUE` (`CodigoAutobus`),
  KEY `CodigoPiloto_idx` (`CodigoPiloto`),
  KEY `CodigoAutobus_idx` (`CodigoAutobus`),
  CONSTRAINT `CodigoAutobus` FOREIGN KEY (`CodigoAutobus`) REFERENCES `autobus` (`CodigoAutobus`),
  CONSTRAINT `CodigoPiloto` FOREIGN KEY (`CodigoPiloto`) REFERENCES `piloto` (`CodigoPiloto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignacionpilotobus`
--

LOCK TABLES `asignacionpilotobus` WRITE;
/*!40000 ALTER TABLE `asignacionpilotobus` DISABLE KEYS */;
INSERT INTO `asignacionpilotobus` VALUES (1,1,1,'Amatitlán, Residencial Flor de campo, Residencial las victorias,');
/*!40000 ALTER TABLE `asignacionpilotobus` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-07 22:58:48
