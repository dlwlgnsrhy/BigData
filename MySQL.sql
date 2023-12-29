SELECT * FROM bigdata.student; 
-- CRUD 
-- 이름을 기준으로 오름차순 정렬(sort)하여 출력하세요.
select * from student order by name asc; -- 오름차순(기본값)
select * from student order by name desc; -- 내림

-- Q.나이가 30세 이상인 학생을 출력하세요.
select count(*)from student where age>=30; -- count(*):내장함수//1
