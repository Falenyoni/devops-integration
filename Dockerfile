FROM openjdk17:alpine
EXPOSE 8080
ADD target/devops-integration devops-integration.jar
ENTRYPOINT ["java","-jar","/devops-integration.jar"]