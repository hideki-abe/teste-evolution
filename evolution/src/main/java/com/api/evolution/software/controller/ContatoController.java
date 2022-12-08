package com.api.evolution.software.controller;

import com.api.evolution.software.model.Contato;
import com.api.evolution.software.service.ContatoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
public class ContatoController {
/*

    private ContatoService service;

    public ContatoController(ContatoService service){
        this.service = service;
    }

    @GetMapping
    public List<Contato> findAll(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Contato create(@RequestBody Contato contato){
        return service.save(contato);
    }

    @PutMapping
    public void update(@RequestBody Contato contato){ service.update(contato); }

    @DeleteMapping(value = "/{idcontato}")
    public Integer delete(Integer id){ return service.delete(id); }
*/

}
