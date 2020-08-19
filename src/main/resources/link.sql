/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : java_spring

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2020-08-19 11:41:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for link
-- ----------------------------
DROP TABLE IF EXISTS `link`;
CREATE TABLE `link` (
  `link_id` int(16) NOT NULL AUTO_INCREMENT,
  `long_url` varchar(1000) NOT NULL COMMENT '原始长连接',
  `short_url` varchar(255) NOT NULL COMMENT '原始短连接',
  PRIMARY KEY (`link_id`),
  KEY `long_url` (`long_url`(255),`short_url`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
