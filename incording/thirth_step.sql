-- select * from emp;

-- select sal * 12 as year_money
-- from emp 
-- where sal * 12 > 30000;

-- select sal * 12 as year_money
-- from emp
-- vwhere sal * 12 > 30000
-- order by year_money desc;

-- select concat(sal, ' 원') as sal from emp;

-- select substring(sal, 1, 3) as sal from emp;


-- select job, substring(job, 6, 3) as result from emp where job = "salesman";

-- select current_date - interval 1 month;

-- select datediff('2023-01-14', '2023-01-12');

-- select * from emp;

-- select *,
-- case
-- when sal >= 3000 then '고소득자'
-- when sal >= 1000 and sal < 3000 then '중간소득자'
-- when sal < 1000 then '저소득자'
--	end
-- as '소득등급'
-- from emp;

-- select ename, sal, coalesce(comm, 0) as comm,
-- sal + coalesce(comm, 0) as year_money
-- from emp; 

-- insert into tset01 values(1, 2, 3);

-- select * from test01;
