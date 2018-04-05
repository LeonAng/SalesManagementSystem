/*数据库初始化*/
create database If Not Exists salesmanagementsystem;

use salesmanagementsystem;

create table users
(
	name varchar(30) primary key not null,
	keyword varchar(30) not null
);
insert into users values("leon","11235");
insert into users values("tom","00000");
insert into users values("jerry","00000");