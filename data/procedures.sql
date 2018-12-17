/* 
  	EDIT THIS FILE SO THAT IT CONTAINS PROCEDURES WHICH CAN BE IMPORTED INTO YOUR MYSQL SCHEMA
	You will need to have sufficent procedures to facilitate menu options 1 to 6
	Informaiton on the correct formation of procedures can be found here

	Note: do not use the key words "BEGIN" and "END" as they are not recognised when the .sql file is being imported. 

	Use the "DROP PROCEDURE" command to allow you to up date existing scripts with subsuequent imports. 
 	Take care if you rename procedures that you DROP the old procedures
*/

DROP PROCEDURE IF EXISTS getEmployeeCount;
DROP PROCEDURE IF EXISTS getEmployeeDetail;
DROP PROCEDURE IF EXISTS byLastName;
DROP PROCEDURE IF EXISTS addEmployee;
DROP PROCEDURE IF EXISTS listDepartments;
DROP PROCEDURE IF EXISTS getSalaries;
-- Option 0 - no procedure required

-- Option 1 
CREATE PROCEDURE getEmployeeCount()
SELECT COUNT(emp_no) AS num FROM oop_employees;

-- Option 2 
CREATE PROCEDURE getEmployeeDetail()
SELECT * FROM oop_employees;

-- Option 3
CREATE PROCEDURE byLastName(IN last_name varchar(14))
SELECT * FROM oop_employees WHERE last_name = last_name; 

-- Option 4 
CREATE PROCEDURE addEmployee(IN emp_no int(11), IN birth_date date, IN first_name varchar(14), IN last_name varchar(16), IN gender enum('M','F'), IN hire_date date)
INSERT INTO oop_employees (emp_no, birth_date, first_name, last_name, gender, hire_date) VALUES (emp_no, birth_date, first_name, last_name, gender, hire_date);

-- Option 5 - to be defined by student, should involved more than one table
CREATE PROCEDURE listDepartments()
SELECT dept_name, first_name AS 'Manager name', last_name AS 'Manager surname' FROM oop_departments d, oop_dept_manager dm, oop_employees e WHERE d.dept_no = dm.dept_no AND dm.emp_no = e.emp_no;


-- Option 6 - to be defined by student, should involved more than one table
CREATE PROCEDURE getSalaries()
SELECT last_name, first_name, dept_name, salary 
FROM oop_employees e, oop_departments d, oop_dept_emp de, oop_salaries sa 
WHERE e.emp_no = de.emp_no AND de.dept_no = d.dept_no AND e.emp_no = sa.emp_no 
ORDER BY last_name ASC;


