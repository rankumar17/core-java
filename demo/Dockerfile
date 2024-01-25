FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /opt/app
COPY target/demo-1.1.1.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]