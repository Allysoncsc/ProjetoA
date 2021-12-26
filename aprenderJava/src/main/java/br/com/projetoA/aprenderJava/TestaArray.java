package br.com.projetoA.aprenderJava;

public class TestaArray {

	public static void main(String[] args) {

		int notas[][] = new int[2][4];
		
		String texto = "Allyson, curso java, 80, 80, 90";
		
		//quebrar o array nas virgulas
		String[] valoresArray = texto.split(",");
		
		notas[0][0]=70;
		notas[0][1]=80;
		notas[0][2]=90;
		notas[0][3]=100;

		notas[1][0]=100;
		notas[1][1]=90;
		notas[1][2]=80;
		notas[1][3]=70;
		

		
		
		for (int i = 0; i < notas.length; i++) {
			
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Nota: "+notas[i][j]);
			}
			System.out.println("-----------------");
		}
		
	}

}
