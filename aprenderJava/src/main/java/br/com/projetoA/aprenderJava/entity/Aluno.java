package br.com.projetoA.aprenderJava.entity;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

	
	private String dataMatricula;
	private String curso;
	
	private List <Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	
	public List<Disciplina> getDisiciplinas() {
		return disciplinas;
	}
	public void setDisiciplinas(List<Disciplina> disiciplinas) {
		this.disciplinas = disiciplinas;
	}
	
	
	
	
	
		
		public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
		//teste melhorar
		public double getMedia(String nome) {
			double somaNotas = 0.0;
			
			for (Disciplina disciplina : disciplinas) {
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
			/*int index = 0;
			for (Disciplina disciplina : disciplinas) {
				if(disciplina.getNomeDisciplina().equalsIgnoreCase(nome)) {
					break;
				}
				index++;
			}return index;
			*/
			int index = -1;
			for(int i = 0; i < disciplinas.size();i++) {
				Disciplina d = disciplinas.get(i);
				if(d.getNomeDisciplina().equalsIgnoreCase(nome)) {
					index = i;
					break;
				}
			}
			
			return index;
		}
	
}
