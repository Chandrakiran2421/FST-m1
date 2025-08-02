"Activity 1"
CREATE TABLE  salesman (salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int );

DESCRIBE salesman

"Activity 2"
INSERT ALL 
    INTO salesman VALUES (5001,'James Hoog','New York',15)
	INTO salesman VALUES (5002,'Nail Knite','Paris',13)
	INTO salesman VALUES (5005,'Pit Alex','London',11)
 	INTO salesman VALUES (5006,'McLyon','Paris',14)
	INTO salesman VALUES (5007,'Paul Adam','Rome',13)
	INTO salesman VALUES (5003,'Lauson Hen','San Jose',12)
Select 1 from DUAL;

Select * from salesman;

"Activity 3"
select salesman_id,salesman_city from salesman; 
select * from salesman where salesman_city='Paris';
select salesman_id,commission from salesman where salesman_name='Paul Adam';
    


"Activity 4"
ALTER TABLE salesman ADD (grade int);
UPDATE salesman SET grade=100;
select * from salesman;

"Activity 5"

Update salesman SET grade=200 where salesman_city='Rome';
Update salesman SET grade=300 where salesman_name='James Hoog';
Update salesman SET salesman_name='Pierre' where salesman_name='McLyon';

Select * from salesman; 