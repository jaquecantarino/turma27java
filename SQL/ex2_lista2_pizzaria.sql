-- create database db_pizzaria_legal;

/*use db_pizzaria_legal;

create table tb_categoria (
	id bigint auto_increment,
    tipo varchar(30) not null,
    tamanho varchar(30) not null,
    rodizio boolean,
    primary key (id)
);*/

/*use db_pizzaria_legal;

create table tb_pizza (
	id bigint auto_increment,
    sabor varchar(30) not null,
    valor decimal(6,2) not null,
    borda varchar(20),
    massa varchar(30), -- fina ou supreme
    adicional varchar(50),
    categoria_id bigint,
    primary key (id),
    foreign key (categoria_id) REFERENCES tb_categoria (id)
);*/

/*insert into tb_categoria (tipo,tamanho,rodizio) values ("Doce","Grande",true);
insert into tb_categoria (tipo,tamanho,rodizio) values ("Doce","Média",false);
insert into tb_categoria (tipo,tamanho,rodizio) values ("Salgada","Grande",true);
insert into tb_categoria (tipo,tamanho,rodizio) values ("Salgada","Média",false);
insert into tb_categoria (tipo,tamanho,rodizio) values ("Salgada","Média",false);*/

/*insert into tb_pizza (sabor,valor,borda,massa,adicional,categoria_id) values ("Calabresa",39.99,"Catupiry","Suprema","Bacon",3);
insert into tb_pizza (sabor,valor,borda,massa,adicional,categoria_id) values ("Mussarela",39.99,"Catupiry","Fina","Azeitona",4);
insert into tb_pizza (sabor,valor,borda,massa,adicional,categoria_id) values ("Brigadeiro",59.99,"Ao Leite","Fina","Granulado",1);
insert into tb_pizza (sabor,valor,borda,massa,adicional,categoria_id) values ("Banana com Canela",35.99,"Ao Leite","Supreme","Mel",1);
insert into tb_pizza (sabor,valor,borda,massa,adicional,categoria_id) values ("Lombo",39.99,"Catupiry","Suprema","Catupiry",5);
insert into tb_pizza (sabor,valor,borda,massa,adicional,categoria_id) values ("Canadense",49.99,"Catupiry","Fina","Catupiry",3);
insert into tb_pizza (sabor,valor,borda,massa,adicional,categoria_id) values ("Beijinho",49.99,"Ao Leite","Fina","Limão",2);
insert into tb_pizza (sabor,valor,borda,massa,adicional,categoria_id) values ("Paçoca",32.99,"Doce de Leite","Supreme","Amendoim",2);*/

-- select * from tb_pizza where valor > 45.00

-- select * from tb_pizza where valor > 29.00 and valor <60.00;

-- select * from tb_pizza where sabor like "%c%"

-- select * from tb_pizza inner join tb_categoria on tb_categoria.id=tb_pizza.categoria_id

-- select * from tb_pizza inner join tb_categoria on tb_categoria.id=tb_pizza.categoria_id where tb_categoria.id=2