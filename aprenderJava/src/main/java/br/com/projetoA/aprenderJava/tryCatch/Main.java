package br.com.projetoA.aprenderJava.tryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //tryArrayIndexOut();
        tryReadFile();

    }

    public static void tryReadFile(){
        File file = new File("C:\\Users\\ALLYSON.C\\Documents\\PROJETOS\\2 - atalhos\\ATIVIDADE.txt");


        try(Scanner sc = new Scanner(file)){

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

        }catch (FileNotFoundException e ){
            System.out.println("Error opening file: "+ e.getMessage());
        }
    }

    public static void tryArrayIndexOut(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite uma frase: ");
            String[] vect = sc.nextLine().split(" ");
            System.out.println("Digite uma posição do array: ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position.");
            e.printStackTrace();
            sc.next();
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }finally {
            System.out.println("End of program.");
            sc.close();
        }
    }

}
