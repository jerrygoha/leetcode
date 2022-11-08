/* Write your PL/SQL query statement below */
select ct.name as Customers
    from customers ct
    left outer join orders od
        on ct.id = od.customerId
    where od.id is null;