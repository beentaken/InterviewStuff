select COUNT(*) from events where type='buy' AND YEAR(dt) = 2022 AND MONTH(dt) = 5;


select first_name, last_name,email, SUM(amount) as total from profiles p inner join deals d on p.id = d.profile_id 
where YEAR(dt) = 2022 AND MONTH(dt) = 6
group by first_name, last_name,email
order by SUM(amount) desc LIMIT 3


