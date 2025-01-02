#### Use buildpacks and google jib for build docker image option, add in pom.xml plugin.
## Spring Configuration
* Option 1: use annotation `@Value`, jika tidak memiliki banyak konfigurasi di properties dan mengakses valuenya langsung dari file properties
* Dokumentasi Spring Cloud Config https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_quick_start
* Di Spring Actuator, terdapat informasi terkait kesiapan (readiness) dan kondisi (liveness) pada server dengan mengakses endpoint actuator/health/readiness atau /liveness. 
* Liveness and Readiness ref: https://medium.com/@salarai.de/how-to-enable-liveness-and-readiness-probes-in-a-spring-boot-application-a40cf3423db3