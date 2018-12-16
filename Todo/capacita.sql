CREATE DATABASE  IF NOT EXISTS Capacita;
Use Capacita;
-- Fernando Luque M.

create table Departamento
	(
		cve_depto char(3) not null ,
		descrip_depto varchar(100) not null Unique,
		primary key (cve_depto)
	) ;

create table Empleado
	(
		cve_emp integer not null ,
		descrip_apellido varchar(100) not null Unique,
		cve_depto char(3) not null References Departamento,
		primary key (cve_emp)
	) ;

create table Curso
	(
		cve_curso integer not null ,
		importe_costo Decimal(10,2) Default 9800,
		descrip_curso varchar(100) not null Unique,
		primary key (cve_curso)
	) ;

create table Emp_Curso
	(
		cve_emp		integer not null References Empleado,
		cve_curso	integer not null References Curso,
		fecha		date Default '2012-11-23',
		primary key (cve_curso, cve_emp)
	) ;

insert into Departamento Values('C01','compras');
insert into Departamento Values('B21','produccion');
insert into Departamento Values('E11','mercadotecnia');

insert into Empleado Values(30	,'Perez','C01');
insert into Empleado Values(250	,'Carrion','B21');
insert into Empleado Values(270	,'Rosano','E11');
insert into Empleado Values(300	,'Vera','B21');


insert into Curso Values(2,10000,'Control de inventarios');
insert into Curso Values(11,10000,'Negociacion');
insert into Curso Values(67,10000,'Ingria.de producto');
insert into Curso Values(141,10000,'Admon.proyectos');
insert into Curso Values(415,10000,'Analisis costo-beneficio');
insert into Curso Values(447,10000,'Control de calidad');


insert into Emp_Curso Values(30,141,'2012-12-21');
insert into Emp_Curso Values(250,2,now() );
insert into Emp_Curso Values(250,11,'2012-11-23');
insert into Emp_Curso Values(250,67,'2012-04-02');
insert into Emp_Curso Values(270,415,'2012-12-21');
insert into Emp_Curso Values(270,447,'2012-11-23');
insert into Emp_Curso Values(300,11,'2012-04-04');

SELECT SUM(importe_costo) FROM Departamento, Empleado, Curso, Emp_Curso 
WHERE Departamento.cve_depto	= Empleado.cve_depto
AND Empleado.cve_emp			= Emp_Curso.cve_emp
AND Curso.cve_curso				= Emp_Curso.cve_curso
AND Departamento.descrip_depto	= 'produccion'
