FROM adoptopenjdk/openjdk11
ARG JAR_FILE=RegisterLogin-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} registerlogin.jar
ENTRYPOINT [ "java","-jar","/registerlogin.jar" ]