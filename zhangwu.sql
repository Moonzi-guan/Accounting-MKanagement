/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : zhangwu

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-10-05 14:06:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for apporach
-- ----------------------------
DROP TABLE IF EXISTS `apporach`;
CREATE TABLE `apporach` (
  `aid` int(11) NOT NULL,
  `ano` varchar(32) DEFAULT NULL,
  `aname` varchar(20) DEFAULT NULL,
  `apicture` varchar(255) DEFAULT NULL,
  `aexpress` varchar(255) DEFAULT NULL,
  `ainformation` varchar(255) DEFAULT NULL,
  `anumber` int(11) DEFAULT NULL,
  `amoney` double DEFAULT NULL,
  `acategory` varchar(20) DEFAULT NULL,
  `awarehouse` varchar(20) DEFAULT NULL,
  `ino` int(11) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of apporach
-- ----------------------------
INSERT INTO `apporach` VALUES ('101', '123100', '三只松鼠', '9a80e2d06170b6bb01046233ede701b3.jpg', '是一种十分好吃的零食', '吃番薯', '121', '121', '电器类', '1号仓库', '10001');
INSERT INTO `apporach` VALUES ('102', '123102', '三星笔记本电脑', '1946ceef1ea90c932e1f7c8bb631a3fa.jpg', '121212', '121212', '100', '12222', '电器类', '2号仓库', '10001');
INSERT INTO `apporach` VALUES ('103', '123103', 'INF衬衫', 'b463a2b010033397a2dcd09aa6f57d0c.jpg', '吃番薯', '吃番薯', '121', '121', '电器类', '1号仓库', '10001');
INSERT INTO `apporach` VALUES ('104', '123103', '排插', '53e9968908af7b4478fbccdd77d46675.jpg', '121212', '121212', '100', '12222', '电器类', '2号仓库', '10001');
INSERT INTO `apporach` VALUES ('105', '123104', '虾肉', '虾.jpg', '鲜美的虾肉！！', '保质期18个月！！', '1000', '5', '食品类', '1号仓库', '10008');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `cid` int(11) NOT NULL,
  `cpicture` varchar(20) DEFAULT NULL,
  `cname` varchar(20) DEFAULT NULL,
  `csex` int(11) DEFAULT NULL,
  `ccompony` varchar(20) DEFAULT NULL,
  `capplicant` varchar(20) DEFAULT NULL,
  `ccontact` varchar(11) DEFAULT NULL,
  `caddr` varchar(50) DEFAULT NULL,
  `cstatic` int(11) DEFAULT NULL,
  `ino` int(11) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('123', '', '123', '0', '123', '123', '123', '123', null, null);
INSERT INTO `customer` VALUES ('1212', '', '121', '0', '1212', '1212', '12121', '1212', '0', '10003');
INSERT INTO `customer` VALUES ('1231', '', '1231', '0', '123', '123', '123', '123', '0', '10001');
INSERT INTO `customer` VALUES ('10001', 'IMG_8589.JPG', '张三年', '1', '雅虎', '经理', '1353588878', '广东省茂名市', '1', '10011');
INSERT INTO `customer` VALUES ('10002', 'IMG_8589.JPG', '里斯', '0', '腾讯', '经理', '1353588878', '广东省茂名市', '0', '10003');

-- ----------------------------
-- Table structure for interview
-- ----------------------------
DROP TABLE IF EXISTS `interview`;
CREATE TABLE `interview` (
  `iid` int(11) NOT NULL,
  `iusername` varchar(25) DEFAULT NULL,
  `isex` int(1) DEFAULT NULL,
  `iapplicant` varchar(25) DEFAULT NULL,
  `icontact` varchar(11) DEFAULT NULL,
  `iedu` varchar(25) DEFAULT NULL,
  `ischool` varchar(25) DEFAULT NULL,
  `iprofession` varchar(25) DEFAULT NULL,
  `imanning` varchar(20) DEFAULT NULL,
  `iresume` varchar(255) DEFAULT NULL,
  `idetail` varchar(255) DEFAULT NULL,
  `ipicture` varchar(255) DEFAULT NULL,
  `ievaluate` varchar(255) DEFAULT NULL,
  `istatus` int(11) DEFAULT NULL,
  `iexperience` varchar(255) DEFAULT NULL,
  `igrade` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`iid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of interview
-- ----------------------------
INSERT INTO `interview` VALUES ('123', '123', '0', '程序员', '123', '高中', '123', '123', '编程人员', '123', '', '', '123', '1', null, '123');
INSERT INTO `interview` VALUES ('10001', '张三年', '1', '经理', '1353588878', '本科', '石油学院', '计算机', '程序员', '是一个好人', '是一个好人', null, '是一个好人', '1', '是一个好人', '100');
INSERT INTO `interview` VALUES ('10002', '里斯', '1', '经理', '1353588878', '大专', '石油学院', '计算机', '程序员', '是一个好人', '是一个好人', null, '是一个好人', '0', '是一个好人', '100');
INSERT INTO `interview` VALUES ('10003', '雅虎', '1', '经理', '1353588878', '本科', '石油学院', '计算机', '程序员', '是一个好人', '是一个好人', null, '是一个好人', '1', '是一个好人', '23');
INSERT INTO `interview` VALUES ('10004', '鄂西', '1', '经理', '1353588878', '大专', '石油学院', '计算机', '程序员', '是一个好人', '是一个好人', null, '是一个好人', '0', '是一个好人', '23');
INSERT INTO `interview` VALUES ('10005', '发发', '0', '经理', '1353588878', '本科', '石油学院', '计算机', '程序员', '是一个好人', '是一个好人', null, '是一个好人', '0', '是一个好人', '23');
INSERT INTO `interview` VALUES ('10006', '东方', '0', '经理', '1353588878', '大专', '石油学院', '计算机', '程序员', '是一个好人', '是一个好人', null, '是一个好人', '0', '是一个好人', '12');

-- ----------------------------
-- Table structure for newin
-- ----------------------------
DROP TABLE IF EXISTS `newin`;
CREATE TABLE `newin` (
  `nid` int(11) NOT NULL,
  `nusername` varchar(20) DEFAULT NULL,
  `nsex` int(11) DEFAULT NULL,
  `napplicant` varchar(20) DEFAULT NULL,
  `ncontact` varchar(11) DEFAULT NULL,
  `nedu` varchar(10) DEFAULT NULL,
  `nprofession` varchar(20) DEFAULT NULL,
  `nschool` varchar(20) DEFAULT NULL,
  `nmanning` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of newin
-- ----------------------------
INSERT INTO `newin` VALUES ('1001', '张三年', '1', '经理', '1353588878', '本科', '计算机', '石油学院', '程序员');
INSERT INTO `newin` VALUES ('1002', '里斯', '2', '经理', '1353588878', '大专', '计算机', '石油学院', '程序员');
INSERT INTO `newin` VALUES ('1003', '雅虎', '1', '经理', '1353588878', '本科', '计算机', '石油学院', '程序员');
INSERT INTO `newin` VALUES ('1004', '鄂西', '2', '经理', '1353588878', '大专', '计算机', '石油学院', '程序员');
INSERT INTO `newin` VALUES ('1005', '林立', '1', '经理', '1353588878', '本科', '计算机', '石油学院', '程序员');
INSERT INTO `newin` VALUES ('1006', '东方', '2', '经理', '1353588878', '大专', '计算机', '石油学院', '程序员');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `oid` int(11) NOT NULL,
  `ono` varchar(20) DEFAULT NULL,
  `cname` varchar(20) DEFAULT NULL,
  `iname` varchar(20) DEFAULT NULL,
  `oname` varchar(20) DEFAULT NULL,
  `oaid` int(11) DEFAULT NULL,
  `opicture` varchar(255) DEFAULT NULL,
  `onumber` bigint(11) DEFAULT NULL,
  `omoney` double DEFAULT NULL,
  `ocategory` varchar(20) DEFAULT NULL,
  `osum` double DEFAULT NULL,
  `onewdate` varchar(32) DEFAULT NULL,
  `ofinishdate` varchar(32) DEFAULT NULL,
  `oaddr` varchar(20) DEFAULT NULL,
  `ocontact` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('101', 'sd1001', '张三年', '张三年', '小鱼项目', '20001', null, '100', '10', 'a101', '1000', '2019-04-10', '2019-04-19', '广东省茂名市', '13535956528');
INSERT INTO `orders` VALUES ('102', 'sd1002', '里斯', '里斯', '小猫项目', '20002', null, '100', '10', 'a102', '1000', '2019-04-10', '2019-04-19', '广东省茂名市', '13535956528');
INSERT INTO `orders` VALUES ('103', 'sd1003', '雅虎', '雅虎', '小狗项目', '20003', null, '100', '10', 'a103', '1000', '2019-04-10', '2019-04-19', '广东省茂名市', '13535956528');
INSERT INTO `orders` VALUES ('104', 'sd1004', '鄂西', '鄂西', '小鱼项目', '20004', null, '100', '10', 'a101', '1000', '2019-04-10', '2019-04-19', '广东省茂名市', '13535956528');
INSERT INTO `orders` VALUES ('105', 'sd1005', '发发', '发发', '小猫项目', '20005', null, '100', '10', 'a102', '1000', '2019-04-10', '2019-04-19', '广东省茂名市', '13535956528');
INSERT INTO `orders` VALUES ('106', 'sd1006', '东方', '东方', '小狗项目', '20006', null, '100', '10', 'a103', '1000', '2019-04-10', '2019-04-19', '广东省茂名市', '13535956528');

-- ----------------------------
-- Table structure for userlogin
-- ----------------------------
DROP TABLE IF EXISTS `userlogin`;
CREATE TABLE `userlogin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of userlogin
-- ----------------------------
INSERT INTO `userlogin` VALUES ('1', '213123', '123456');
INSERT INTO `userlogin` VALUES ('2', '123123', '123456');
INSERT INTO `userlogin` VALUES ('3', '123', '123');
