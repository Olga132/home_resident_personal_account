insert into t_users (id, active, phone_number, email, username, password)
values (1, true, '9667774444', '123@gmail.com','admin', '123'),
       (2, true, '9667774445', '124@gmail.com','user', '123');

insert into t_user_role (user_id, roles)
values (1, 'USER'), (1, 'ADMIN');