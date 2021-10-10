package br.com.projetoA.aprenderJava;

import javax.swing.JOptionPane;

import br.com.projetoA.aprenderJava.entity.Aluno;

public class Main {

	 public static void main(String[] args) {
		 
		 Aluno aluno1 = new Aluno();
	        
	        
	        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
	        aluno1.setNome(nome);
	        String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
	        aluno1.setIdade(Integer.valueOf(idade));
	        String cpf = JOptionPane.showInputDialog("Qual o cpf do aluno?");
	        aluno1.setCPF(cpf);
	        
	        System.out.println("Nome : "+aluno1.getNome());
		 
	 }
}
