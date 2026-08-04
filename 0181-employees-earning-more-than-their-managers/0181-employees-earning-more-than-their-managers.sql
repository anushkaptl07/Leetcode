# Write your MySQL query statement below
select s.name as Employee from Employee s
join Employee m on s.managerId = m.id
where s.salary>m.salary;