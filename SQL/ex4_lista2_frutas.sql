-- create database db_cidade_das_frutas;

use db_cidade_das_frutas;
/*create table tb_categoria(
	id bigint auto_increment,
    tipo varchar(60), -- citrica, etc.
    fornecedor varchar (60),
    corredor int,
    primary key (id)
);*/
/*create table tb_produto(
	registro bigint auto_increment,
	nome varchar(30),
    valor decimal(3,2),
    epoca varchar(20),
    poupa boolean,
    delivery boolean,
    categoria_id bigint,
    primary key (registro),
    foreign key (categoria_id) references tb_categoria (id)
);*/

/*insert into tb_categoria (tipo,fornecedor,corredor) values ("Citrica","Fazenda Souza",3);
insert into tb_categoria (tipo,fornecedor,corredor) values ("Doce","Fazenda Lima",6);
insert into tb_categoria (tipo,fornecedor,corredor) values ("Citrica","Fazenda Lima",3);
insert into tb_categoria (tipo,fornecedor,corredor) values ("Doce","Fazenda Souza",6);
insert into tb_categoria (tipo,fornecedor,corredor) values ("Vermelha","Fazenda Alric",2);*/

/*insert into tb_produto(nome,valor,epoca,poupa,delivery,categoria_id) values ("Maça",1.99,"Dezembro",true,true,4);
insert into tb_produto(nome,valor,epoca,poupa,delivery,categoria_id) values ("Kiwi",1.99,"Abril",true,true,1);
insert into tb_produto(nome,valor,epoca,poupa,delivery,categoria_id) values ("Melancia",9.99,"Outubro",true,false,2);
insert into tb_produto(nome,valor,epoca,poupa,delivery,categoria_id) values ("Acabacate",4.99,"Setembro",true,true,1);
insert into tb_produto(nome,valor,epoca,poupa,delivery,categoria_id) values ("Laranja",0.99,"Setembro",true,true,3);
insert into tb_produto(nome,valor,epoca,poupa,delivery,categoria_id) values ("Pera",6.99,"Março",true,true,4);
insert into tb_produto(nome,valor,epoca,poupa,delivery,categoria_id) values ("Morango",7.99,"Julho",true,true,5);
insert into tb_produto(nome,valor,epoca,poupa,delivery,categoria_id) values ("Uva",5.99,"Outubro",true,true,3);*/

-- select * from tb_produto where valor > 50.00

-- select * from tb_produto where valor >3.00 and valor<60.00

-- select * from tb_produto where nome like "%c%"

-- select * from tb_produto inner join tb_categoria on tb_categoria.id=tb_produto.categoria_id

-- select * from tb_produto inner join tb_categoria on tb_categoria.id=tb_produto.categoria_id where tb_categoria.id=3

