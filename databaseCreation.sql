CREATE SEQUENCE ac_seq
 start with 1
  increment by 1
  noMaxValue;
  
create table bankaccount
(
  id number default ac_seq.nextval,
  amount number
);

/*insert into bankaccount values (ac_seq.nextval,12);*/

select amount from bankaccount where id = 1;

 