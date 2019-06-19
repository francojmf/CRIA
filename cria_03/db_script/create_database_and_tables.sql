create database back_end_cria2;
create user francojmf@'%' identified by '1245';
grant all on back_end_cria2.* to francojmf@'%';

use back_end_cria2;
create table papel(id long, descricao varchar(100));
insert into papel values(1,"ADMINISTRADOR");
insert into papel values(2,"GERENTE");
insert into papel values(3,"COLABORADOR");
insert into papel values(4,"ENTIDADE");

create table usuario(id long, nomeusuario varchar(50), senha varchar(50), nome varchar(50), entidade varchar(50), 
	cpf varchar(20), telefone varchar(50), id_cidade long, obs varchar(100),id_papel long);
insert into usuario values(1,"francojmf@hotmail.com", "abcd", "João Manoel Franco", "FATEC-SJC",
	"012.345.678-90","12 982 161650",2, "Analista de Sistemas",1);
insert into usuario values(2,"ander.limabr@gmail.com", "xyz", "Anderson Lima", "UNIFESP",
	"345.678.901-23","12 987 543210",1,"Mestrando de 2019",2);

create table cidade(id long, cidade varchar(50));
insert into cidade values(1,"SÃO JOSÉ DOS CAMPOS-SP");
insert into cidade values(2,"JACAREÍ-SP");
insert into cidade values(3,"CAÇAPAVA-SP");
insert into cidade values(4,"SÃO PAULO-SP");
insert into cidade values(5,"SANTO ANDRÉ-SP");
insert into cidade values(6,"TAUBATÉ-SP");
insert into cidade values(7,"Outra cidade");

create table usuario_papel(id_usuario long, id_papel long);
insert into usuario_papel values(1,1);
insert into usuario_papel values(2,2);


create table pedido(id long, entidade varchar(50), cnpj varchar(20), nomecri varchar(50), idade long, medA long, medB long, medC long, medD long, medE long, medF long, obs varchar(100));

create table aprovado(id_usuario long, aprovado boolean);
insert into aprovado values(1,true);
insert into aprovado values(2,true);