/*
Navicat MySQL Data Transfer

Source Server         : zou
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2018-07-14 11:23:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `newstudentinfo`
-- ----------------------------
DROP TABLE IF EXISTS `newstudentinfo`;
CREATE TABLE `newstudentinfo` (
  `id` int(11) NOT NULL auto_increment COMMENT '学号',
  `name` varchar(20) default NULL COMMENT '姓名',
  `score` decimal(4,2) default NULL COMMENT '分数',
  `subject` int(11) default NULL COMMENT '科目编号',
  `teacherid` int(11) default NULL COMMENT '任课教师编号',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of newstudentinfo
-- ----------------------------
INSERT INTO `newstudentinfo` VALUES ('1', '柒晓白', '80.00', '1', '1');
INSERT INTO `newstudentinfo` VALUES ('2', '邹涛', '20.00', '1', '3');
INSERT INTO `newstudentinfo` VALUES ('3', '王二', '85.00', '2', '4');
INSERT INTO `newstudentinfo` VALUES ('4', 'Test', '45.00', '3', '5');
