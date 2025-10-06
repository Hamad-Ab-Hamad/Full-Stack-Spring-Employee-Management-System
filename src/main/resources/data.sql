drop table if exists employee;
create table employee (
    employee_id int primary key auto_increment,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    email varchar(255) not null,
    salary int,
    department varchar(255),
    position varchar(255),
    office  varchar(255)
);


-- Starting test values with ids of 9999 to avoid test issues
insert into employee values (9999, 'Arthur', 'Morgan', 'AMorgan@hamad.com', 100, 'Mangement', 'Technichian', 'Chicago');
insert into employee values (9998, 'Dutch', 'Vanderlin', 'DVanderlin@hamad.com', 100,'Mangement', 'Researcher', 'Chicago');
insert into employee values (9997, 'John', 'Marston', 'JMarston@hamad.com', 100,'Mangement', 'Project Manager', 'Chicago');
insert into employee values (9996, 'John', 'Doe', 'JDoe@hamad.com',100,'QA', 'Tester', 'Chicago');