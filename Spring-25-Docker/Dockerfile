
#base image / it has to be in dockerfile
FROM openjdk:17-jdk
#will get jar file and copy image
COPY ./target/Spring-24-Docker-0.0.1-SNAPSHOT.jar /usr/app/
#to direct any folder
WORKDIR /usr/app
# will provide exacutable appliaction when container starts the run
ENTRYPOINT ["java","-jar","Spring-24-Docker-0.0.1-SNAPSHOT.jar"]