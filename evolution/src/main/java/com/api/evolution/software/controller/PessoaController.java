package com.api.evolution.software.controller;

import com.api.evolution.software.model.Pessoa;
import com.api.evolution.software.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaService service;

    public PessoaController(PessoaService service){
        this.service = service;
    }

    @GetMapping
    public List<Pessoa> findAll(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa create(@RequestBody Pessoa pessoa){
        return service.save(pessoa);
    }

    @PutMapping
    public void update(@RequestBody Pessoa pessoa){ service.update(pessoa); }

    @DeleteMapping(value = "/{idpessoas}")
    public Integer delete(Integer id){ return service.delete(id); }
}
