# Elogroup-back

### 🚀 About
Project for Elogroup challenge

### 🔨 Tecnologies
* [H2DB](https://www.h2database.com/html/main.html)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Data](https://spring.io/projects/spring-data)
* [Spring Security](https://spring.io/projects/spring-security)
* [MapStruct](https://mapstruct.org/)

### 💻 How to use

Run on your shell:
```sh
$ mvn clean install
$ mvn spring-boot:run
```
 To access the database client:
 
 * [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
   * Credentials: 
     * Username: `sa`
     * No password
   * **JDBC URL**: `jdbc:h2:mem:testdb`
   * **Driver Class**: `org.h2.Driver`
