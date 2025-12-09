package br.com.projetoA.aprenderJava.ArrayList;


import br.com.projetoA.aprenderJava.ArrayList.model.Produto;
import br.com.projetoA.aprenderJava.Enuns.CategoriaProduto;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = listaDeCompras();

        //listaProdutos.remove(2);
        System.out.println("Tamanho da lista: "+listaProdutos.size());
        for(Produto produto : listaProdutos){
            System.out.println("Você vai mesmo comprar: "+produto.getNome());
        }

        //System.out.println("-----------removendo com expressão lambda-----------");
        //listaProdutos.removeIf(x-> x.getCategoria() == "suplemento");
        listaProdutos.removeIf(x-> x.getCategoria() == CategoriaProduto.ELETRONICO);



        for(Produto produto : listaProdutos){
            System.out.println("Você vai mesmo comprar: "+produto.getNome());
        }

        System.out.println("-----------achar posição O Hobbit-----------");
        //System.out.println("Posição de O Hobbit: "+listaProdutos.indexOf());
        for (int i = 0; i < listaProdutos.size(); i++) {
            if(listaProdutos.get(i).getNome().equalsIgnoreCase("O Hobbit")){
                System.out.println("Posição de O Hobbit: "+i);
                break;
            }

        }
        System.out.println("-----------achar posição O Hobbit por stream-----------");
        int index = IntStream.range(0,listaProdutos.size())
                .filter(i-> listaProdutos.get(i).getNome().equalsIgnoreCase("o hobbit"))
                .findFirst()
                .orElse(-1);
        System.out.println("Indice: "+index);


        System.out.println("-----------Criar uma nova lista filtrando-----------");
        //ArrayList<Produto> listLivros = (ArrayList<Produto>) listaProdutos.stream().filter(x-> x.getCategoria().equalsIgnoreCase("livro")).collect(Collectors.toList());
        ArrayList<Produto> listLivros = (ArrayList<Produto>) listaProdutos.stream().filter(x-> x.getCategoria() == CategoriaProduto.LIVRO).collect(Collectors.toList());

        for(Produto produto : listLivros){
            System.out.println("Você vai mesmo comprar: "+produto.getNome());
        }
    }




    public static ArrayList<Produto> listaDeCompras(){
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto p1 = new Produto();
        p1.setNome("TV TCL C6K");
        p1.setCodprod(1);
        p1.setValue(3600.00);
        p1.setQtd(1);
        p1.setCategoria(CategoriaProduto.ELETRONICO);
        Produto p2 = new Produto();
        p2.setNome("WHey");
        p2.setCodprod(2);
        p2.setValue(150);
        p2.setQtd(1);
        p2.setCategoria(CategoriaProduto.valueOf("SUPLEMENTO"));

        Produto p3 = new Produto();
        p3.setNome("Senhor dos Anéis Edição de Colecionador");
        p3.setCodprod(3);
        p3.setValue(160);
        p3.setQtd(1);
        p3.setCategoria(CategoriaProduto.LIVRO);

        Produto p4 = new Produto();
        p4.setNome("O Hobbit");
        p4.setCodprod(4);
        p4.setValue(37);
        p4.setQtd(1);
        p4.setCategoria(CategoriaProduto.valueOf("LIVRO"));


        listaProdutos.add(p1);
        listaProdutos.add(p2);
        //colocar na posição dois
        listaProdutos.add(1,p3);
        listaProdutos.add(p4);
        return listaProdutos;
    }

}
