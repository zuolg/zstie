/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : jpress

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-11-22 15:43:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for z_attachment
-- ----------------------------
DROP TABLE IF EXISTS `z_attachment`;
CREATE TABLE `z_attachment` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID主键',
  `title` text COMMENT '标题',
  `user_id` int(20) unsigned DEFAULT NULL COMMENT '上传附件的用户ID',
  `content_id` int(20) unsigned DEFAULT NULL COMMENT '附件所属的内容ID',
  `path` varchar(512) DEFAULT NULL COMMENT '路径',
  `mime_type` varchar(128) DEFAULT NULL COMMENT 'mime',
  `suffix` varchar(32) DEFAULT NULL COMMENT '附件的后缀',
  `type` varchar(32) DEFAULT NULL COMMENT '类型',
  `flag` varchar(256) DEFAULT NULL COMMENT '标示',
  `lat` double(20,16) DEFAULT NULL COMMENT '经度',
  `lng` double(20,16) DEFAULT NULL COMMENT '纬度',
  `order_number` int(11) DEFAULT NULL COMMENT '排序字段',
  `created` datetime DEFAULT NULL COMMENT '上传时间',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `created` (`created`),
  KEY `suffix` (`suffix`),
  KEY `mime_type` (`mime_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='附件表，用于保存用户上传的附件内容。';

-- ----------------------------
-- Records of z_attachment
-- ----------------------------

-- ----------------------------
-- Table structure for z_comment
-- ----------------------------
DROP TABLE IF EXISTS `z_comment`;
CREATE TABLE `z_comment` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `parent_id` int(20) unsigned DEFAULT NULL COMMENT '回复的评论ID',
  `content_id` int(20) unsigned DEFAULT NULL COMMENT '评论的内容ID',
  `content_module` varchar(32) DEFAULT NULL COMMENT '评论的内容模型',
  `comment_count` int(11) unsigned DEFAULT '0' COMMENT '评论的回复数量',
  `order_number` int(11) unsigned DEFAULT '0' COMMENT '排序编号，常用语置顶等',
  `user_id` int(20) unsigned DEFAULT NULL COMMENT '评论的用户ID',
  `ip` varchar(64) DEFAULT NULL COMMENT '评论的IP地址',
  `author` varchar(128) DEFAULT NULL COMMENT '评论的作者',
  `type` varchar(32) DEFAULT 'comment' COMMENT '评论的类型，默认是comment',
  `text` text COMMENT '评论的内容',
  `agent` text COMMENT '提交评论的浏览器信息',
  `created` datetime DEFAULT NULL COMMENT '评论的时间',
  `slug` varchar(128) DEFAULT NULL COMMENT '评论的slug',
  `email` varchar(64) DEFAULT NULL COMMENT '评论用户的email',
  `status` varchar(32) DEFAULT NULL COMMENT '评论的状态',
  `vote_up` int(11) unsigned DEFAULT '0' COMMENT '“顶”的数量',
  `vote_down` int(11) unsigned DEFAULT '0' COMMENT '“踩”的数量',
  `flag` varchar(256) DEFAULT NULL COMMENT '标识',
  `lat` double(20,16) DEFAULT NULL COMMENT '纬度',
  `lng` double(20,16) DEFAULT NULL COMMENT '经度',
  PRIMARY KEY (`id`),
  UNIQUE KEY `slug` (`slug`),
  KEY `content_id` (`content_id`),
  KEY `user_id` (`user_id`),
  KEY `email` (`email`),
  KEY `created` (`created`),
  KEY `parent_id` (`parent_id`),
  KEY `content_module` (`content_module`),
  KEY `comment_count` (`comment_count`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='评论表，用于保存content内容的回复、分享、推荐等信息。';

-- ----------------------------
-- Records of z_comment
-- ----------------------------

-- ----------------------------
-- Table structure for z_content
-- ----------------------------
DROP TABLE IF EXISTS `z_content`;
CREATE TABLE `z_content` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `title` text COMMENT '标题',
  `text` text COMMENT '内容',
  `summary` text COMMENT '摘要',
  `link_to` varchar(256) DEFAULT NULL COMMENT '连接到(常用于谋文章只是一个连接)',
  `markdown_enable` int(1) DEFAULT '0' COMMENT '是否启用markdown',
  `thumbnail` varchar(128) DEFAULT NULL COMMENT '缩略图',
  `module` varchar(32) DEFAULT NULL COMMENT '模型',
  `style` varchar(32) DEFAULT NULL COMMENT '样式',
  `user_id` int(20) unsigned DEFAULT NULL COMMENT '用户ID',
  `author` varchar(128) DEFAULT NULL COMMENT '匿名稿的用户',
  `user_email` varchar(128) DEFAULT NULL COMMENT '匿名稿的邮箱',
  `user_ip` varchar(128) DEFAULT NULL COMMENT 'IP地址',
  `user_agent` text COMMENT '发布浏览agent',
  `parent_id` int(20) unsigned DEFAULT NULL COMMENT '父级内容ID',
  `object_id` int(20) unsigned DEFAULT NULL COMMENT '关联的对象ID',
  `order_number` int(11) unsigned DEFAULT '0' COMMENT '排序编号',
  `status` varchar(32) DEFAULT NULL COMMENT '状态',
  `vote_up` int(11) unsigned DEFAULT '0' COMMENT '支持人数',
  `vote_down` int(11) unsigned DEFAULT '0' COMMENT '反对人数',
  `rate` int(11) DEFAULT NULL COMMENT '评分分数',
  `rate_count` int(10) unsigned DEFAULT '0' COMMENT '评分次数',
  `price` double(10,2) DEFAULT '0.00' COMMENT '价格',
  `comment_status` varchar(32) DEFAULT NULL COMMENT '评论状态',
  `comment_count` int(11) unsigned DEFAULT '0' COMMENT '评论总数',
  `comment_time` datetime DEFAULT NULL COMMENT '最后评论时间',
  `view_count` int(11) unsigned DEFAULT '0' COMMENT '访问量',
  `created` datetime DEFAULT NULL COMMENT '创建日期',
  `modified` datetime DEFAULT NULL COMMENT '最后更新日期',
  `slug` varchar(128) DEFAULT NULL COMMENT 'slug',
  `flag` varchar(256) DEFAULT NULL COMMENT '标识',
  `lng` double(20,16) DEFAULT NULL COMMENT '经度',
  `lat` double(20,16) DEFAULT NULL COMMENT '纬度',
  `meta_keywords` varchar(256) DEFAULT NULL COMMENT 'SEO关键字',
  `meta_description` varchar(256) DEFAULT NULL COMMENT 'SEO描述信息',
  `remarks` text COMMENT '备注信息',
  PRIMARY KEY (`id`),
  UNIQUE KEY `slug` (`slug`),
  KEY `user_id` (`user_id`),
  KEY `parent_id` (`parent_id`),
  KEY `content_module` (`module`),
  KEY `created` (`created`),
  KEY `vote_down` (`vote_down`),
  KEY `vote_up` (`vote_up`),
  KEY `view_count` (`view_count`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='内容表，用于存放比如文章、帖子、商品、问答等用户自定义模型内容。也用来存放比如菜单、购物车、消费记录等系统模型。';

-- ----------------------------
-- Records of z_content
-- ----------------------------
INSERT INTO `z_content` VALUES ('1', '测试文章', '<p>测试文章</p>', null, null, '0', null, 'article', null, '1', null, null, null, null, null, null, '0', 'normal', '0', '0', null, '0', '0.00', null, '0', null, '0', '2016-11-22 15:35:48', '2016-11-22 15:35:48', '测试文章', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for z_mapping
-- ----------------------------
DROP TABLE IF EXISTS `z_mapping`;
CREATE TABLE `z_mapping` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `content_id` int(20) unsigned NOT NULL COMMENT '内容ID',
  `taxonomy_id` int(20) unsigned NOT NULL COMMENT '分类ID',
  PRIMARY KEY (`id`),
  KEY `taxonomy_id` (`taxonomy_id`),
  KEY `content_id` (`content_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='内容和分类的多对多映射关系。';

-- ----------------------------
-- Records of z_mapping
-- ----------------------------

-- ----------------------------
-- Table structure for z_metadata
-- ----------------------------
DROP TABLE IF EXISTS `z_metadata`;
CREATE TABLE `z_metadata` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `meta_key` varchar(255) DEFAULT NULL COMMENT '元数据key',
  `meta_value` text COMMENT '元数据value',
  `object_type` varchar(32) DEFAULT NULL COMMENT '元数据的对象类型',
  `object_id` int(20) unsigned DEFAULT NULL COMMENT '元数据的对象ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='元数据表，用来对其他表的字段扩充。';

-- ----------------------------
-- Records of z_metadata
-- ----------------------------
INSERT INTO `z_metadata` VALUES ('1', '_meta1', null, 'content', '1');
INSERT INTO `z_metadata` VALUES ('2', '_meta2', null, 'content', '1');

-- ----------------------------
-- Table structure for z_option
-- ----------------------------
DROP TABLE IF EXISTS `z_option`;
CREATE TABLE `z_option` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `option_key` varchar(128) DEFAULT NULL COMMENT '配置KEY',
  `option_value` text COMMENT '配置内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='配置信息表，用来保存网站的所有配置信息。';

-- ----------------------------
-- Records of z_option
-- ----------------------------
INSERT INTO `z_option` VALUES ('1', 'web_name', '随便起个名字');

-- ----------------------------
-- Table structure for z_taxonomy
-- ----------------------------
DROP TABLE IF EXISTS `z_taxonomy`;
CREATE TABLE `z_taxonomy` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `title` varchar(512) DEFAULT NULL COMMENT '标题',
  `text` text COMMENT '内容描述',
  `slug` varchar(128) DEFAULT NULL COMMENT 'slug',
  `type` varchar(32) DEFAULT NULL COMMENT '类型',
  `icon` varchar(128) DEFAULT NULL COMMENT '图标',
  `content_module` varchar(32) DEFAULT NULL COMMENT '对于的内容模型',
  `content_count` int(11) unsigned DEFAULT '0' COMMENT '该分类的内容数量',
  `order_number` int(11) DEFAULT NULL COMMENT '排序编码',
  `parent_id` int(20) unsigned DEFAULT NULL COMMENT '父级分类的ID',
  `object_id` int(20) unsigned DEFAULT NULL COMMENT '关联的对象ID',
  `flag` varchar(256) DEFAULT NULL COMMENT '标识',
  `lat` double(20,16) DEFAULT NULL COMMENT '经度',
  `lng` double(20,16) DEFAULT NULL COMMENT '纬度',
  `meta_keywords` varchar(256) DEFAULT NULL COMMENT 'SEO关键字',
  `meta_description` varchar(256) DEFAULT NULL COMMENT 'SEO描述内容',
  `created` datetime DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`),
  KEY `parent_id` (`parent_id`),
  KEY `object_id` (`object_id`),
  KEY `content_module` (`content_module`),
  KEY `created` (`created`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='分类表。标签、专题、类别等都属于taxonomy。';

-- ----------------------------
-- Records of z_taxonomy
-- ----------------------------

-- ----------------------------
-- Table structure for z_user
-- ----------------------------
DROP TABLE IF EXISTS `z_user`;
CREATE TABLE `z_user` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `username` varchar(128) DEFAULT NULL COMMENT '登陆名',
  `nickname` varchar(128) DEFAULT NULL COMMENT '昵称',
  `realname` varchar(128) DEFAULT NULL COMMENT '实名',
  `password` varchar(128) DEFAULT NULL COMMENT '密码',
  `salt` varchar(32) DEFAULT NULL COMMENT '盐',
  `email` varchar(64) DEFAULT NULL COMMENT '邮件',
  `email_status` varchar(32) DEFAULT NULL COMMENT '邮箱状态（是否认证等）',
  `mobile` varchar(32) DEFAULT NULL COMMENT '手机电话',
  `mobile_status` varchar(32) DEFAULT NULL COMMENT '手机状态（是否认证等）',
  `telephone` varchar(32) DEFAULT NULL COMMENT '固定电话',
  `amount` decimal(10,2) unsigned DEFAULT '0.00' COMMENT '金额（余额）',
  `gender` varchar(16) DEFAULT NULL COMMENT '性别',
  `role` varchar(32) DEFAULT 'visitor' COMMENT '权限',
  `signature` varchar(2048) DEFAULT NULL COMMENT '签名',
  `content_count` int(11) unsigned DEFAULT '0' COMMENT '内容数量',
  `comment_count` int(11) unsigned DEFAULT '0' COMMENT '评论数量',
  `qq` varchar(16) DEFAULT NULL COMMENT 'QQ号码',
  `wechat` varchar(32) DEFAULT NULL COMMENT '微信号',
  `weibo` varchar(256) DEFAULT NULL COMMENT '微博',
  `facebook` varchar(256) DEFAULT NULL,
  `linkedin` varchar(256) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `company` varchar(256) DEFAULT NULL COMMENT '公司',
  `occupation` varchar(256) DEFAULT NULL COMMENT '职位、职业',
  `address` varchar(256) DEFAULT NULL COMMENT '地址',
  `zipcode` varchar(128) DEFAULT NULL COMMENT '邮政编码',
  `site` varchar(256) DEFAULT NULL COMMENT '个人网址',
  `graduateschool` varchar(256) DEFAULT NULL COMMENT '毕业学校',
  `education` varchar(256) DEFAULT NULL COMMENT '学历',
  `avatar` varchar(256) DEFAULT NULL COMMENT '头像',
  `idcardtype` varchar(128) DEFAULT NULL COMMENT '证件类型：身份证 护照 军官证等',
  `idcard` varchar(128) DEFAULT NULL COMMENT '证件号码',
  `status` varchar(32) DEFAULT 'normal' COMMENT '状态',
  `created` datetime DEFAULT NULL COMMENT '创建日期',
  `create_source` varchar(128) DEFAULT NULL COMMENT '用户来源（可能来之oauth第三方）',
  `logged` datetime DEFAULT NULL COMMENT '最后的登陆时间',
  `activated` datetime DEFAULT NULL COMMENT '激活时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `mobile` (`mobile`),
  KEY `status` (`status`),
  KEY `created` (`created`),
  KEY `content_count` (`content_count`),
  KEY `comment_count` (`comment_count`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='用户信息表，保存用户信息。';

-- ----------------------------
-- Records of z_user
-- ----------------------------
INSERT INTO `z_user` VALUES ('1', 'admin', null, null, '356d5a3695415e4ac56c0bf509d0f9d688b9b00adfbd231338be9b3448028a1d', '2e972323445a2', null, null, null, null, null, '0.00', null, 'administrator', null, '1', '0', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'activited', '2016-11-22 15:33:48', null, '2016-11-22 15:34:36', null);