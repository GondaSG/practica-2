FROM  openjdk:11.0-oracle
COPY "./target/practice2-0.0.1-SNAPSHOT.jar" "app.jar"
ENTRYPOINT ["java", "-jar", "app.jar"]

