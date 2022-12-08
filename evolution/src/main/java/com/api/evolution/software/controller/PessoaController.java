package com.api.evolution.software.controller;

import com.api.evolution.software.model.Pessoa;
import com.api.evolution.software.service.PessoaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
    public List<Pessoa> findPessoas(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Salva uma pessoa.")
    public void create(@RequestBody Pessoa pessoa){
        service.save(pessoa);
    }

    @PutMapping
    @ApiOperation("Realiza update em uma pessoa.")
    public void update(@RequestBody Pessoa pessoa){ service.update(pessoa); }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    @ApiOperation("Deleta uma pessoa.")
    public Integer delete(@PathVariable Integer id){ return service.delete(id); }
}
