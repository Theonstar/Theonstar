-- select * from emp;

-- delete from 테이블명; <-- 전체행 삭제(where 필수!)

-- delete from emp where job = "salesman";

-- delete from emp;

-- truncate emp; << 전체행 삭제 절대적

-- update emp set job = "CLERK" where ename = "blake";

-- update emp set sal = sal + 500;

-- update emp set job = null where ename = "miller";

-- update emp set delete_yn = "y";

-- update emp set delete_yn = "n" where ename = "MILLER"

-- count 함수 : 입력값으로 칼럼명 또는  *

-- select count(*) from emp;


-- select count(*) as total, 
	-- count(ename) as ename, 
    -- count(comm) as comm, 
    -- count(mgr) as mgr 
-- from emp;

-- select distinct job as job_list from emp;

-- select count(distinct job) from emp;

-- select sum(sal) as total from emp;

-- select avg(sal) as avg_sum from emp;

-- select sum(sal) / count(sal) from emp;

-- select max(sal) from emp;

-- select min(sal) from emp;

-- select job, sum(sal)
-- from emp 
-- group by job;











