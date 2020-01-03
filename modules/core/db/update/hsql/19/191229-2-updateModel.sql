alter table DAVALEBA_MODEL alter column CAR_ID rename to CAR_ID__U28118 ^
alter table DAVALEBA_MODEL drop constraint FK_DAVALEBA_MODEL_ON_CAR ;
drop index IDX_DAVALEBA_MODEL_ON_CAR ;
