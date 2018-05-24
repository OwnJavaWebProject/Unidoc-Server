-- 创建数据库并设定编码集
CREATE SCHEMA `unidoc` DEFAULT CHARACTER SET utf8mb4 ;

-- 创建用户表
CREATE TABLE `unidoc`.`USER` (
  `Username` CHAR(16) NOT NULL,
  `Password` CHAR(16) NULL,
  PRIMARY KEY (`Username`))
COMMENT = '用户表';

-- 测试数据
INSERT INTO `unidoc`.`user` (`Username`, `passwords`) VALUES ('test', '123456');

