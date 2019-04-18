# ingenieria-software-lab2
Laboratorio #2 del curso de Ingeniería de Software

Alumno: Josué Ismael de León Azurdia

Carne: 1290-15-11788

## EndPoints

## Docker Containers
* josuedla/lab2-cursos
* josuedla/lab2-estudiantes 

##Dockerfiles
### Cursos
```sh
FROM openjdk:8-jre-alpine
EXPOSE 9009
ADD cursos-0.0.1-SNAPSHOT.jar lab2-cursos.jar
ENTRYPOINT ["java","-jar","lab2-cursos.jar"]
```

### Estudiantes
```sh
FROM openjdk:8-jre-alpine
EXPOSE 9008
ADD estudiantes-0.0.1-SNAPSHOT.jar lab2-estudiantes.jar
ENTRYPOINT ["java","-jar","lab2-estudiantes.jar"]
```
