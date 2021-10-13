package br.com.projetoA.aprenderJava;

import javax.swing.JOptionPane;

import br.com.projetoA.aprenderJava.entity.Aluno;
import br.com.projetoA.aprenderJava.entity.Disciplina;

public class Main {

	 public static void main(String[] args) {
		 
		 Aluno aluno1 = new Aluno();
	        
	        
	        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
	        aluno1.setNome(nome);
	        String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
	        aluno1.setIdade(Integer.valueOf(idade));
	        String cpf = JOptionPane.showInputDialog("Qual o cpf do aluno?");
	        aluno1.setCPF(cpf);
	        
	        /* String disciplina = JOptionPane.showInputDialog("Qual o nome da disciplina?");
	       aluno1.getDisiciplina().setNomeDisciplina(disciplina);
	        String nota1 = JOptionPane.showInputDialog("Qual a idade do aluno?");
	        aluno1.getDisiciplina().setNota1(Double.valueOf(nota1)); */  
	        // System.out.println("Disciplina : "+aluno1.getDisiciplina().getNomeDisciplina());
	        //System.out.println("Nta : "+aluno1.getDisiciplina().getNota1());
	        
	        Disciplina disciplina1 = new Disciplina();
	        String disciplina = JOptionPane.showInputDialog("Qual o nome da disciplina?");
	        disciplina1.setNomeDisciplina(disciplina);
	        String nota1 = JOptionPane.showInputDialog("Qual a nota 1 do aluno?");
		    disciplina1.setNota1(Double.valueOf(nota1)); 
		    String nota2 = JOptionPane.showInputDialog("Qual a nota 2 do aluno?");
		    disciplina1.setNota1(Double.valueOf(nota2)); 
		    String nota3 = JOptionPane.showInputDialog("Qual a nota 3 do aluno?");
		    disciplina1.setNota1(Double.valueOf(nota3)); 
		    String nota4 = JOptionPane.showInputDialog("Qual a nota 4 do aluno?");
		    disciplina1.setNota1(Double.valueOf(nota4)); 
	        
		    aluno1.getDisiciplinas().add(disciplina1);
		    
	        System.out.println("Nome : "+aluno1.getNome());
	        double media = aluno1.getMedia(disciplina);
	        System.out.println("Media: "+media);
	        
	        int r =  aluno1.removeDisciplina(disciplina1.getNomeDisciplina());
		       aluno1.getDisiciplinas().remove(r);
		 
	 }
}
