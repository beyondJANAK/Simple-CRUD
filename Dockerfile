FROM openjdk:17
WORKDIR /app

COPY target/*.jar /app/app.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "app.jar"]