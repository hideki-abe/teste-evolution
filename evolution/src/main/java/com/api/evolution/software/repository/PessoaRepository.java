package com.api.evolution.software.repository;

import com.api.evolution.software.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    List<Pessoa> findAll();
    Pessoa save(Pessoa pessoa);
    Integer deletePessoaById(Integer id);

}
