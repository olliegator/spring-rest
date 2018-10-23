FROM java

ENV http_proxy=http://10.144.1.10:8080 \
    https_proxy=http://10.144.1.10:8080

COPY target/test-spring-rest-hateoas-0.1.0.jar .

EXPOSE 8080
CMD java -jar test-spring-rest-hateoas-0.1.0.jar
