# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table pais (
  id                            bigint auto_increment not null,
  nome                          varchar(100) not null,
  data_cadastro                 timestamp not null,
  data_alteracao                timestamp not null,
  constraint uq_pais_nome unique (nome),
  constraint pk_pais primary key (id)
);


# --- !Downs

drop table if exists pais;

