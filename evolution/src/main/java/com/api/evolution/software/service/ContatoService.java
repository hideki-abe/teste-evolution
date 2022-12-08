package com.api.evolution.software.service;

import com.api.evolution.software.model.Contato;
import com.api.evolution.software.model.Pessoa;
import com.api.evolution.software.repository.ContatoRepository;
import com.api.evolution.software.repository.PessoaRepository;
import jakarta.transaction.Transactional;

import java.util.List;

public class ContatoService {

    ContatoRepository repository;

    public ContatoService(ContatoRepository repository){ this.repository = repository; }

    public List<Contato> findAll(){
        return repository.findAll();
    }

    public Contato save(Contato contato){ return repository.save(contato); }

    @Transactional
    public void update(Contato contato) {
        System.out.println(contato.getId());
        repository.findById(contato.getId())
                .ifPresent( pessoa -> {


                    repository.save(pessoa);
                });
    }

    public Integer delete(Integer id){ return repository.deletePessoaById(id); }

}
