-- create database db_ecommerce;
/* use db_ecommerce;

create table tb_produtos (
 id bigint (4) auto_increment,
 descricao varchar (50) not null,
 preco decimal (10,2) not null,
 estoque int (3) not null,
 tamanho int (2) not null,
 marca varchar (20),
 primary key (id)
); */

/*insert into tb_produtos (descricao, preco, estoque, tamanho, marca) values ("Calça", 129.85, 5, "46", "Gucci");
insert into tb_produtos (descricao, preco, estoque, tamanho, marca) values ("Calça", 129.85, 2, "40", "Gucci");
insert into tb_produtos (descricao, preco, estoque, tamanho, marca) values ("Calça", 129.85, 3, "36", "Gucci");
insert into tb_produtos (descricao, preco, estoque, tamanho, marca) values ("Bolsa", 896.45, 2, "00", "Valentino");
insert into tb_produtos (descricao, preco, estoque, tamanho, marca) values ("Tênis", 189.89, 2, "36", "All Star");
insert into tb_produtos (descricao, preco, estoque, tamanho, marca) values ("Tênis", 189.89, 2, "39", "All Star");
insert into tb_produtos (descricao, preco, estoque, tamanho, marca) values ("Tênis", 189.89, 2, "34", "All Star");
insert into tb_produtos (descricao, preco, estoque, tamanho, marca) values ("Blusa", 89.96, 2, "52", "Aeropostale");*/

-- select * from tb_produtos where preco > 500.00;

-- select * from tb_produtos where preco < 500.00;

-- update tb_produtos set preco = 145.96 where id = 3;

-- select * from tb_produtos;