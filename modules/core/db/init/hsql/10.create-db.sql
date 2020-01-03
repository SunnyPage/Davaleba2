-- begin DAVALEBA_MODEL
create table DAVALEBA_MODEL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    CAR_ID varchar(36),
    --
    primary key (ID)
)^
-- end DAVALEBA_MODEL
-- begin DAVALEBA_CAR_MANUFACTURING
create table DAVALEBA_CAR_MANUFACTURING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    MANUFACTURER_CODE varchar(255) not null,
    MODEL_ID varchar(36),
    CAR_ID varchar(36),
    --
    primary key (ID)
)^
-- end DAVALEBA_CAR_MANUFACTURING
-- begin DAVALEBA_COUNTERPARTY
create table DAVALEBA_COUNTERPARTY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    IDENTIFICATION_NUMBER_AND_ADDRESS longvarchar,
    NAME varchar(255),
    TELEPHONE varchar(255),
    FIRST_NAME_AND_LAST_NAME varchar(255),
    --
    primary key (ID)
)^
-- end DAVALEBA_COUNTERPARTY
-- begin DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR
create table DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CAR_ID varchar(36),
    CAR_PAID boolean,
    PRICE decimal(19, 2),
    MANAGER_ID varchar(36),
    COUNTERPARTY_ID varchar(36),
    --
    primary key (ID)
)^
-- end DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR
-- begin DAVALEBA_CAR
create table DAVALEBA_CAR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    YEAR_OF_ISSUE varchar(255),
    CAR_COST varchar(255),
    APPLICATION_FOR_THE_PURCHASE_OF_A_CAR_ID varchar(36),
    --
    primary key (ID)
)^
-- end DAVALEBA_CAR
-- begin DAVALEBA_COLOUR
create table DAVALEBA_COLOUR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(255),
    --
    primary key (ID)
)^
-- end DAVALEBA_COLOUR
-- begin DAVALEBA_NATURAL_PERSON
create table DAVALEBA_NATURAL_PERSON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME_AND_LAST_NAME varchar(255),
    APPLICATION_FOR_THE_PURCHASE_OF_A_CAR_ID varchar(36),
    TELEPHONE varchar(255),
    --
    primary key (ID)
)^
-- end DAVALEBA_NATURAL_PERSON
-- begin DAVALEBA_LEGAL_ENTITY
create table DAVALEBA_LEGAL_ENTITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    IDENTIFICATION_NUMBER_AND_ADDRESS longvarchar,
    TELEPHONE varchar(255),
    --
    primary key (ID)
)^
-- end DAVALEBA_LEGAL_ENTITY
-- begin DAVALEBA_COUNTRY
create table DAVALEBA_COUNTRY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    USER_ID varchar(36),
    CODE varchar(255),
    CAR_MANUFACTURERS_ID varchar(36),
    --
    primary key (ID)
)^
-- end DAVALEBA_COUNTRY
-- begin DAVALEBA_ASSEMBLY
create table DAVALEBA_ASSEMBLY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRICE decimal(19, 2),
    TYPE_OF_CAR varchar(50),
    NOTE varchar(255),
    CAR_ID varchar(36),
    --
    primary key (ID)
)^
-- end DAVALEBA_ASSEMBLY
-- begin SEC_USER
alter table SEC_USER add column COUNTRY_ID varchar(36) ^
alter table SEC_USER add column USER_ID varchar(36) ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'davaleba_ExtUser' where DTYPE is null ^
-- end SEC_USER
