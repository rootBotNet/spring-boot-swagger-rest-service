--User Management Table
create table User_Details
(
	id integer not null auto_increment,
	name varchar(255),
	phone varchar(255),
	password varchar(255),
	primary key (id)
);