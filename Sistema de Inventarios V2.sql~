CREATE DATABASE SistemaInventarios

CREATE TABLE Sucursal(
	Sucursal_Id int not null primary key,
	Nombre varchar(50) not null,
	Direccion varchar(50) not null,
	Telefono varchar(15) not null,
	Ciudad varchar(50) not null

);

CREATE TABLE UsuarioLogin(
	Usua_Id int not null primary key,
	Usua_Pass varchar(32) not null,
	Rol varchar(20) not null,
	Nombre varchar(50) not null,
	Direccion varchar(50) not null,
	Correo varchar(50) not null,
	Telefono varchar(15) not null,
	Sucursal_Id int references Sucursal(Sucursal_Id)
);
CREATE TABLE Proveedor(
	Prov_Id int not null primary key,
	Nombre varchar(50) not null,
	Ciudad varchar(30) not null,
	Direccion varchar(50) not null,
	Correo varchar(50) not null,
	Telefono varchar(15) not null
);
CREATE TABLE Cliente(
	Clie_Id int not null primary key,
	Nombre varchar(50) not null,
	Ciudad varchar(30) not null,
	Direccion varchar(50) not null,
	Correo varchar(50) not null,
	Telefono varchar(15) not null
);
CREATE TABLE Inventario(
	Inv_Id int not null primary key,
	CantidadIngreso int,
	CantidadSalida int,
	Usua_Id int references UsuarioLogin(Usua_Id),
	Sucursal_Id int references Sucursal(Sucursal_Id)
);
CREATE TABLE Producto(
	Product_Id int not null primary key,
	Nombre varchar(50) not null,
	Valor money not null
);
CREATE TABLE Compra(
	Comp_Id int not null primary key,
	Fecha timestamp not null,
	Valor money not null,
	Prov_Id int references Proveedor(Prov_Id),
	Usua_Id int references UsuarioLogin(Usua_Id),
	Sucursal_Id int references Sucursal(Sucursal_Id)
);
CREATE TABLE Venta(
	Venta_Id int not null primary key,
	Fecha timestamp not null,
	IVA money,
	Valor money not null,
	Clie_Id int references Cliente(Clie_Id),
	Usua_Id int references UsuarioLogin(Usua_Id),
	Sucursal_Id int references Sucursal(Sucursal_Id)
);
CREATE TABLE Cotizacion(
	Coti_Id int not null primary key,
	Valor money not null
);
CREATE TABLE Inv_Producto(
	Inv_Id int references Inventario(Inv_Id),
	Product_Id int references Producto(Product_Id),
	Cantidad int not null
);
CREATE TABLE Comp_Producto(
	Comp_Id int references Compra(Comp_Id),
	Product_Id int references Producto(Product_Id),
	Cantidad int not null
);
CREATE TABLE Venta_Producto(
	Venta_Id int references Venta(Venta_Id),
	Product_Id int references Producto(Product_Id),
	Cantidad int not null
);
CREATE TABLE Coti_Producto(
	Coti_Id int references Cotizacion(Coti_Id),
	Product_Id int references Producto(Product_Id),
	Cantidad int not null
);

-----------------------------------------------------------------------------------------------------------------------
-- INSERCIONES
-----------------------------------------------------------------------------------------------------------------------

insert into Sucursal (Sucursal_Id,Nombre,Direccion,Telefono,Ciudad)values (1,'Bodega','Calle...','3434555','Bogota');
insert into UsuarioLogin (Usua_Id,Usua_Pass,Rol,Nombre,Direccion,Correo,Telefono,Sucursal_Id) values (1,'81dc9bdb52d04dc20036dbd8313ed055','admin','admin','call3','cgc','534',1);

-----------------------------------------------------------------------------------------------------------------------
-- VISTAS
-----------------------------------------------------------------------------------------------------------------------

CREATE OR REPLACE VIEW Login AS SELECT Usua_Id AS Identificacion,Usua_Pass AS Contraseña, Rol FROM UsuarioLogin;

CREATE OR REPLACE VIEW AdministracionUsuarios AS SELECT Usua_Id AS Identificacion, Rol, Nombre, Direccion,Correo,Telefono FROM UsuarioLogin;

-----------------------------------------------------------------------------------------------------------------------
--TRIGGER
-----------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE FUNCTION RegistroUsuarios() RETURNS TRIGGER AS $$
DECLARE
Id int;
Pass varchar(50);
Rol varchar(50);
Nombre varchar(50);
Direccion varchar(50);
Correo varchar(50);
Telefono varchar(50);
Sucursal int;
BEGIN
SELECT NEW.Usua_Id INTO Id FROM dual;
SELECT NEW.Usua_Pass INTO Pass FROM dual;
SELECT NEW.Rol INTO Rol FROM dual;
SELECT NEW.Nombre INTO Nombre FROM dual;
SELECT NEW.Direccion INTO Direccion FROM dual;
SELECT NEW.Correo INTO Correo FROM dual;
SELECT NEW.Telefono INTO Telefono FROM dual;
SELECT NEW.Sucursal_Id INTO Sucursal FROM dual;
INSERT INTO UsuarioLogin (Usua_Id,Usua_Pass,Rol,Nombre,Direccion,Correo,Telefono,Sucursal_Id) VALUES 
(Id,Pass,Rol,Nombre,Direccion,Correo,Telefono,Sucursal);
--EXCEPTION
RAISE NOTICE 'ERROR';
ROLLBACK;
END;
$$LANGUAGE 'plpgsql';

CREATE TRIGGER RegistroUsuario
BEFORE INSERT ON UsuarioLogin
FOR EACH ROW
EXECUTE PROCEDURE RegistroUsuarios();

insert into UsuarioLogin (Usua_Id,Usua_Pass,Rol,Nombre,Direccion,Correo,Telefono,Sucursal_Id) values (1,'81dc9bdb52d04dc20036dbd8313ed055','admin','admin','call3','cgc','534',1);
---------------------------------------------------------------------
CREATE OR REPLACE FUNCTION RegistroUsuarios() RETURN TRIGGER AS $$
BEGIN
INSERT INTO UsuarioLogin (Usua_Id,Usua_Pass,Rol,Nombre,Direccion,Correo,Telefono,Sucursal_Id) VALUES 
(NEW.Usua_Id,NEW.Usua_Pass,NEW.Rol,NEW.Nombre,NEW.Direccion,NEW.Telefono,NEW.Sucursal);
EXCEPTION
PRINT 'ERROR'
ROLLBACK;
END;

CREATE TRIGGER RegistroUsuario
BEFORE INSERT ON UsuarioLogin
FOR EACH ROW
EXECUTE PROCEDURE RegistroUsuarios();



select * from UsuarioLogin where Nombre='admin' and Usua_Pass='81dc9bdb52d04dc20036dbd8313ed055'


