package com.api.evolution.software.service;

import com.api.evolution.software.model.Pessoa;
import com.api.evolution.software.repository.PessoaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    PessoaRepository repository;

    public PessoaService(PessoaRepository repository){
        this.repository = repository;
    }

    public List<Pessoa> findAll(){
        return repository.findAll();
    }

    public Pessoa save(Pessoa pessoa){ return repository.save(pessoa); }

    @Transactional
    public void update(Pessoa pessoaAtt) {
        System.out.println(pessoaAtt.getId());
        repository.findById(pessoaAtt.getId())
                .ifPresent( pessoa -> {
                    pessoa.setNome(pessoaAtt.getNome());
                    pessoa.setCpf(pessoaAtt.getCpf());
                    pessoa.setCep(pessoaAtt.getCep());
                    pessoa.setEmail(pessoaAtt.getEmail());
                    pessoa.setComplemento(pessoaAtt.getComplemento());
                    pessoa.setBairro(pessoaAtt.getBairro());
                    pessoa.setLogradouro(pessoaAtt.getLogradouro());

                    repository.save(pessoa);
                });
    }

    public Integer delete(Integer id){ return repository.deletePessoaById(id); }
}
