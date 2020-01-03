create table DAVALEBA_CHARACTERISTICS (
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
    PRICE varchar(255),
    TYPE_OF_CAR varchar(50),
    NOTE varchar(255),
    CAR_MODEL_ID varchar(36),
    CAR_ID varchar(36),
    --
    primary key (ID)
);