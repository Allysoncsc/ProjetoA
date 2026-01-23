package br.com.projetoA.aprenderJava.ArrayList;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainDois {


    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for(int i=0; i<=30 ;i++){listaNumeros.add(i);}

        System.out.println("Tamanho do array: "+listaNumeros.size());

        var listaPares = listaNumeros.stream()
                .filter(x-> x%2==0).collect(Collectors.toList());

        System.out.println("quantidade de pares: "+listaPares.size());


    }
}
