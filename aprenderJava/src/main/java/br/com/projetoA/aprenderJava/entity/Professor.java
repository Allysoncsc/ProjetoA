package br.com.projetoA.aprenderJava.entity;

public class Professor extends Pessoa {
	
	private String id;
	private Disciplina disciplina;
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
}
