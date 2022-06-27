package br.com.projetoA.aprenderJava;

public class Exe152 {
	//exerc aula 152 udemy
	//ler dadados de n contribuintes, e mostrar valor pago de imposto
	//se PFisica -> imposto = (renda <= 20000) ? renda* 15% : renda *25%
	// se PFisica teve gastos com saúde 50% é abatido no imposto
	// se PJuridica -> imposto = (funcionario <= 14) ? renda* 16% : renda *14%
	public static void main(String[] args) {
		int idade = 18;
		
		
		String demaior = (idade >=18) ? "De maior" : "De menor";
		
		System.out.println("resuldato: "+ demaior);
	}

}
