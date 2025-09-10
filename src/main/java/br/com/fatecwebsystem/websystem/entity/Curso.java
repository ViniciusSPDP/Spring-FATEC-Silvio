package br.com.fatecwebsystem.websystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCurso;


    @Column(nullable = false, length = 40)
    private String nomeCurso;

    @Column(nullable = false, length = 60)
    private String periodoCurso;

    @Column(nullable = false)
    private Integer cargahorariaCurso;

    @Column(nullable = false, length = 20)
    private String tipoCurso;
}
