## Guide to use environment properties to store configuration

* Run active profile and set inside JVM arguments with this command: `-Dspring.profiles.active=prod -Dbuild.version=1.3`, right click on `AccountsApplication` -> More/run Debug -> Modify run configuration -> Modify options
* for set in Program arguments, use this command: `--spring.profiles.active=prod --build.version=1.3`
* for set in Environment variables, use this command: `SPRING_PROFILES_ACTIVE=prod BUILD_VERSION=1.8`

This repository contains example of access external configuration within three methods: `@Value`, `@ConfigurationProperties` and environment properties.

## Cloud Config

* for using local path configurations, use this config:
  ```
  spring.profiles.active=native
  spring.cloud.config.server.native.search-locations=classpath:/config
  # spring.cloud.config.server.native.search-locations=file:///Users/ichwansholihin/documents/config
  ```
* for using git configuration, use this config:
```
spring.cloud.config.server.git.uri=https://github.com/ichwansh03/docker-config-server.git
spring.cloud.config.server.git.clone-on-start=true
spring.cloud.config.server.git.default-label=main
spring.cloud.config.server.git.timeout=5
```
