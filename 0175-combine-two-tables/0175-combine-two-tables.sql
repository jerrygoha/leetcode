/* Write your T-SQL query statement below */
select a.firstName
      ,a.lastName
      ,b.city
      ,b.state
    from person as a
        left outer join address as b
            on a.personId = b.personId
        