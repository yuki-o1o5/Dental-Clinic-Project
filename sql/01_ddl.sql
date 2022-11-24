CREATE DATABASE IF NOT EXISTS dental CHARACTER SET
utf8 COLLATE utf8_general_ci;

USE dental;

DROP TABLE IF EXISTS dental.account, dental.users, dental.doctors;

CREATE TABLE IF NOT EXISTS dental.account(
    account_id    int PRIMARY KEY AUTO_INCREMENT,
    email         varchar(50) NOT NULL,
    password      varchar(30) NOT NULL,
    user_name     varchar(30) NOT NULL,
    INDEX(account_id)
);

CREATE TABLE IF NOT EXISTS dental.users(
    uuid          int PRIMARY KEY AUTO_INCREMENT,
    email         varchar(50) NOT NULL,
    password      varchar(30) NOT NULL,
    first_name    varchar(30) NOT NULL,
    last_name     varchar(30) NOT NULL,
    birthdate     varchar(30) NOT NULL,
    phone         varchar(30) NOT NULL,
    INDEX(uuid)
);

CREATE TABLE IF NOT EXISTS dental.doctor_schedules(
    uuid          int PRIMARY KEY AUTO_INCREMENT,
    doctor_uuid   int,
    time          varchar(30) NOT NULL,
    INDEX(uuid)
);

CREATE TABLE IF NOT EXISTS dental.doctors(
    uuid          int PRIMARY KEY AUTO_INCREMENT,
    name          varchar(30) NOT NULL,
    INDEX(uuid)
);

CREATE TABLE IF NOT EXISTS dental.appointments(
    uuid                    int PRIMARY KEY AUTO_INCREMENT,
    doctor_schedule_uuid    int NOT NULL,
    user_uuid               int NOT NULL,
    INDEX(uuid)
);
