package br.com.projetoA.aprenderJava.entity;

public class PJuridica extends Pessoa{

	protected int funcionarios;

	
	
	
	
	public PJuridica(String nome, String cPF, Double rendaAnual, int funcionarios) {
		super(nome, cPF, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	
	
}
