package com.api.evolution.software.service;

import com.api.evolution.software.model.Contato;
import com.api.evolution.software.repository.ContatoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    ContatoRepository repository;

    public ContatoService(ContatoRepository repository){ this.repository = repository; }

    public List<Contato> findAll(){
        return repository.findAll();
    }

    @Transactional
    public Contato save(Contato contato){ return repository.save(contato); }

    @Transactional
    public void update(Contato contatoAtt) {
        repository.findById(contatoAtt.getId())
                .ifPresent( contato -> {
                   contato.setCelular(contatoAtt.getCelular());
                   contato.setPessoa(contatoAtt.getPessoa());
                   contato.setTelefone(contatoAtt.getTelefone());
                   contato.setNome(contatoAtt.getNome());
                   repository.save(contato);
                });
    }

    public Integer delete(Integer id){ return repository.deleteContatoById(id); }

}
