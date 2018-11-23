# wildfly-swarm-elk
Wildfly-swarm and ELK log centralized

### ELK Docker

``` sh
docker-composer up -d
```

## Build & Run

``` sh
cd log-generator
mvn clean package wildfly-swarm:run
```

## Tests

http://localhost:8080/info

http://localhost:8080/warn

http://localhost:8080/error

http://localhost:8080/debug

http://localhost:8080/exception

