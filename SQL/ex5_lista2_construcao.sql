-- create database db_construindo_a_nossa_vida

-- use db_construindo_a_nossa_vida;
/*create table tb_categoria (
	id bigint auto_increment,
    finalidade varchar(60) not null,
    ativo boolean not null,
	fornecedor varchar(60),
    primary key (id)
);*/

/*create table tb_produto (
	registro bigint auto_increment,
    descricao varchar(70) not null,
    valor decimal(5,2) not null,
    cor varchar(50),
    corredor int(2),
    tamanho varchar(60),
    categoria_id bigint,
    primary key (registro),
    foreign key (categoria_id) references tb_categoria(id)
);*/

/* insert into tb_categoria (finalidade,ativo,fornecedor) values ("Acabamento",true,"ColorPlus");
insert into tb_categoria (finalidade,ativo,fornecedor) values ("Estrutura",true,"Rave");
insert into tb_categoria (finalidade,ativo,fornecedor) values ("Estética",true,"SuzanTur");
insert into tb_categoria (finalidade,ativo,fornecedor) values ("Ferragem",true,"AmorContru");
insert into tb_categoria (finalidade,ativo,fornecedor) values ("Decoração",true,"ColorDecor"); */

/* insert into tb_produto (descricao, valor, cor, corredor, tamanho, categoria_id) values ("Tinta PVA",118.96,"Esmeralda",63,"18 Litros",1);
insert into tb_produto (descricao, valor, cor, corredor, tamanho, categoria_id) values ("Tinta PVA",118.96,"Azul",63,"18 Litros",1);
insert into tb_produto (descricao, valor, cor, corredor, tamanho, categoria_id) values ("Cano PVC",15.23,"Branco",15,"1 metro",2);
insert into tb_produto (descricao, valor, corredor, tamanho, categoria_id) values ("Barra de Ferro",25.99,25,"1 metro",4);*/

/* select * from tb_produto */

-- select * from tb_produto where valor > 50.00

-- select * from tb_produto where valor >15.00 and valor <50.00

-- select * from tb_produto where descricao like "%c%"

-- select * from tb_produto inner join tb_categoria on tb_categoria.id=tb_produto.categoria_id

-- select * from tb_produto inner join tb_categoria on tb_categoria.id=tb_produto.categoria_id where descricao like "%tinta%"