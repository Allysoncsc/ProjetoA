package br.com.projetoA.aprenderJava.entity;

public class PFisica extends Pessoa {

	protected Double gastosSaude;

	
	
	
	public PFisica(String nome, String cPF, Double rendaAnual, Double gastosSaude) {
		super(nome, cPF, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	
}
