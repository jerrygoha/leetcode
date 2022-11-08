select ct.name as Customers
    from customers as ct
    left outer join orders as od
        on ct.id = od.customerId
    where od.id is null