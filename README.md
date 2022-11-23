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
