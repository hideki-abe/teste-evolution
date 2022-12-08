package com.api.evolution.software.funcoes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Funcoes {

    public int recursao(int num){
        if(num == 0){
            return 1;
        }
        return num*recursao(num - 1);
    }

    public String removeLetrasDuplicadas(String palavra){
        StringBuilder sb = new StringBuilder();
        char anterior = 0;
        for(int i = 0;i < palavra.length();i++){
            char atual = palavra.charAt(i);
            if(atual != anterior){
                sb.append(atual);
            }
            anterior = atual;
        }
        return sb.toString();
    }

}
