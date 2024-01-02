

#  Todo List 

My first Spring Boot Web Application 

## Docker

Launch MySQL using Docker

```bash
  docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=todos-user --env MYSQL_PASSWORD=dummytodos --env MYSQL_DATABASE=todos --name mysql --publish 3306:3306 mysql:8-oracle
```

application.properties configuration


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
