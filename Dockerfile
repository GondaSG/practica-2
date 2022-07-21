FROM  openjdk:11.0-oracle
EXPOSE 8090
COPY "./target/practice2-0.0.1-SNAPSHOT.jar" "app.jar"
ENTRYPOINT ["java", "-jar", "app.jar"]

