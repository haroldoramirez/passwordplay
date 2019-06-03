# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table categoria (
  id                            bigint auto_increment not null,
  nome                          varchar(100) not null,
  data_cadastro                 timestamp not null,
  data_alteracao                timestamp not null,
  constraint uq_categoria_nome unique (nome),
  constraint pk_categoria primary key (id)
);

create table grupo (
  id                            bigint auto_increment not null,
  nome                          varchar(100) not null,
  data_cadastro                 timestamp not null,
  data_alteracao                timestamp not null,
  constraint uq_grupo_nome unique (nome),
  constraint pk_grupo primary key (id)
);

create table pais (
  id                            bigint auto_increment not null,
  nome                          varchar(100) not null,
  data_cadastro                 timestamp not null,
  data_alteracao                timestamp not null,
  constraint uq_pais_nome unique (nome),
  constraint pk_pais primary key (id)
);

create table senha (
  id                            bigint auto_increment not null,
  titulo                        varchar(60) not null,
  usuario                       varchar(60) not null,
  senha                         varchar(400) not null,
  url                           varchar(500) not null,
  descricao                     varchar(500) not null,
  nome_icone                    varchar(300) not null,
  data_cadastro                 timestamp not null,
  data_alteracao                timestamp not null,
  data_expiracao                timestamp not null,
  constraint pk_senha primary key (id)
);

create table usuario (
  id                            bigint auto_increment not null,
  confirmacao_token             varchar(255),
  validado                      boolean default false not null,
  nome                          varchar(60) not null,
  email                         varchar(50) not null,
  senha                         varchar(255) not null,
  perfil                        varchar(13),
  status                        boolean not null,
  data_cadastro                 timestamp not null,
  data_alteracao                timestamp not null,
  ultimo_acesso                 timestamp not null,
  constraint ck_usuario_perfil check ( perfil in ('USUARIO','GERENTE','SUPERVISOR','ADMINISTRADOR')),
  constraint uq_usuario_email unique (email),
  constraint pk_usuario primary key (id)
);


# --- !Downs

drop table if exists categoria;

drop table if exists grupo;

drop table if exists pais;

drop table if exists senha;

drop table if exists usuario;

