package br.com.projetoA.aprenderJava.Encapsulamento.main;

import br.com.projetoA.aprenderJava.Encapsulamento.model.ContaEncapsulamento;

public class Program {
    public static void main(String[] args) {

        var c1 = new ContaEncapsulamento("Allyson","021");

//        c1.setNome("Allyson");
//        c1.setCpf("021214");
        c1.setSaldo(200.00);

        System.out.println(c1.getNome()+", seu saldo é: "+c1.getSaldo());
    }
}
