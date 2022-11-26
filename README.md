# Dental-Clinic-project

## What is this app?

- This app could make appointments at a dentist.
- The main users would be the new patient and the registered patient.

## What kinds of problems will they solve with the system?

- In Vancouver, it is hard to make an appointment at a dentist.
- In the worst case, we can not schedule within next 6 months.
- This app enables patient to schedule it easily.

## Stacks

- JDK 17
- MySQL 5.7
- maven

## GUI design and Modality

- https://miro.com/app/board/uXjVPCdZVUI=/?share_link_id=14524814338

## Basic design decisions

- ![Color pallet](/src/main/resources/static/images/Screen%20Shot%202022-11-26%20at%2012.25.10%20PM.png)

## SQL script may be supplied

- ???

## Java Library

- ???

## Project Member

- Yuta / Amir / Hiro / Yuki

## Reference list

- https://www.drbany.com/
- https://unsplash.com/ja

### How to setup

1. Add MySQL credentials

- Create a credential file (`application.properties`)

```bash
cp ./src/main/resources/application.properties.sample ./src/main/resources/application.properties
```

2. Change credentials to yours

- If you got the below error, you need to use TLS1.2 to connect MySQL.
  > Caused by: javax.net.ssl.SSLHandshakeException: No appropriate protocol (protocol is disabled or cipher suites are inappropriate)
- So please specify like "?enabledTLSProtocols=TLSv1.2".

```java
spring.datasource.url=jdbc:mysql://localhost:3306/db_name?enabledTLSProtocols=TLSv1.2
```

3. Create a database and tables.

- Before running this app, you need to create database and tables.
- Please follow below commands.

```bash
mysql -h 127.0.0.1 -P 3306 -u root -p < ./sql/01_ddl.sql
mysql -h 127.0.0.1 -P 3306 -u root -p < ./sql/02_initial-data.sql
```

- Or, you can run those files with MySQL workbench.
  - Refer [here](https://www.tutorialspoint.com/how-to-run-sql-script-in-mysql#:~:text=To%20run%20SQL%20script%20in%20MySQL%2C%20use%20the%20MySQL%20workbench,need%20to%20open%20MySQL%20workbench.&text=Now%2C%20File%20%2D%3E%20Open%20SQL,to%20open%20the%20SQL%20script.&text=Note%20%E2%88%92%20Press%20OK%20button%20twice%20to%20connect%20with%20MySQL.)
