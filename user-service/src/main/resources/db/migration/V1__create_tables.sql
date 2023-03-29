create table t_users (
         id int8 not null,
         active boolean not null,
         email varchar(255) not null ,
         phone_number varchar(10) not null,
         password varchar(255) not null,
         username varchar(255) not null,
         primary key (id)
);

create table t_user_role (
   user_id int8 not null,
   roles varchar(255)
);

alter table if exists t_user_role
    add constraint user_role_user_fk
        foreign key (user_id) references t_users;