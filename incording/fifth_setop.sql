-- select * from emp;

-- select job,count(job) from emp group by job;

-- select job, count(job) from emp group by job having count(job) > 1;

-- select * from emp order by sal asc limit 1;

-- select sal, min(ename) from emp group by sal having min(sal);

-- delete from emp where enmae = "SMITH";

-- delete from emp where sal = (select sal from emp);

-- select empno, ename, sal, (select min(sal) from emp) as min_sal from emp;

-- 인라인뷰 (inline view) : from 다음에 오는 서브쿼리
-- select * from (select empno, ename from emp) as exxx;

-- select * from (select empno, ename, sal from emp where sal > 2000) as exxx;

-- select ename, job, (select ename from emp as e1 where e1.empno = e2.mgr)= as mgr_name
-- from emp as e2;

-- select ename from emp where job = 'salesman' or job = 'clerk';

-- select * from emp where job in ('salesman', 'clerk');

-- select * from emp where comm = 300 or comm is null;

-- select * from emp;

