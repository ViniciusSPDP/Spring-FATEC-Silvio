package br.com.fatecwebsystem.websystem.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.fatecwebsystem.websystem.entity.Curso;
import br.com.fatecwebsystem.websystem.repository.CursoRepository;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    //Metodo Salvar Curso
    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    //Metodo para listar Curso
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    //Metodo para excluir Curso pelo id
    public void deleteById(Integer id) {
        cursoRepository.deleteById(id);
    }

    //Metodo para buscar Curso pelo id
    public Curso findById(Integer id) {
        return cursoRepository.findById(id).orElse(null);
    }


    
}
