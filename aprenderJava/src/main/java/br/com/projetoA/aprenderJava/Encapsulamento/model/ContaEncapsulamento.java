package br.com.projetoA.aprenderJava.Encapsulamento.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Getter
public class ContaEncapsulamento {
    private String nome;
    private String cpf;
    private Double saldo;



    public  ContaEncapsulamento(){
        saldo = 0.0;
    }

    public  ContaEncapsulamento(String nome, String cpf){
        this();// chama o construtor vazio
        this.nome = nome;
        this.cpf = cpf;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){

        this.saldo = saldo;
    }

}
