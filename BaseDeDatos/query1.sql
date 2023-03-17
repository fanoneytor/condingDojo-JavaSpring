select * from usuarios;

select nombre, edad from usuarios;

select nombre, edad from usuarios where id = 2;

select * from usuarios where nombre like 'Alejandro';

-- Todas las personas que el nombre comienza con "Al"
select * from usuarios where nombre like "al%";

-- Despliega todas las columnas de la tabla de usuarios donde el nombre termine en "o"
select * from usuarios where nombre like "%o";

select * from usuarios where nombre like "%o" and edad > 24;

select * from usuarios where nombre like "%o" order by edad asc;

select * from usuarios order by nombre desc;

select * from usuarios order by nombre desc limit 3;

select * from usuarios order by nombre desc limit 1, 3;




