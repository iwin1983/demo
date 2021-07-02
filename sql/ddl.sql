CREATE TABLE stb_application (
    `id` bigint(11) NOT NULL AUTO_INCREMENT,
    `code` varchar(20) NOT NULL COMMENT '应用编码',
    `name` varchar(20) NOT NULL COMMENT '应用名称',
    `icon_url` varchar(100) DEFAULT NULL COMMENT '应用图标url',
    `state` varchar(10) DEFAULT '1' COMMENT '应用状态(1:启用,0:禁用)',
    `create_by` varchar(20) NOT NULL COMMENT '创建人',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_by` varchar(20) DEFAULT NULL COMMENT '修改人',
    `update_time` datetime DEFAULT NULL COMMENT '修改时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='应用管理表';