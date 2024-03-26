FROM jdk:17
EXPOSE 8080
ADD target/deveops-integration devops-integration.jar
ENTRYPOINT ["java","-jar","/devops-integration.jar"]