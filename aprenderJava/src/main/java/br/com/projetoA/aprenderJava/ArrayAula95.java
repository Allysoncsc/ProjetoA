package br.com.projetoA.aprenderJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayAula95 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("maria");
		list.add("bob");
		list.add("kell");
		list.add("all");
		list.add(2,"Marco");
		
		System.out.println(list.size());
		//remove bob
		list.remove("bob");
		//remove index 2
		list.remove(2);
		//remove todos que começam com M
		list.removeIf(x -> x.charAt(0) == 'M');
		//
		System.out.println("Index of all: " + list.indexOf("all"));
		for (String nomes : list) {
			System.out.println("nome: "+nomes);
		}
		
		
		System.out.println("--------------------");
		System.out.println("for só dos que começa com a");
		
		for (String nomes : list) {
			char n = nomes.charAt(0);
			if (n == 'a') {
				System.out.println("nome: "+nomes);
			}
			
		}
		
	}

}
