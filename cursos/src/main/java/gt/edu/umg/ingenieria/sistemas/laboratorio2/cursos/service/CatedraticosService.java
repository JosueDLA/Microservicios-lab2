package gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.dao.CatedraticosRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.cursos.model.Catedraticos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatedraticosService {
    @Autowired
    private CatedraticosRepository catedraticoRepository;
    
    public Catedraticos registrar(Catedraticos c1){
        return this.catedraticoRepository.save(c1);
    }
    
    public List<Catedraticos> buscarTodos(){
        List<Catedraticos> lista = (List<Catedraticos>) this.catedraticoRepository.findAll();
        return lista;
    }
}
