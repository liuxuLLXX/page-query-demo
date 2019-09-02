/*
 Navicat Premium Data Transfer

 Source Server         : 1ocal
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : graphql

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 25/07/2019 19:10:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for author
-- ----------------------------
DROP TABLE IF EXISTS `author`;
CREATE TABLE `author`  (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `last_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of author
-- ----------------------------
INSERT INTO `author` VALUES (1, 'Joanne', 'Rowling', '2019-05-22 17:03:59', '2019-07-25 17:52:52');
INSERT INTO `author` VALUES (2, 'Herman', 'Melville', '2019-05-22 17:03:59', '2019-07-25 17:52:54');
INSERT INTO `author` VALUES (3, 'Anne', 'Rice', '2019-05-22 17:03:59', '2019-07-25 17:52:55');
INSERT INTO `author` VALUES (5, '莫言', '黄花', '2019-05-22 17:03:59', '2019-07-25 17:52:56');

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `page_count` int(32) NOT NULL,
  `author_id` int(64) NOT NULL,
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'books' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, '哈利波特与死亡圣器', 101, 1, '2019-05-22 17:05:33', '2019-07-25 17:52:41');
INSERT INTO `book` VALUES (3, '人生', 500, 2, '2019-05-22 17:05:33', '2019-07-25 17:52:42');
INSERT INTO `book` VALUES (4, '平凡的世界', 1000, 3, '2019-05-22 17:05:33', '2019-07-25 17:52:43');
INSERT INTO `book` VALUES (5, '草原', 500, 5, '2019-05-22 17:05:33', '2019-07-25 17:52:44');
INSERT INTO `book` VALUES (6, '原野', 576, 1, '2019-05-22 17:05:33', '2019-07-25 17:52:45');
INSERT INTO `book` VALUES (7, '原来如初', 666, 2, '2019-05-22 17:05:33', '2019-07-25 17:52:46');
INSERT INTO `book` VALUES (8, '穆斯林的葬礼', 999, 3, '2019-05-22 17:05:33', '2019-07-25 17:52:47');
INSERT INTO `book` VALUES (9, '草根成长记（3）', 789, 5, '2019-05-22 17:09:17', '2019-07-25 17:52:48');

SET FOREIGN_KEY_CHECKS = 1;
