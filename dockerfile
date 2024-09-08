# Etapa 2: Ejecución
FROM openjdk:17-jdk-slim

# Copia el archivo JAR generado en la fase de construcción al contenedor
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]