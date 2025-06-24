FROM openjdk:17
WORKDIR /app
COPY target/soalteeloyalty-0.0.1-SNAPSHOT.jar /app/app.jar
ENV JAVA_OPTS="-Xms2g -Xmx4g"
ENV TZ Asia/Kathmandu
EXPOSE 8090
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app/app.jar