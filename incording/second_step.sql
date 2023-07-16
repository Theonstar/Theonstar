-- select * from emp where sal >= 1000;
-- select * from emp;

-- select * from emp where comm is not null;

-- select * from emp where comm is not null and comm > 0;

-- select * from emp where sal >= 1000 and job = "SALESMAN"; 

-- select * from emp where job = "MANAGER" or ename = "CLERK";

-- select * from emp where not(job = "manager" or job = "clerk");

-- select * from emp where empno like "7";

-- select * from emp where ename like "S%";

-- select * from emp order by sal asc; -- asc == 작은것 == desc == 큰것 

-- select * from emp order by sal asc, ename desc;

-- select * from emp order by comm asc;

-- select * from emp limit 3 offset 0;

-- select *,  sal * 12 from emp order by sal;

select *, sal + comm as total from emp order by sal;
