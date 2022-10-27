create schema development;

create table if not exists user
(
    id int auto_increment
        primary key,
    name varchar(255) not null,
    status varchar(255) not null
)
    comment 'User Table';




