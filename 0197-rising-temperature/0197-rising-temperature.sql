/* Write your T-SQL query statement below */

--날짜 관련 내장함수 사용

select b.id
    from weather as a
        inner join weather as b
            on b.recordDate = dateadd(DAY, 1, a.recordDate)
        where b.temperature > a.temperature
