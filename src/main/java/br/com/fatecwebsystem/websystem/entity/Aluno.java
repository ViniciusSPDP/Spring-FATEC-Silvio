package br.com.fatecwebsystem.websystem.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAluno;

    @Column(nullable = false, length = 40)
    private String nomeAluno;

    @Column(nullable = false, length = 60)
    private String enderecoAluno;

    @Column(nullable = false, length = 20)
    private String telefoneAluno;

    @Column(nullable = false, length = 20)
    private String cpfAluno;

    @Column(nullable = false, length = 20)
    private Integer raAluno;

    @ManyToOne
    @JoinColumn(name = "idCurso_fk", nullable = false)
    private Curso curso;
    
}
