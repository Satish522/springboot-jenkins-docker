From openjdk:17
EXPOSE 8080
ADD target/springboot-jenkins-docker-0.0.1-SNAPSHOT.jar springboot-jenkins-docker.jar
ENTRYPOINT [ "java", "-jar", "springboot-jenkins-docker.jar" ]
