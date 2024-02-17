CREATE DATABASE  IF NOT EXISTS `stockbarn` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `stockbarn`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: stockbarn
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `inventario`
--

DROP TABLE IF EXISTS `inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cantidadUnidades` int DEFAULT NULL,
  `estante` varchar(50) NOT NULL,
  `productoId` int DEFAULT NULL,
  `productos_sacados` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `productoId` (`productoId`),
  CONSTRAINT `inventario_ibfk_1` FOREIGN KEY (`productoId`) REFERENCES `productos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario`
--

LOCK TABLES `inventario` WRITE;
/*!40000 ALTER TABLE `inventario` DISABLE KEYS */;
INSERT INTO `inventario` VALUES (2,15,'estante',15,585),(4,746,'12BC',17,664),(5,250,'13e',19,1050),(6,700,'6bc',20,0);
/*!40000 ALTER TABLE `inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `presentacion` varchar(50) DEFAULT NULL,
  `categoria` varchar(30) DEFAULT NULL,
  `marca` varchar(50) DEFAULT NULL,
  `provedor` varchar(50) DEFAULT NULL,
  `lote` varchar(30) DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `disponibilidad` bit(1) NOT NULL DEFAULT (1),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (15,'prueba','presentacion','Avicultura','marca','provedor','lote','anotacion',_binary ''),(17,'ringo cachorros','2Kg','Mascotas','ringo','generic','123345','Sabor a carne y verduras',_binary ''),(19,'caballo fiel plus manzana','40Kg','Equinos','caballo fiel','nogal','1234','ninguna',_binary ''),(20,'pericos','500gr','Avicultura','piamontina','agro campo','12334e','ninguna',_binary '\0');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos_sacados`
--

DROP TABLE IF EXISTS `productos_sacados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos_sacados` (
  `id` int NOT NULL AUTO_INCREMENT,
  `productoId` int DEFAULT NULL,
  `fecha` date NOT NULL,
  `cantidad_sacada` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `productoId` (`productoId`),
  CONSTRAINT `productos_sacados_ibfk_1` FOREIGN KEY (`productoId`) REFERENCES `productos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos_sacados`
--

LOCK TABLES `productos_sacados` WRITE;
/*!40000 ALTER TABLE `productos_sacados` DISABLE KEYS */;
INSERT INTO `productos_sacados` VALUES (1,19,'2023-05-27',200),(2,17,'2023-05-28',90),(3,15,'2023-05-28',100),(4,17,'2023-05-28',10),(5,15,'2023-05-28',300),(6,19,'2023-05-28',50),(7,17,'2023-05-28',50),(8,17,'2023-05-28',4),(9,15,'2023-05-29',185),(10,19,'2023-07-24',400);
/*!40000 ALTER TABLE `productos_sacados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `compania` varchar(50) DEFAULT NULL,
  `rol` varchar(30) DEFAULT NULL,
  `correo` varchar(60) NOT NULL,
  `contrasena` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (4,'usuari1','usuario','calle 1','1998-11-01','stockbarn','Empleado','usuario1@gmail.com','122b738600a0f74f7c331c0ef59bc34c');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-17 11:07:56
