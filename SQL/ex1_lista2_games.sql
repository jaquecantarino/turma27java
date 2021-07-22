use db_generation_game_online;

/*create table tb_classe (
	id bigint auto_increment,
    tipo varchar(50) not null, -- mistico, mutante, etc.
    mundo varchar(10) not null, -- planeta x, hell, etc.    
	primary key (id)
);*/

/*create table tb_personagem (
	id bigint auto_increment,
	nome varchar(50) not null, -- mistico, mutante, etc.
    ataque int(5) not null,
    defesa int (5) not null,
    poder varchar(15) not null, -- tipo de poder
    cor varchar(10),
    classe_id bigint,
	primary key (id),
    foreign key (classe_id) references tb_classe (id)
);*/

/* INSERT INTO tb_classe (tipo, mundo) VALUES ("Mistico","Plan Azul");
INSERT INTO tb_classe (tipo, mundo) VALUES ("Mutante","Galaxia 3");
INSERT INTO tb_classe (tipo, mundo) VALUES ("Techno","Terra");
INSERT INTO tb_classe (tipo, mundo) VALUES ("Força","Areia");
INSERT INTO tb_classe (tipo, mundo) VALUES ("Magia","Saturno");*/

/* INSERT INTO tb_personagem (nome, ataque, defesa, poder, cor,classe_id) VALUES ("Babi",6000,3500,"Ar","Verde",2);
INSERT INTO tb_personagem (nome, ataque, defesa, poder, cor,classe_id) VALUES ("Lucas",4000,1500,"Ler Mente","Vermelho",5);
INSERT INTO tb_personagem (nome, ataque, defesa, poder, cor,classe_id) VALUES ("Fefe",9000,4500,"Hacker","Azul",3);
INSERT INTO tb_personagem (nome, ataque, defesa, poder, cor,classe_id) VALUES ("PL",5000,900,"Velocidade","Cinza",4);
INSERT INTO tb_personagem (nome, ataque, defesa, poder, cor,classe_id) VALUES ("Jo",6000,500,"Força","Vermelho",1);
INSERT INTO tb_personagem (nome, ataque, defesa, poder, cor,classe_id) VALUES ("Espantalho",1000,6600,"Muralha","Rosa",1);
INSERT INTO tb_personagem (nome, ataque, defesa, poder, cor,classe_id) VALUES ("Naruto",8000,3000,"Jutso","Laranja",2);
INSERT INTO tb_personagem (nome, ataque, defesa, poder, cor,classe_id) VALUES ("Hulk",9000,9500,"Super Força","Verde",2);*/

-- select * from tb_personagem where ataque > 2000

-- select * from tb_personagem where defesa > 1000 and defesa < 2000

-- select * from tb_personagem where nome like "%c%"

/*select * from tb_personagem inner join tb_classe on tb_classe.id=tb_personagem.classe_id 
where tb_classe.id=3*/



