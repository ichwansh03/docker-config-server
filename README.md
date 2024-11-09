#### Add docker-compose to config single build

```dockerfile
services:
  accounts:
    image: "ichwansh34/accounts:s4"
    container_name: accounts-ms
    ports:
      - "8080:8080"
    deploy:
      resources:
        limits:
          memory: 700m
    networks:
      - ichwansh
  loans:
    image: "ichwansh34/loans:s4"
    container_name: loans-ms
    ports:
      - "8090:8090"
    deploy:
      resources:
        limits:
          memory: 700m
    networks:
      - ichwansh
  cards:
    image: "ichwansh34/cards:s4"
    container_name: cards-ms
    ports:
      - "8888:8888"
    deploy:
      resources:
        limits:
          memory: 700m
    networks:
      - ichwansh
networks:
  ichwansh:
    driver: "bridge"
```

#### Use buildpacks and google jib for build docker image option, add in pom.xml plugin.
