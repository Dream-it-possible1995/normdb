create table normdb
(
	id int auto_increment,
	normdb_id varchar(20) null,
	normdb_name varchar(255) null,
	constraint NormDB_pk
		primary key (id)
);
