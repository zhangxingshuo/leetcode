SELECT Email
FROM PERSON
GROUP BY Email
HAVING (COUNT(Email) > 1)