package br.com.fatecwebsystem.websystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fatecwebsystem.websystem.service.AlunoService;
import br.com.fatecwebsystem.websystem.entity.Aluno;
import br.com.fatecwebsystem.websystem.entity.Curso;

import org.springframework.ui.Model;
import java.util.List;
import br.com.fatecwebsystem.websystem.dto.AlunoTelefone;
import org.springframework.web.bind.annotation.PathVariable;
import br.com.fatecwebsystem.websystem.service.CursoService;



@Controller
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private CursoService cursoService;

    // Metodo abrir tela de cadastro
    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("aluno", new Aluno());
        List<Curso> cursos = cursoService.findAll();
        model.addAttribute("cursos", cursos);
        return "aluno/formularioAluno";
    }

    // Metodo salvar aluno
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Aluno aluno) {
        alunoService.save(aluno);
        return "redirect:/alunos/listar"; // Redireciona para a lista de alunos após salvar
    }

    // Metodo listar alunos
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Aluno> alunos = alunoService.findAll();
        model.addAttribute("alunos", alunos);
        return "aluno/listaAluno"; // Retorna o nome da vieww
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        alunoService.deleteById(id);
        return "redirect:/alunos/listar"; // Redireciona para a lista de alunos após excluir
    }

    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable Integer id, Model model) {
        Aluno aluno = alunoService.findById(id);
        model.addAttribute("aluno", aluno);
        List<Curso> cursos = cursoService.findAll();
        model.addAttribute("cursos", cursos);
        return "aluno/formularioAluno"; // Reutiliza o formulário para edição
    }

    @GetMapping("/listar-nome-telefone")
    public String listarNomesETelefones(Model model) {
        List<AlunoTelefone> alunos = alunoService.buscarNomesETelefones();
        model.addAttribute("alunos", alunos);
        return "aluno/listarNomeTelefone"; // Retorna o nome da view
    }

}
