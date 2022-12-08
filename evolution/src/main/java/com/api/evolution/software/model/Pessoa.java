package com.api.evolution.software.model;

import lombok.*;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pessoas")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpessoas")
    private Integer id;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "cep")
    private String cep;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "complemento")
    private String complemento;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "uf")
    private String uf;
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, targetEntity = Contato.class, fetch = FetchType.LAZY)
    private List<Contato> contatos = new ArrayList<>();


}
