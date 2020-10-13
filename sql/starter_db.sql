
CREATE DATABASE IF NOT EXISTS starter_db DEFAULT CHARACTER SET = utf8mb4;

Use starter_db;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for events
-- ----------------------------
DROP TABLE IF EXISTS `events`;
CREATE TABLE `events`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `title` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `description` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `published_status` tinyint(0) NOT NULL,
  `version` bigint(0) UNSIGNED NOT NULL,
  `created_at` datetime(3) NOT NULL,
  `updated_at` datetime(3) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `created_at`(`created_at`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of events
-- ----------------------------
INSERT INTO `events` VALUES (1, 'Golang Taipei online', 'teach you how to Go', 1, 0, '2020-10-13 23:17:42.000', '2020-10-13 23:17:42.000');

SET FOREIGN_KEY_CHECKS = 1;
