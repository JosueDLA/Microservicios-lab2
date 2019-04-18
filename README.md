# ingenieria-software-lab2
Laboratorio #2 del curso de Ingeniería de Software

Alumno: Josué Ismael de León Azurdia
Carne: 1290-15-11788

## EndPoints

## Docker Containers
- josuedla/
- josuedla/

##Dockerfiles
'''sh
FROM openjdk:8-jre-alpine
EXPOSE 8080
ADD target/multiservicios-suma-0.0.1-SNAPSHOT.jar suma.jar
ENTRYPOINT ["java","-jar","suma.jar"]
'''
