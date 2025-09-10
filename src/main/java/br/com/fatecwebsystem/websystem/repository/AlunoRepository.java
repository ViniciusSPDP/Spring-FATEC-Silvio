package br.com.fatecwebsystem.websystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecwebsystem.websystem.dto.AlunoTelefone;
import br.com.fatecwebsystem.websystem.entity.Aluno;
import org.springframework.data.jpa.repository.Query;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    

    //Listar nome e telefone de alunos
    @Query("SELECT new br.com.fatecwebsystem.websystem.dto.AlunoTelefone(a.nomeAluno, a.telefoneAluno) FROM Aluno a")
    List<AlunoTelefone> buscarNomesETelefones();
}
