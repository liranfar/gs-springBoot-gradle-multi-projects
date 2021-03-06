# SpringBoot Multi-Projects using Gradle

A skeleton for starting multi-projects (synced with IntelliJ IDE)

## Getting Started

`./gradlew build && ./gradlew bootRun --parallel`

## Build Docker Image
`./gradlew build application:buildDocker`

## Spring Boot Admin
```bash
cd admin
./gradlew build && ./gradlew bootRun
```
## License

This project is licensed under the MIT License

## Resources


* [Spring.io - multi-module](https://spring.io/guides/gs/multi-module/)
* [TutorialsPoint](https://www.tutorialspoint.com/spring_boot/index.htm)
* [launch multiple servers on spring boot](https://stackoverflow.com/questions/23621723/launch-multiple-gradle-spring-boot-plugin-bootrun-tasks-in-parallel)
* [SpringBootAdmin - codecentric](http://codecentric.github.io)
