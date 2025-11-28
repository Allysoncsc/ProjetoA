package br.com.projetoA.aprenderJava.ArrayList.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    private String nome;
    private int codprod;
    private int qtd;
    private double value;
    private String categoria;
}
