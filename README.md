# ev2_ej1_bbdd / Ejercicio de ACD: BBDD / 25-11-2024

Dada una bbdd con trabajadores y departamentos en MySQL:
1. Mostrar todos los departamentos.
2. Mostrar todos los empleados del dep 10, atributos: Apellido, Oficio y Salario
3. Mostrar el empleado con mayor salario, atributos: Apellido, Salario y Departamento
4. Realizar los puntos anteriores mediante procedimientos almacenados.

# Base de datos utilizada
```bash
create database empresa;

use empresa;

CREATE TABLE departamentos (
 dept_no  TINYINT NOT NULL PRIMARY KEY,
 dnombre  VARCHAR(15), 
 loc      VARCHAR(15)
) ENGINE=InnoDB;

INSERT INTO departamentos VALUES 
(10, 'CONTABILIDAD', 'SEVILLA'),
(20, 'INVESTIGACION', 'MADRID'),
(30, 'VENTAS', 'BARCELONA'),
(40, 'PRODUCCION', 'BILBAO');

CREATE TABLE empleados (
 emp_no    SMALLINT NOT NULL PRIMARY KEY,
 apellido  VARCHAR(10),
 oficio    VARCHAR(10),
 dir       SMALLINT,
 fecha_alt DATE,
 salario   FLOAT(6,2),
 comision  FLOAT(6,2),
 dept_no   TINYINT NOT NULL,
 CONSTRAINT FK_DEP FOREIGN KEY (dept_no) REFERENCES departamentos(dept_no)
) ENGINE=InnoDB;

INSERT INTO empleados VALUES 
(7369, 'SANCHEZ', 'EMPLEADO', 7902, '1990-12-17', 1040, NULL, 20),
(7499, 'ARROYO', 'VENDEDOR', 7698, '1990-02-20', 1500, 390, 30),
(7521, 'SALA', 'VENDEDOR', 7698, '1991-02-22', 1625, 650, 30),
(7566, 'JIMENEZ', 'DIRECTOR', 7839, '1991-04-02', 2900, NULL, 20),
(7654, 'MARTIN', 'VENDEDOR', 7698, '1991-09-29', 1600, 1020, 30),
(7698, 'NEGRO', 'DIRECTOR', 7839, '1991-05-01', 3005, NULL, 30),
(7782, 'CEREZO', 'DIRECTOR', 7839, '1991-06-09', 2885, NULL, 10),
(7788, 'GIL', 'ANALISTA', 7566, '1991-11-09', 3000, NULL, 20),
(7839, 'REY', 'PRESIDENTE', NULL, '1991-11-17', 4100, NULL, 10),
(7844, 'TOVAR', 'VENDEDOR', 7698, '1991-09-08', 1350, 0, 30),
(7876, 'ALONSO', 'EMPLEADO', 7788, '1991-09-23', 1430, NULL, 20),
(7900, 'JIMENO', 'EMPLEADO', 7698, '1991-12-03', 1335, NULL, 30),
(7902, 'FERNANDEZ', 'ANALISTA', 7566, '1991-12-03', 3000, NULL, 20),
(7934, 'MUNOZ', 'EMPLEADO', 7782, '1992-01-23', 1690, NULL, 10);

SELECT * FROM empleados;
SELECT * FROM departamentos;

```
