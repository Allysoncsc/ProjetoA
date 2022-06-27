package br.com.projetoA.aprenderJava.entity;

public class Pessoa {

	protected String nome;
	protected String CPF;
	protected Double rendaAnual;
	
	
	
	
	
	
	public Pessoa(String nome, String cPF) {
		super();
		this.nome = nome;
		CPF = cPF;
	}
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, String cPF, Double rendaAnual) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.rendaAnual = rendaAnual;
	}
	public Double getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		Pessoa other = (Pessoa) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
	
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		
		return true;
	}
	
	
}
