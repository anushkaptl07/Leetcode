# Write your MySQL query statement below
select distinct p.email as Email from Person p
join Person p2 on p.email=p2.email
where p.id <>p2.id;