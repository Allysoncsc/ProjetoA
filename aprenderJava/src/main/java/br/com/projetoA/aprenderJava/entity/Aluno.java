package br.com.projetoA.aprenderJava.entity;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private int idade;
	private String CPF;
	
	private List <Disciplina> disiciplinas = new ArrayList<Disciplina>();
	
	
	
	public List<Disciplina> getDisiciplinas() {
		return disiciplinas;
	}
	public void setDisiciplinas(List<Disciplina> disiciplinas) {
		this.disiciplinas = disiciplinas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	//teste melhorar
		public double getMedia(String nome) {
			double somaNotas = 0.0;
			
			for (Disciplina disciplina : disiciplinas) {
				if(disciplina.getNomeDisciplina() == nome) {
					somaNotas = disciplina.getNota1() + disciplina.getNota2() +
							disciplina.getNota3() + disciplina.getNota4();
					break;
				}
			}
			
			return somaNotas/4;
		}
		
		public String getAprovado(String nome) {
			double media = this.getMedia(nome);
			String resultado;
			if(media >= 60) {
				if(media >= 70) {
				resultado = "Aprovado com média "+media;
				}else {resultado = "Recuperação com média "+media;}
			}else {resultado = "Reprovado com média "+media;}
			return resultado;
		}
		
		public int removeDisciplina(String nome) {
			int index = 0;
			for (Disciplina disciplina : disiciplinas) {
				if(disciplina.getNomeDisciplina() == nome) {
					break;
				}
				index++;
			}
			
			return index;
			
		}
	
}
