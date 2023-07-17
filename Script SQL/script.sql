-- Database: oxxo

-- DROP DATABASE IF EXISTS oxxo;

CREATE DATABASE oxxo;
USE oxxo;
	
/*Creación de tablas*/
	
CREATE TABLE consulta(
	id_consulta SERIAL PRIMARY KEY,
	motivo VARCHAR(100),
	cliente_nombre VARCHAR(100),
	cliente_apellido VARCHAR(100),
	cliente_correo VARCHAR(500),
	cliente_telefono INT,
	tienda VARCHAR(500),
	comentario VARCHAR(1000)
);

CREATE TABLE categoria(
  id_categoria SERIAL PRIMARY KEY,
  nombre VARCHAR(100) DEFAULT NULL
);

CREATE TABLE `compra` (
  `idcompra` int NOT NULL AUTO_INCREMENT,
  `fecha` varchar(45) DEFAULT NULL,
  `cliente_idcliente` int NOT NULL,
  PRIMARY KEY (`idcompra`),
  KEY `fk_compra_cliente1_idx` (`cliente_idcliente`),
  CONSTRAINT `fk_compra_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`)
);

CREATE TABLE `detallecompra` (
  `iddetallecompra` int NOT NULL AUTO_INCREMENT,
  `compra_idcompra` int NOT NULL,
  `producto_idproducto` int NOT NULL,
  PRIMARY KEY (`iddetallecompra`),
  KEY `fk_detallecompra_compra1_idx` (`compra_idcompra`),
  KEY `fk_detallecompra_producto1_idx` (`producto_idproducto`),
  CONSTRAINT `fk_detallecompra_compra1` FOREIGN KEY (`compra_idcompra`) REFERENCES `compra` (`idcompra`),
  CONSTRAINT `fk_detallecompra_producto1` FOREIGN KEY (`producto_idproducto`) REFERENCES `producto` (`idproducto`)
);

CREATE TABLE producto (
  id_producto INT NOT NULL,
  nombre_producto VARCHAR(45) DEFAULT NULL,
  cantidad_producto INT DEFAULT NULL,
  precio_producto DOUBLE DEFAULT NULL,
  descripcion_producto VARCHAR(45) DEFAULT NULL,
  imagen_producto VARCHAR(45) DEFAULT NULL,
  categoria_id_categoria INT NOT NULL,
  PRIMARY KEY (idproducto),
  KEY fk_producto_categoria1_idx (categoria_idcategoria),
  CONSTRAINT fk_producto_categoria1 FOREIGN KEY (categoria_idcategoria) REFERENCES categoria (id_categoria)
);

CREATE TABLE cliente(
	id_cliente SERIAL PRIMARY KEY,
  	nombre_cliente VARCHAR(45) DEFAULT NULL,
  	apellido_cliente VARCHAR(45) DEFAULT NULL,
  	correo_cliente VARCHAR(45) DEFAULT NULL,
  	telefono_cliente VARCHAR(45) DEFAULT NULL
);

CREATE TABLE usuario(
	id_usuario INT NOT NULL PRIMARY KEY,
	nombre VARCHAR(45) NOT NULL,
	apellido_paterno VARCHAR(45) NOT NULL,
    apellido_materno VARCHAR(45) NOT NULL,
    telefono INT NOT NULL,
    correo VARCHAR(100) NOT NULL,
    direccion VARCHAR(500) NOT NULL,
	usuario VARCHAR(100) NOT NULL,
	contrasena VARCHAR(100) NOT NULL
);


/*Mostrar las tablas*/

SELECT * FROM consulta;

/*Insertar datos*/

INSERT INTO consulta (motivo,cliente_nombre,cliente_apellido,cliente_correo,cliente_telefono,tienda,comentario)
VALUES ('Consulta','Miguel Alonso','Guillen Medina','u19220707@utp.edu.pe',912350214,'OXXO - Av. Principal',
		'Buena atención al cliente.');