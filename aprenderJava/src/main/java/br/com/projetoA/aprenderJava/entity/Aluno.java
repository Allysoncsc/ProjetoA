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
	public double getMedia() {
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disiciplinas) {
			somaNotas += disciplina.getNota1();
		}
		
		return somaNotas/disiciplinas.size();
	}
	
}
