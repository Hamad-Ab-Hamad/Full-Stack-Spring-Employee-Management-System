drop table if exists employee;
create table employee (
    employeeId int primary key auto_increment,
    firstName varchar(255) not null,
    lastName varchar(255) not null,
    email varchar(255) not null
);


-- Starting test values with ids of 9999 to avoid test issues
insert into employee values (9999, 'Arthur', 'Morgan', 'AMorgan@hamad.com');
insert into employee values (9998, 'Dutch', 'Vanderlin', 'DVanderlin@hamad.com');
insert into employee values (9997, 'John', 'Marston', 'JMarston@hamad.com');
insert into employee values (9996, 'John', 'Doe', 'JDoe@hamad.com');