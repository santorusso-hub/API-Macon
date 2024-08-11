FROM eclipse-temurin:21.0.2_13-jdk-alpine AS builder

WORKDIR /app

COPY . .

RUN chmod +x ./mvnw

RUN ./mvnw clean install package

FROM eclipse-temurin:21.0.2_13-jre-alpine

WORKDIR /app

COPY --from=builder /app/target/spring-boot-rest-crud-0.0.1-SNAPSHOT.jar /app


# Exponha a porta 8080 para acesso à aplicação
EXPOSE 8050

# Comando para iniciar a aplicação quando o contêiner for iniciado
CMD ["java", "-jar", "/app/spring-boot-rest-crud-0.0.1-SNAPSHOT.jar"]