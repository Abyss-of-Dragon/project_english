SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for irregular verb 
-- ----------------------------
DROP TABLE IF EXISTS `IrregularVerb`;
CREATE TABLE `IrregularVerb`  (
  `No.` int NOT NULL,
  `Infinitive` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `PastTense` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `PastParticiple` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`No.`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of IrregularVerb 
-- ----------------------------
INSERT INTO `IrregularVerb` VALUES (0, 'arise', 'arose', 'arisen');
INSERT INTO `IrregularVerb` VALUES (1, 'awake', 'awoke,awaked', 'awoken,awoke,awaked');
INSERT INTO `IrregularVerb` VALUES (2, 'am', 'was', 'been' );
INSERT INTO `IrregularVerb` VALUES (3, 'is', 'was', 'been');

-- ---------------------------
-- Table structure for commits
-- ----------------------------
DROP TABLE IF EXISTS `commits`;
CREATE TABLE `commits`  (
  `No.` int NOT NULL,
  `user` int NULL DEFAULT NULL,
  `context` varchar(1023) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`No.`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of commits
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `No.` int NOT NULL,
  `type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `nickname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sign` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '/img/avatar/default.jpg',
  PRIMARY KEY (`No.`, `username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (0, 'Leader', 'user1', 'password', 'USERTEST', 'LTIyNDg1MjAzMA==', '/img/avatar/-794026537.jpg');
INSERT INTO `users` VALUES (1, 'User', 'userTest', 'hello', 'asdasdasdasd', '', '/img/avatar/default.jpg');
INSERT INTO `users` VALUES (2, 'User', 'user2', 'pass', 'whadadkwdwaawaws', 'LTE0NTQwODYzMjg=', '/img/avatar/default.jpg');
INSERT INTO `users` VALUES (3, 'User', 'yuanpi', 'yuanpinmsl', '原批', 'LTE0NDM4MTM2ODQ=', '/img/avatar/-789407881.jpg');
INSERT INTO `users` VALUES (4, 'User', '国服第一超级兵', '123456', '国服第一超级兵', 'MTM4MDA4MDI4Ng==', '/img/avatar/default.jpg');



--------------------------------------------------------------------

DROP TABLE IF EXISTS `numeral `;
CREATE TABLE `numeral `  (
  `No.` int NOT NULL,
  `cardinal numeral` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ordinal numeral1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ordinal numeral2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
 /* `Element` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Sex` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Nation` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `HP` int NULL DEFAULT NULL,
  `Damage` int NULL DEFAULT NULL,
  `Armor` int NULL DEFAULT NULL,
  `Growth` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Tags` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Commits` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '',
  `Tachie` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,*/
  PRIMARY KEY (`No.`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

INSERT INTO `numeral` VALUES (0,'one','1st','first');
INSERT INTO `numeral` VALUES (1,'two','2nd','second');
INSERT INTO `numeral` VALUES (2,'three','3rd','third');
INSERT INTO `numeral` VALUES (3,'four','4th','fourth');
INSERT INTO `numeral` VALUES (4,'five','5th','fifth');
INSERT INTO `numeral` VALUES (5,'six','6th','sixth');
INSERT INTO `numeral` VALUES (6,'seven','7th','seventh');
INSERT INTO `numeral` VALUES (7,'eight','8th','eighth');
INSERT INTO `numeral` VALUES (8,'nine','9th','ninth');
INSERT INTO `numeral` VALUES (9,'ten','10th','tenth');
INSERT INTO `numeral` VALUES (10,'eleven','11th','eleventh');
INSERT INTO `numeral` VALUES ( ,'','','');

--------------------------------------------------------------------
DROP TABLE IF EXISTS `country`;
CREATE TABLE `country`  (
  `No.` int NOT NULL,
  `country` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `language` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `citizen` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
 `nationality` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`No.`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

INSERT INTO `country` VALUES (0,'Africa','','African','');
INSERT INTO `country` VALUES (1,'America','','American','American');

--------------------------------------------------------------------
DROP TABLE IF EXISTS `month`;
CREATE TABLE `month `  (
  `No.` int NOT NULL,
  `month` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  
PRIMARY KEY (`No.`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

INSERT INTO `month ` VALUES (1,'January');


--------------------------------------------------------------------

DROP TABLE IF EXISTS `weekday`;
CREATE TABLE `weekday`  (
  `No.` int NOT NULL,
  `weekday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  
PRIMARY KEY (`No.`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

INSERT INTO `weekday` VALUES (0,'Sunday');

















SET FOREIGN_KEY_CHECKS = 1;
