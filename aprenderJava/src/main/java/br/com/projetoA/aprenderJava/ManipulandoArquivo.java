package br.com.projetoA.aprenderJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.projetoA.aprenderJava.entity.Pessoa;

public class ManipulandoArquivo {
	
	public static void main (String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Allyson Correia");
		pessoa1.setIdade(30);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("MK");
		pessoa2.setIdade(29);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("ML");
		pessoa3.setIdade(74);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		
		File arquivo = new File("C:\\Users\\Allyson\\git\\repository3\\aprenderJava\\teste.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escreverNoArquivo = new FileWriter(arquivo);
		
		//escreverNoArquivo.write("Eu sou Ceará");
		
		for(Pessoa p : pessoas) {
			escreverNoArquivo.write(p.getNome() + "  ;  "+ p.getIdade() + "\n");
			System.out.println("teste");
		}
		
		
		escreverNoArquivo.flush();
		escreverNoArquivo.close();
		
	}
}
