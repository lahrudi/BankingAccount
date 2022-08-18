FROM openjdk:17
MAINTAINER AlirezaGholamzadehLahrudi@gmail.com
COPY target/com.bank-account-0.0.1-SNAPSHOT.jar bank-account.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/bank-account.jar"]


