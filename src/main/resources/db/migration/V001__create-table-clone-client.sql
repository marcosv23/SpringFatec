create table if not exists cliente(
id int not null auto_increment,
nome varchar(60) not null,
email varchar(225) not null,
telefone varchar(20) not null,
primary key (id)
);