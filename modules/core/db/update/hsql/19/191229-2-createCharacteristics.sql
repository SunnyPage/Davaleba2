alter table DAVALEBA_CHARACTERISTICS add constraint FK_DAVALEBA_CHARACTERISTICS_ON_CAR_MODEL foreign key (CAR_MODEL_ID) references DAVALEBA_MODEL(ID);
alter table DAVALEBA_CHARACTERISTICS add constraint FK_DAVALEBA_CHARACTERISTICS_ON_CAR foreign key (CAR_ID) references DAVALEBA_CAR(ID);
create index IDX_DAVALEBA_CHARACTERISTICS_ON_CAR_MODEL on DAVALEBA_CHARACTERISTICS (CAR_MODEL_ID);
create index IDX_DAVALEBA_CHARACTERISTICS_ON_CAR on DAVALEBA_CHARACTERISTICS (CAR_ID);