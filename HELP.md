# Getting Started

Build application - mvn clean install

Run application - mvn spring-boot:run

Note - See swagger based documentation once application is running

## Add idea using command line:

curl --location --request POST 'http://localhost:8080/www.verycoolapp.com/idea/add' \
--header 'Content-Type: application/json' \
--data-raw ' {
"name": "idea name",
"description": "idea description"
}'

## List ideas from command line : 

curl --location --request GET 'http://localhost:8080/www.verycoolapp.com/idea/list'


## Documentation

* [Swagger API](http://localhost:8080/swagger-ui/index.html)

