package br.com.fatecwebsystem.websystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fatecwebsystem.websystem.entity.Aluno;
import br.com.fatecwebsystem.websystem.repository.AlunoRepository;
import java.util.List;
import br.com.fatecwebsystem.websystem.dto.AlunoTelefone;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    //Metodo Salvar Aluno
    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    //Metodo para listar Aluno
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    //Metodo para excluir aluno pelo id
    public void deleteById(Integer id) {
        alunoRepository.deleteById(id);
    }
    
    //Metodo para buscar aluno pelo id
    public Aluno findById(Integer id) {
        return alunoRepository.findById(id).orElse(null);
    }

    //Metodo para buscar aluno e telefone
    public List<AlunoTelefone> buscarNomesETelefones() {
        return alunoRepository.buscarNomesETelefones();
    }

    
}
