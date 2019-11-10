/*
	Log in as root user first before running this SQL script.
	Will update this file when more stuff is added to the database.
	
	To run the file:
	Command line - type "source sql_script.sql"
	Workbench - File > Run SQL Script
*/

CREATE DATABASE uow_ebs;
USE uow_ebs;
CREATE USER staff01 IDENTIFIED BY 'staff1234';
GRANT SELECT, INSERT, UPDATE, DELETE ON uow_ebs.* TO staff01;
CREATE USER student01 IDENTIFIED BY 'student1234';
GRANT SELECT ON uow_ebs.* TO student01;
GRANT INSERT, UPDATE, DELETE ON uow_ebs.bookings TO student01;
CREATE USER admin01 IDENTIFIED BY 'admin1234';
GRANT CREATE USER ON *.* TO admin01;

CREATE TABLE events(
title VARCHAR(20) NOT NULL,
eventID CHAR(5) NOT NULL,
date CHAR(10) NOT NULL,
start_time CHAR(5) NOT NULL,
venue VARCHAR(20) NOT NULL,
capacity INT(3) NOT NULL,
ticket_price DECIMAL(4,2) NULL
);

CREATE TABLE bookings(
eventID CHAR(5) NOT NULL,
tickets_qty INT(1) NULL CHECK (tickets_qty BETWEEN 1 AND 4),
booked_by VARCHAR(7) NOT NULL
);

INSERT INTO events VALUES ('CSIT121 exam', 'HENGG', '25-11-2019', '10:00', 'TBC', '150', null);
INSERT INTO events VALUES ('CSIT214 exam', '0H5HT', '29-11-2019', '14:15', 'TBC', '200', null);

INSERT INTO bookings VALUES ('HENGG', '4', '0123456');
