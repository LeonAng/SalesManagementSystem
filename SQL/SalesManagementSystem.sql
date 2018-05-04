/*数据库初始化*/
create database If Not Exists salesmanagementsystem;

use salesmanagementsystem;
/*用户：经理和销售人员*/
create table If Not Exists users
(
	name varchar(10) primary key not null,
	password varchar(50) not null,
	isadmin boolean not null,/*是否是销售经理（管理员）*/
	projectsnum int/*完成的订单数*/
);
insert into users values("leon",MD5(111111),false,1);
insert into users values("admin",MD5("admin"),true,0);

/*客户*/
create table If Not Exists clients
(
	name varchar(10) primary key not null,
	phonenumber varchar(12),
	/*projectsnum int/*完成的订单数*/*/
);
insert into clients values("tom","13811110000");
insert into clients values("jerry","13900001111");

/*商品*/
create table If Not Exists goods
(
	name varchar(10) primary key not null,
	number int not null,
	unitprice float not null
);
insert into goods values("铅笔",10000,2.5);
insert into goods values("笔记本电脑",2000,20000);

/*项目*/
create table If Not Exists projects
(
	id int(10) primary key NOT NULL AUTO_INCREMENT,
	name varchar(10) not null,
	staffname varchar(10) NOT NULL,
	clientname varchar(10) not null,
	goodsname varchar(10) not null,
	goodsnumber int not null,
	state varchar(10) not null,
	startdate date not null,
	enddate date,
	plan varchar(10000),
	
	FOREIGN KEY(staffname) REFERENCES users(name),
	FOREIGN KEY(clientname) REFERENCES clients(name),
	FOREIGN KEY(goodsname) REFERENCES goods(name)
);
insert into projects values(null,"春节大酬宾","leon","tom","铅笔",2,"已下单","2018-01-02",default,"下一步计划是：让他付钱。");

/*指导意见*/
create table If Not Exists instructions
(
	id int(10) primary key NOT NULL AUTO_INCREMENT,
	staffname varchar(10) NOT NULL,
	managername varchar(10) NOT NULL,
	content varchar(1000) NOT NULL,
	
	FOREIGN KEY(staffname) REFERENCES users(name),
	FOREIGN KEY(managername) REFERENCES users(name)
);
insert into instructions values(null,"admin","leon","好好干活");

/*每日销售跟单次数*/
create table If Not Exists actionforday
(
	saledate date primary key NOT NULL,
	number int
);
insert into actionforday values("2018-01-02",2);