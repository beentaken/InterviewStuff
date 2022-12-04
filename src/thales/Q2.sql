create table  Branch (branch_nbr smallint,
branch_name nvarchar(255),
region_nbr smallint,
employee_count smallint);

insert into Branch value (108,"New York",100,10);
insert into Branch value (110,"Noston",100,6);
insert into Branch value (212,"Chicago",200,5);
insert into Branch value (404,"San Diego",400,6);
insert into Branch value (415,"San Jose",400,3);

select region_nbr , sum(employee_count) from 
Branch group by region_nbr having sum(employee_count) > 8