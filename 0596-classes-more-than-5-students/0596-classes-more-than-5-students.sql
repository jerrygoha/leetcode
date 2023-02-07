# Write your MySQL query statement below

select z.class
    from (select class, count(*) as studentcnt
            from courses
            group by class) as z
    where z.studentcnt >= 5
    ;
