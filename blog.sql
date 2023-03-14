create table ms_admin
(
    id       bigint auto_increment
        primary key,
    username varchar(255) not null,
    password varchar(255) not null
)
    collate = utf8mb4_unicode_ci;

create table ms_admin_permission
(
    id            bigint auto_increment
        primary key,
    admin_id      bigint not null,
    permission_id bigint not null
)
    collate = utf8mb4_unicode_ci;

create table ms_article
(
    id             bigint auto_increment
        primary key,
    comment_counts int          null comment '评论数量',
    create_date    bigint       null comment '创建时间',
    summary        varchar(255) null comment '简介',
    title          varchar(64)  null comment '标题',
    view_counts    int          null comment '浏览数量',
    weight         int          not null comment '是否置顶',
    author_id      bigint       null comment '作者id',
    body_id        bigint       null comment '内容id',
    category_id    bigint       null comment '类别id'
);

create table ms_article_body
(
    id           bigint auto_increment
        primary key,
    content      longtext null,
    content_html longtext null,
    article_id   bigint   not null
);

create index article_id
    on ms_article_body (article_id);

create table ms_article_tag
(
    id         bigint auto_increment
        primary key,
    article_id bigint not null,
    tag_id     bigint not null
);

create index article_id
    on ms_article_tag (article_id);

create index tag_id
    on ms_article_tag (tag_id);

create table ms_category
(
    id            bigint auto_increment
        primary key,
    avatar        varchar(255) collate utf8mb4_unicode_ci null,
    category_name varchar(255) collate utf8mb4_unicode_ci null,
    description   varchar(255) collate utf8mb4_unicode_ci null
);

create table ms_comment
(
    id          bigint auto_increment
        primary key,
    content     varchar(255) collate utf8mb4_unicode_ci not null,
    create_date bigint                                  not null,
    article_id  bigint                                  not null,
    author_id   bigint                                  not null,
    parent_id   bigint                                  not null,
    to_uid      bigint                                  not null,
    level       varchar(1)                              not null
);

create index article_id
    on ms_comment (article_id);

create table ms_permission
(
    id          bigint auto_increment
        primary key,
    name        varchar(255) not null,
    path        varchar(255) not null,
    description varchar(255) not null
)
    collate = utf8mb4_unicode_ci;

create table ms_sys_log
(
    id          bigint auto_increment
        primary key,
    create_date bigint                                 null,
    ip          varchar(15) collate utf8mb3_bin        null,
    method      varchar(100) collate utf8mb3_bin       null,
    module      varchar(10) collate utf8mb3_bin        null,
    nickname    varchar(10) collate utf8mb4_unicode_ci null,
    operation   varchar(25) collate utf8mb3_bin        null,
    params      varchar(255) collate utf8mb3_bin       null,
    time        bigint                                 null,
    userid      bigint                                 null
)
    collate = utf8mb3_unicode_ci;

create table ms_sys_user
(
    id                  bigint auto_increment
        primary key,
    account             varchar(64)  null comment '账号',
    admin               bit          null comment '是否管理员',
    avatar              varchar(255) null comment '头像',
    create_date         bigint       null comment '注册时间',
    deleted             bit          null comment '是否删除',
    email               varchar(128) null comment '邮箱',
    last_login          bigint       null comment '最后登录时间',
    mobile_phone_number varchar(20)  null comment '手机号',
    nickname            varchar(255) null comment '昵称',
    password            varchar(64)  null comment '密码',
    salt                varchar(255) null comment '加密盐',
    status              varchar(255) null comment '状态'
);

create table ms_tag
(
    id       bigint auto_increment
        primary key,
    avatar   varchar(255) collate utf8mb4_unicode_ci null,
    tag_name varchar(255) collate utf8mb4_unicode_ci null
);

