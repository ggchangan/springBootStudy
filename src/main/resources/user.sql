#创建数据库
#DROP DATABASE etl
CREATE DATABASE IF NOT EXISTS `etl`;
USE mgsearch;

#创建表 Sys_User
DROP TABLE IF EXISTS `Sys_User`;
CREATE TABLE `Sys_User` (
  `id` int(11) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#插入数据
insert into `Sys_User` (id,username, password) values (1,'admin', 'admin');
insert into `Sys_User` (id,username, password) values (2,'zhangren', 'zhangren');


#创建表
DROP TABLE IF EXISTS `Sys_Role`;
CREATE TABLE `Sys_Role` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#插入数据
insert into Sys_Role(id,name) values(1,'ROLE_ADMIN');
insert into Sys_Role(id,name) values(2,'ROLE_USER');

#创建表
DROP TABLE IF EXISTS `Sys_Role_User`;
CREATE TABLE `Sys_Role_User` (
  `id` int(11) DEFAULT NULL,
  `sys_user_id` int(11) DEFAULT NULL,
  `sys_role_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


#插入数据
insert into Sys_Role_User(sys_user_id, sys_role_id) values(1,1);
insert into Sys_Role_User(sys_user_id, sys_role_id) values(2,2);
