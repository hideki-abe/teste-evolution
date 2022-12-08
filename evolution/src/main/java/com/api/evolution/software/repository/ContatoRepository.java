package com.api.evolution.software.repository;

import com.api.evolution.software.model.Contato;
import com.api.evolution.software.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

    List<Contato> findAll();
    Pessoa save(Pessoa pessoa);
    Integer deletePessoaById(Integer id);

}
