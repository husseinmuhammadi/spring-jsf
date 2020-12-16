# CIF UI
This project is represent a UI for CIF and it is goting to use the restful api as its underlying service

This project is a web project with jsf and mojarra implementation which is going to deploy on apache tomcat 9

## Compile and Package
This is a war project and to compile this project use command bellow
```
mvn clean package
``` 

## Testing with mockito
During the test phase of the project, the service layer will be mocked 
So you will see instead of calling real rest api the project will mock
```
CifService mockService = mock(CifService.class);
        when(mockService.findAll())
                .thenReturn(...
``` 

## Installation
To install the project you only need to deploy the war file into running tomcat server

