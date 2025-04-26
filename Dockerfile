FROM openjdk:25-ea-4-jdk-oraclelinux9

WORKDIR /app

COPY target/Task6.jar Task6.jar


EXPOSE 8080

ENTRYPOINT ["java", "-jar","Task6.jar"]