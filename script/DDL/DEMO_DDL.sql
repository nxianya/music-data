-- 示例表
CREATE TABLE IF NOT EXISTS t_demo_info (
  demo_id bigint(20) not null comment '主键',
  demo_name varchar(50) not null comment '名称',
  status varchar(2) default 1 not null comment '状态（1：有效，0：无效）',
  create_staff varchar(10) comment '创建人',
  create_time datetime default null comment '创建时间',
  primary key (demo_id)
) engine=innodb comment = '示例表';