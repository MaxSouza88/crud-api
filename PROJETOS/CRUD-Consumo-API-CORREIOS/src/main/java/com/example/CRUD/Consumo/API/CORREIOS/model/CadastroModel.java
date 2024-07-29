package com.example.CRUD.Consumo.API.CORREIOS.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cadastros")
public class CadastroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "nome", nullable = false, length = 15)
    private String nome;

    @Column(name = "sobrenome", nullable = false, length = 60)
    private String sobrenome;

    @Column(name = "cep", nullable = false, length = 9)
    private Long cep;
}