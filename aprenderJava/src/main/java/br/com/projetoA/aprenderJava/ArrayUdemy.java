package br.com.projetoA.aprenderJava;

import java.util.Scanner;

public class ArrayUdemy {

	public static void main(String[] args) {
		
		String [] quartos = new String [10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos clientes vai cadastrar? ");
		int q = sc.nextInt();
		
		for (int i = 0; i < q; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do cliente: ");
			String nome = sc.nextLine();
			System.out.println("Digite o numero do quarto: ");
			int quarto = sc.nextInt();
			
			quartos[quarto] = nome;
		}
		
		
		System.out.println("Saiu do for!");
		
		for (int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
			System.out.println("cliente: "+quartos[i]+" quarto: " + i);
			
		}
			
		
	}
		/* for each percorre o array
		for (String quarto : quartos) {
			System.out.println(quarto);
		}*/
	}
}
