package br.com.projetoA.aprenderJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulandoArquivo {
	
	public static void main (String[] args) throws IOException {
		
		File arquivo = new File("C:\\Users\\Allyson\\Documents\\teste.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escreverNoArquivo = new FileWriter(arquivo);
		
		escreverNoArquivo.write("Eu sou Ceará");
		escreverNoArquivo.flush();
		escreverNoArquivo.close();
		
	}
}
