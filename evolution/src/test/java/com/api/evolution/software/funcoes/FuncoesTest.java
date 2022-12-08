package com.api.evolution.software.funcoes;

import org.junit.Test;

import static org.junit.Assert.*;

public class FuncoesTest {

    @Test
    public void recursaoTeste() {
        Funcoes funcoes = new Funcoes();
        int num = funcoes.recursao(5);
        assertEquals(num, 120);
    }

    @Test
    public void removeLetrasDuplicadasTeste(){
        Funcoes funcoes = new Funcoes();
        String palavraFormatada = funcoes.removeLetrasDuplicadas("assessee");
        assertEquals("asese", palavraFormatada);
    }
}