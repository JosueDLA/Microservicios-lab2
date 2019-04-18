package gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.dao.EstudianteRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.model.Estudiante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;
    
    public Estudiante registrar(Estudiante e1){
        return this.estudianteRepository.save(e1);
    }
    
    public List<Estudiante> buscarTodos(){
        List<Estudiante> lista = (List<Estudiante>) this.estudianteRepository.findAll();
        return lista;
    }
    
}
