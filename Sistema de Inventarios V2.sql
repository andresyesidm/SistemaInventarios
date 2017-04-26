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

insert into Sucursal (Sucursal_Id,Nombre,Direccion,Telefono,Ciudad)values (1,'Bodega','Calle...','3434555','Bogota');
insert into UsuarioLogin (Usua_Id,Usua_Pass,Rol,Nombre,Direccion,Correo,Telefono,Sucursal_Id) values (1,'81dc9bdb52d04dc20036dbd8313ed055','admin','admin','call3','cgc','534',1);

select * from UsuarioLogin where Nombre='admin' and Usua_Pass='81dc9bdb52d04dc20036dbd8313ed055'