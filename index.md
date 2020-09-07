# Mircoservices for Students and Courses

RESTful Services POST and GET for:
- Estudiante
- Curso
- Catedratico

## EndPoints
### Estudiantes
- http://localhost:9001/estudiantes/registrar
- http://localhost:9001/estudiantes/buscarTodos

### Cursos
- http://localhost:9002/cursos/crear
- http://localhost:9002/cursos/buscarTodos

- http://localhost:9002/catedraticos/registrar
- http://localhost:9002/catedraticos/buscarTodos

## Docker
### Docker Containers
* josuedla/lab2-estudiantes
* josuedla/lab2-cursos

### Download Docker Image
```sh
> sudo docker pull josuedla/lab2-estudiantes
> sudo docker pull josuedla/lab2-cursos
```

### Run Docker Image 
Run josuedla/lab2-estudiantes in port 9001
```sh
> sudo docker run -p 9001:9008 josuedla/lab2-estudiantes
```
Run josuedla/lab2-cursos in port 9002
```sh
> sudo docker run -p 9002:9009 josuedla/lab2-cursos
```

### Dockerfiles
#### Estudiantes
```sh
FROM openjdk:8-jre-alpine
EXPOSE 9008
ADD estudiantes-0.0.1-SNAPSHOT.jar lab2-estudiantes.jar
ENTRYPOINT ["java","-jar","lab2-estudiantes.jar"]
```

#### Cursos
```sh
FROM openjdk:8-jre-alpine
EXPOSE 9009
ADD cursos-0.0.1-SNAPSHOT.jar lab2-cursos.jar
ENTRYPOINT ["java","-jar","lab2-cursos.jar"]
```

