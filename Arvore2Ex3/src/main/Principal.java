package main;

import sp.fateczl.arvorechar.*;

public class Principal {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.insert('k');
        arvore.insert('d');
        arvore.insert('b');
        arvore.insert('c');
        arvore.insert('f');
        arvore.insert('m');
        arvore.insert('l');
        arvore.insert('t');
        arvore.insert('p');
        arvore.insert('r');
        arvore.insert('z');

        try {
            System.out.println("Árvore em pré-ordem:");
            arvore.prefixSearch();

            System.out.println("\nÁrvore em ordem:");
            arvore.infixSearch();

            System.out.println("\nÁrvore em pós-ordem:");
            arvore.postfixSearch();

            arvore.remove('m');
            System.out.println("\n\nÁrvore após remoção de 'm':");
            System.out.println("Árvore em pré-ordem:");
            arvore.prefixSearch();

            System.out.println("\nÁrvore em ordem:");
            arvore.infixSearch();

            System.out.println("\nÁrvore em pós-ordem:");
            arvore.postfixSearch();
            	
            System.out.println(" ");
            arvore.search('r');
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

