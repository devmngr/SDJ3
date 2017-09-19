
create table bankaccount
(
  id number primary key,
  amount number
);


insert into bankaccount values (3,12);




create sequence sqAcount
  start with 1
  increment by 1
  noMaxValue;