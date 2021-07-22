-- create database db_farmacia_do_bem;
-- use db_farmacia_do_bem;
/*create table tb_categoria(
	id bigint auto_increment,
    categoria varchar(60), -- perfumaria, higiene, etc.
    ativo boolean,
    fornecedor varchar(60),
	primary key(id)
);*/
/*create table tb_produto(
	registro bigint auto_increment,
	valor decimal(4,2) not null,
    descricao varchar(60) not null,
    generico boolean,
    receita boolean,
    categoria_id bigint,
	primary key(registro),
    foreign key (categoria_id) references tb_categoria (id)
);*/

/*insert into tb_categoria (categoria, ativo, fornecedor) values ("Maquiagem", true, "Ruby Rose");
insert into tb_categoria (categoria, ativo, fornecedor) values ("Higiene Pessoal", true, "Seda");
insert into tb_categoria (categoria, ativo, fornecedor) values ("Rémedio", true, "NeoQuimica");
insert into tb_categoria (categoria, ativo, fornecedor) values ("Rémedio", true, "Novartis");
insert into tb_categoria (categoria, ativo, fornecedor) values ("Perfumaria", true, "Dalas");*/

/*insert into tb_produto (valor, descricao, generico, receita, categoria_id) values (5.99, "Esmalte Verde", false, false, 5);
insert into tb_produto (valor, descricao, generico, receita, categoria_id) values (3.99, "Dorflex", true, false, 3);
insert into tb_produto (valor, descricao, generico, receita, categoria_id) values (33.99, "Omeprazol", false, true, 4);
insert into tb_produto (valor, descricao, generico, receita, categoria_id) values (1.99, "Lixa de Unha", false, false, 5);
insert into tb_produto (valor, descricao, generico, receita, categoria_id) values (15.99, "Pó Compacto", false, false, 1);
insert into tb_produto (valor, descricao, generico, receita, categoria_id) values (45.99, "Kit Cachos", false, false, 2);
insert into tb_produto (valor, descricao, generico, receita, categoria_id) values (45.99, "Aparelho Auditivo", true, true, 4);
insert into tb_produto (valor, descricao, generico, receita, categoria_id) values (9.99, "Batom", false, false, 1);*/

-- select * from tb_produto where valor > 50.00

-- select * from tb_produto where valor > 3.00 and valor < 60.00

-- select * from tb_produto where descricao like "%b%"

-- select * from tb_produto inner join tb_categoria on tb_categoria.id=tb_produto.categoria_id

/* select * from tb_produto inner join tb_categoria on tb_categoria.id=tb_produto.categoria_id 
where tb_categoria.id=2 */