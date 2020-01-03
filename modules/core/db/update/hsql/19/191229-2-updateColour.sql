-- update DAVALEBA_COLOUR set CODE = <default_value> where CODE is null ;
alter table DAVALEBA_COLOUR alter column CODE set not null ;
