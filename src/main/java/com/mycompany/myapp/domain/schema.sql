
DROP TABLE IF EXISTS `easy_pay_user_message`;
CREATE TABLE `easy_pay_user_message`(
`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`real_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '真实姓名',
`id_number` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '身份证号',
`receive_bank_number` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '收款银行号码',
`receive_bank_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '收款银行名称',
`receive_bank_branch` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '收款银行支行名称',
`receive_bank_phone` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '收款银行预留手机号码',
`id_card_front_url` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '身份证正面url',
`id_card_back_url` VARCHAR(255) NOT NULL DEFAULT  '' COMMENT '身份证背面url',
`id_card_hand_url` TEXT COMMENT '手持身份证照片url',
`created_time` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`updated_at` DATETIME ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(id)
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '用户个人信息';


