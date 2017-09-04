drop database if exists Registro;
create database Registro;
use Registro;
create table Registro(
IdNombre int primary key AUTO_INCREMENT,
Nombre varchar(15),
ApellidoP varchar(15),
ApellidoM varchar(15),
Escuela varchar(15)
);

select * from Registro;