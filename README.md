# Test with Spring REST and HATEOAS

## Java Build

```
mvn clean install
```

## Docker Build

```
docker build -t spring-rest .
docker run --rm -p 8080:8080 --name spring-rest spring-rest

```

## Docker Run

```
docker run --rm -p 8080:8080 --name spring-rest spring-rest
```

## URLs

```
curl -i http://localhost:8080
curl -i http://localhost:8080/greeting
curl -i http://localhost:8080/greeting/Miguel
```
