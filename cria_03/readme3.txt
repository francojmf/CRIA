
executar dentro do mysql:

C:\Users\franc>mysql -u root -p
source C:\FATEC\Lab_ES\cria_03\db_script\create_database_and_tables.sql

SHOW DATABASES;
USE back_end_cria2;
SHOW tables;
DESCRIBE usuario;
select * from  usuario;
Ctrl-C -- exit!

ALTER TABLE usuario CHANGE email nomeusuario varchar(100);

UPDATE table_name SET column1 = 'value1', column2 = 'value2' WHERE id=100;
UPDATE usuario SET nomeusuario='francojmf@hotmail.com' WHERE id=1;

ALTER TABLE cidade CHANGE descricao cidade varchar(50);
select * from  cidade;
insert into cidade(id, cidade) values(5,"SANTO ANDRÉ-SP");
insert into cidade(id, cidade) values(6,"TAUBATÉ-SP");
insert into cidade(id, cidade) values(7,"OUTRA");
cd C:\FATEC\Lab_ES\cria_03
gradle build

select * from  pedido;

cd C:\apache-tomcat-9.0.16\webapps
copiar arquivo .war
startup

localhost:8080/cria_03
