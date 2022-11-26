# Dental-Clinic-project

## Stacks
- JDK 17
- MySQL 5.7
- maven

## Java Library
-

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



