
#  Spring Boot TodoList Web Application 


## Overview

This is a simple TodoList web application built using Spring Boot. It performs basic CRUD (Create, Read, Update, Delete) operations on Todo items. The application uses both MySQL and H2 databases to store and retrieve Todo data. 

##  

Create, Read, Update, and Delete Todo items.
Store data in both MySQL and H2 databases.
Spring Boot for easy setup and development.
## Features

- Create, Read, Update, and Delete Todo items.
- Store data in both MySQL and H2 databases.
- Spring Boot for easy setup and development.

## Prerequisites

#### Make sure you have the following installed before running the application:

- Java JDK 8 or higher
- Maven
- Apache
- MySQL database server (optional, if you want to use MySQL)
and 
- Access the application in your web browser at http://localhost:8080.

## Configuration

#### H2 Database (default)

The application is configured to use an H2 in-memory database by default. You can access the H2 console at http://localhost:8080/h2-console for testing and debugging purposes.

## Docker

#### Launch MySQL using Docker

```bash
  docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=todos-user --env MYSQL_PASSWORD=dummytodos --env MYSQL_DATABASE=todos --name mysql --publish 3306:3306 mysql:8-oracle
```

#### application.properties configuration


```bash
#spring.datasource.url=jdbc:h2:mem:testdb

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/todos
spring.datasource.username=todos-user
spring.datasource.password=dummytodos
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

#todos-user@localhost:3306
```

mysqlsh commands

```bash
mysqlsh
\connect todos-user@localhost:3306
\sql
use todos
select * from todo;
\quit
```

Docker Commands
``` bash
docker container ls
docker container stop ID
```


## Install MySQL

https://dev.mysql.com/doc/mysql-shell/8.0/en/mysql-shell-install.html
