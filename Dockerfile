FROM java

COPY target/test-spring-rest-hateoas-0.1.0.jar .

EXPOSE 8080
CMD java -jar test-spring-rest-hateoas-0.1.0.jar
