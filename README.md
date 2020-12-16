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

## Specifications
This project uses frameworks and patterns as below:
- Servlet: Servlet version 4 to deploy on web container such as apache tomcat 9 or jetty
- JSF: Jsf version 2.3 using mojarra implementation 
- CDI: To inject jsf beans we are going to inject them by CDI with weld implementation
- Mokito: For integration testing with junit and mock the rest api module we will write test methods with mockito