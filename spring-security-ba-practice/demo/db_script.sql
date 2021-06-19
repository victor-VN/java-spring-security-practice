create database my_security_db;

use my_security_db;

create table usr (

	id int not null auto_increment primary key,
    username varchar(150),
    usr_password varchar(250),
    authorities varchar(250)

);

insert into usr values(DEFAULT, 'admin', 'admin', 'ROLE_USER');

select * from usr;