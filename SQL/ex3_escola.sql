-- create database dt_escola;

/*use dt_escola;

create table tb_estudantes(
	matricula bigint (6) auto_increment,
	nome varchar (50) not null,
	professor varchar (15) not null,
    sala int (3) not null,
    nota decimal (2,1) not null,
    primary key (matricula)
);*/

/*insert into tb_estudantes (nome, professor, sala, nota ) values ("Ana Clara", "Luana", 123, 7.5);*/

-- select * from tb_estudantes
-- select * from tb_estudantes

/*insert into tb_estudantes (nome, professor, sala, nota ) values ("Beatriz", "Luana", 123, 9.0);
insert into tb_estudantes (nome, professor, sala, nota ) values ("Carlos Eduardo", "Jane", 256, 5.6);
insert into tb_estudantes (nome, professor, sala, nota ) values ("Daniela", "Jane", 256, 8.6);
insert into tb_estudantes (nome, professor, sala, nota ) values ("Ester", "Fabio", 456, 5.2);
insert into tb_estudantes (nome, professor, sala, nota ) values ("Felipe", "Fabio", 456, 4.6);
insert into tb_estudantes (nome, professor, sala, nota ) values ("Gabriel", "Lucas", 523, 8.6);
insert into tb_estudantes (nome, professor, sala, nota ) values ("Hérica", "Lucas", 523, 9.4);*/

-- select * from tb_estudantes where nota>7;

-- select * from tb_estudantes where nota<7;

-- update tb_estudantes set nota = 9.6 where matricula=3;

-- select * from tb_estudantes;