# RestAPISpringBoot

1. Basic Setup for setting up springboot webapp.
2. Work around and consumed the REST APIs: GET, POST, DELETE.
3. Added Validations for POST API body.
4. Swagger-UI Documentation for REST APIs.
5. Content Negotitaion.
6. Internationalization
7. Versioning based on:
    a. URI Versioning - Twitter
    b. Request Parameter versioning - Amazon
    c. (Custom) headers versioning - Microsoft
    d. Media type versioning - Github
8. HATEOAS, HAL
9. Filtering (static,dynamic)
10. Actuators
11. JPA
12. Connet to H2 database
13. Docker

Command used: docker run --detach
--env MYSQL_ROOT_PASSWORD=dummypassword
--env MYSQL_USER=social-media-user
--env MYSQL_PASSWORD=dummypassword 
--env MYSQL_DATABASE=social-media-database 
--name mysql 
--publish 3306:3306 
mysql:8-oracle

14. Connecting to mysql
