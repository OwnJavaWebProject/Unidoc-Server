-- 创建数据库并设定编码集
CREATE SCHEMA `unidoc` DEFAULT CHARACTER SET utf8mb4 ;

-- 创建用户表
CREATE TABLE `user` (
  `username` char(16) NOT NULL,
  `password` char(16) NOT NULL,
  `email` char(32) DEFAULT NULL,
  `phone` char(16) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- 测试数据
INSERT INTO `unidoc`.`user` (`Username`, `passwords`) VALUES ('test', '123456');

