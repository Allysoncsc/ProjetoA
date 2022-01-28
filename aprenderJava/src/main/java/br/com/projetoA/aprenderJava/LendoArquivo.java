package br.com.projetoA.aprenderJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LendoArquivo {

	public static void main(String[] args) throws FileNotFoundException {


		FileInputStream arquivo = new FileInputStream(new File("C:\\Users\\Allyson\\git\\repository3\\aprenderJava\\teste.txt"));

		Scanner lerArquivo = new Scanner(arquivo, "UTF-8");
		
		while(lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			
			if(linha !=null && !linha.isEmpty()) {
				System.out.println(linha);
			}
		}
	}

}
