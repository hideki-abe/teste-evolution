package com.api.evolution.software.service;

import com.api.evolution.software.model.Contato;
import com.api.evolution.software.model.Pessoa;
import com.api.evolution.software.repository.ContatoRepository;
import com.api.evolution.software.repository.PessoaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    PessoaRepository repository;
    ContatoRepository contatoRepository;

    public PessoaService(PessoaRepository repository, ContatoRepository contatoRepository){
        this.contatoRepository = contatoRepository;
        this.repository = repository;
    }

    public List<Pessoa> findAll(){
        return repository.findAll();
    }

    public void save(Pessoa pessoa){
        repository.save(pessoa);
        for(Contato contato: pessoa.getContatos()){
            contato.setPessoa(pessoa);
            contatoRepository.save(contato);
        }
    }

    @Transactional
    public void update(Pessoa pessoaAtt) {
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

    @Transactional
    public Integer delete(Integer id){ return repository.deletePessoaById(id); }
}
