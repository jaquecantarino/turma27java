/* use db_rhempresa;

create table tb_funcionaries(
	id bigint(5) auto_increment,
	nome varchar(50) not null,
	idade int (2),
	ativo boolean,
	salario decimal (10,2),
	primary key (id)
); */

/* insert into tb_funcionaries (nome, idade, ativo, salario ) values ("Maria", 26, true, 1256.50);
insert into tb_funcionaries (nome, idade, ativo, salario ) values ("João", 31, true, 2896.57);
insert into tb_funcionaries (nome, idade, ativo, salario ) values ("Aline", 36, true, 1256.56);
insert into tb_funcionaries (nome, idade, ativo, salario ) values ("Felipe", 28, true, 3458.96);
insert into tb_funcionaries (nome, idade, ativo, salario ) values ("Babi", 26, true, 3689.23); */

-- select * from tb_funcionaries;

-- select * from tb_funcionaries where salario < 2000.00;

	/*update tb_funcionaries set salario = 4256.85 
	where id = 5;*/
    
    /*select * from tb_funcionaries;*/