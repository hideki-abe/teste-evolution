package com.api.evolution.software.controller;

import com.api.evolution.software.model.Pessoa;
import com.api.evolution.software.service.PessoaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
@Api("Api de pessoas")
public class PessoaController {

    private PessoaService service;

    public PessoaController(PessoaService service){
        this.service = service;
    }

    @GetMapping
    @ApiOperation("Lista todas as pessoas.")
    public List<Pessoa> findAll(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Salva uma pessoa.")
    public Pessoa create(@RequestBody Pessoa pessoa){
        return service.save(pessoa);
    }

    @PutMapping
    @ApiOperation("Realiza update em uma pessoa.")
    public void update(@RequestBody Pessoa pessoa){ service.update(pessoa); }

    @DeleteMapping(value = "/{idpessoas}")
    @ApiOperation("Deleta uma pessoa.")
    public Integer delete(Integer id){ return service.delete(id); }
}
