# 数据库初始化
# @author sunweipeng <https://github.com/ustc-panda?tab=repositories>
#  Created on 2024-03-11

-- 创建库
create database if not exists post_center;

-- 切换库
use post_center;

# 用户表
create table if not exists post
(
    id           bigint auto_increment comment 'id' primary key,
    title   varchar(256)                       null comment '标题',
    content    varchar(1024)                      null comment '内容',
    tags       varchar(256)                            null comment '标签列表 json',
    thumbNum   int                       not null comment '点赞数',
    collectNum        int                       null comment '收藏数',
    userId        varchar(512)                       null comment '创建用户 id',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isDelete     tinyint  default 0                 not null comment '是否删除'
)comment '帖子' collate = utf8mb4_unicode_ci;
