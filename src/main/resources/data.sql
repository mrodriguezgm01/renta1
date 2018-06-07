/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  pc
 * Created: 28/04/2018
 */

insert into estacion(nombre,latitud,longitud,cantidad_disponible,estado,fecha_crea)
values('E1', '10','11',2,'REGISTRADO',CURRENT_TIMESTAMP());
insert into estacion(nombre,latitud,longitud,cantidad_disponible,estado,fecha_crea)
values('E2', '20','21',3,'REGISTRADO',CURRENT_TIMESTAMP());
insert into estacion(nombre,latitud,longitud,cantidad_disponible,estado,fecha_crea)
values('E3', '30','31',4,'REGISTRADO',CURRENT_TIMESTAMP());
insert into estacion(nombre,latitud,longitud,cantidad_disponible,estado,fecha_crea)
values('E4', '40','41',1,'REGISTRADO',CURRENT_TIMESTAMP());

insert into bicicleta(numero,estado,cod_estacion) values('B1', 'DISPONIBLE',1);
insert into bicicleta(numero,estado,cod_estacion) values('B2', 'DISPONIBLE',1);
insert into bicicleta(numero,estado,cod_estacion) values('B3', 'DISPONIBLE',2);
insert into bicicleta(numero,estado,cod_estacion) values('B4', 'DISPONIBLE',2);
insert into bicicleta(numero,estado,cod_estacion) values('B5', 'DISPONIBLE',2);
insert into bicicleta(numero,estado,cod_estacion) values('B6', 'DISPONIBLE',3);
insert into bicicleta(numero,estado,cod_estacion) values('B7', 'DISPONIBLE',3);
insert into bicicleta(numero,estado,cod_estacion) values('B8', 'DISPONIBLE',3);
insert into bicicleta(numero,estado,cod_estacion) values('B9', 'DISPONIBLE',3);
insert into bicicleta(numero,estado,cod_estacion) values('B10', 'DISPONIBLE',4);



