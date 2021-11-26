

FROM maven:3.6.3-jdk-8 AS builder
RUN java -version
COPY . /usr/src/myapp/
WORKDIR /usr/src/myapp/
RUN mvn clean package -DskipTests

FROM maven:3.6.3-jdk-8
EXPOSE 8080
WORKDIR /root/
COPY --from=builder /usr/src/myapp/target/user-service.jar .
ENTRYPOINT ["java", "-jar", "./user-service.jar"]