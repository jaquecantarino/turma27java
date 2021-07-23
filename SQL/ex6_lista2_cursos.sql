-- create database db_cursoDaMinhaVida;

-- use db_cursoDaMinhaVida;
/*create table tb_categoria (
	id bigint auto_increment,
    categoria varchar(60) not null,
    instrutor varchar(50) not null,
    nivel varchar(20) not null,
    primary key (id)
);*/
/* create table tb_cursos (
	matricula bigint auto_increment,
    titulo varchar(90) not null,
    duracao int(4) not null,
    valor decimal (5,2) not null,
    avaliacao int(1),
    idioma varchar(30) not null,
    categoria_id bigint,
    primary key (matricula),
    foreign key (categoria_id) references tb_categoria(id)
);*/

/* insert into tb_categoria (categoria,instrutor, nivel) values ("Tech","Guanabara","Básico");
insert into tb_categoria (categoria,instrutor, nivel) values ("Tech","Guanabara","Intermediario");
insert into tb_categoria (categoria,instrutor, nivel) values ("Tech","Guanabara","Avançado");
insert into tb_categoria (categoria,instrutor, nivel) values ("Idiomas","Camila","Básico");
insert into tb_categoria (categoria,instrutor, nivel) values ("Idiomas","Camila","Avançado"); */

/* insert into tb_cursos (titulo, duracao, valor, avaliacao, idioma, categoria_id ) values ("POO JAVA", 5, 29.99, 5, "Português", 1);
insert into tb_cursos (titulo, duracao, valor, avaliacao, idioma, categoria_id ) values ("POO Python", 5, 29.99, 5, "Inglês", 3);
insert into tb_cursos (titulo, duracao, valor, avaliacao, idioma, categoria_id ) values ("Inglês Nativo", 20, 129.99, 5, "Inglês", 5);
insert into tb_cursos (titulo, duracao, valor, avaliacao, idioma, categoria_id ) values ("Inglês Nativo", 20, 129.99, 5, "Português", 4);
insert into tb_cursos (titulo, duracao, valor, avaliacao, idioma, categoria_id ) values ("Inglês", 20, 159.99, 4, "Inglês", 5);
insert into tb_cursos (titulo, duracao, valor, avaliacao, idioma, categoria_id ) values ("HTML5", 5, 19.99, 5, "Português", 2); */

-- select * from tb_cursos

-- select * from tb_cursos where valor > 50.00

-- select * from tb_cursos where valor <13.00 and valor <60.00

-- select * from tb_cursos where titulo like "%j%"

-- select * from tb_cursos inner join tb_categoria on tb_categoria.id=tb_cursos.categoria_id

-- select * from tb_cursos inner join tb_categoria on tb_categoria.id=tb_cursos.categoria_id where categoria="Tech"