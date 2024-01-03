
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
- MySQL database server
- Docker 
- Access the application in your web browser at http://localhost:8080/login.

## Configuration

#### H2 Database

The application is configured to use an H2 in-memory database by default. You can access the H2 console at http://localhost:8080/h2-console for testing and debugging purposes.

## Docker (default)

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


## Steps 

### Step-01 Login
#### username - karma2003
#### password - dummy1
(If shows an error open in a new tab or reload)

![Screenshot (85)](https://github.com/Rkarama26/Todo-List-using-SpringBoot/assets/133999108/1c5f212f-e0ea-4040-b3d5-6846f729c90a)

#### Step-02 Home
Click on "manage todos"

![Screenshot (86)](https://github.com/Rkarama26/Todo-List-using-SpringBoot/assets/133999108/22d48a87-3657-4d97-ba0c-9b2f7dd84f73)

#### Step-03 Task List
Click on "Add Todo" to add a new task

![Screenshot (87)](https://github.com/Rkarama26/Todo-List-using-SpringBoot/assets/133999108/c5953a7c-f042-4a89-832f-f79bfc71cd3e)


#### Step-04 Update task

![Screenshot (88)](https://github.com/Rkarama26/Todo-List-using-SpringBoot/assets/133999108/8b0893ea-31a3-4a37-9f40-876b1e940f01)










