package gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.controller;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.model.Estudiante;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;
    
    @PostMapping("/registrar")
    public Estudiante registrar(@RequestBody(required = true) Estudiante e1){
        return this.estudianteService.registrar(e1);
    }
    
    @GetMapping("/buscarTodos")
    public List<Estudiante> buscarTodos(){
        return this.estudianteService.buscarTodos();
    }
}
