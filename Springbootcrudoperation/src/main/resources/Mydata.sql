-- https://stackoverflow.com/questions/650098/how-to-execute-an-sql-script-file-using-c-sharp

-- https://social.msdn.microsoft.com/Forums/en-US/43e8bc3a-1132-453b-b950-09427e970f31/run-a-sql-script-file-in-c?forum=adodotnetdataproviders

-- https://www.c-sharpcorner.com/forums/executing-sql-script-file-from-c-sharp-asp-net

CREATE DATABASE paramount;

USE paramount;

CREATE TABLE employee(
	id INT(10) NOT NULL AUTO_INCREMENT,
	name VARCHAR(150) NOT NULL,
	department VARCHAR(150) NOT NULL,
	salary DOUBLE NOT NULL,
	PRIMARY KEY (id)
);

INSERT INTO employee VALUES (1001,'Jose', 'Technology', 40000.67);
INSERT INTO employee VALUES (1002,'John', 'Human Resource', 20000.00);
INSERT INTO employee VALUES (1003,'Jane', 'Delivery', 80000.00);