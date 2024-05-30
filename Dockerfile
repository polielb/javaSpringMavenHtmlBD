FROM openjdk:22-jdk-slim

# Instalar default-mysql-client
RUN apt-get update && apt-get install -y curl && apt-get install -y default-mysql-client && rm -rf /var/lib/apt/lists/*

# Copiar el archivo JAR del proyecto al contenedor
COPY target/holaspring-1.0.0.jar /app/HolaMundoApp.jar

# Exponer el puerto 8080
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/HolaMundoApp.jar"]


