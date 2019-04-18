package gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.dao;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.estudiantes.model.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {
    
}
