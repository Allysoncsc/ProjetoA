package br.com.projetoA.aprenderJava.entity;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private int idade;
	private String CPF;
	
	private List <Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	
	public List<Disciplina> getDisiciplinas() {
		return disciplinas;
	}
	public void setDisiciplinas(List<Disciplina> disiciplinas) {
		this.disciplinas = disiciplinas;
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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
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
