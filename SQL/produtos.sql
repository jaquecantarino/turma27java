use db_estoque;

create table tb_produtos(
	id bigint auto_increment,
    nome varchar(30) not null,
    preco decimal(10,2),
    marca_id bigint not null,
    
    primary key (id)
    foreign key (marca_id) - references tb_marcas (id)
);