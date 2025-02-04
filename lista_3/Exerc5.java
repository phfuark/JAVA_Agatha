package lista_3;

import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Quantidade atual em estoque: ");
        int estoqueAtual = myScanner.nextInt();
        
        System.out.print("Quantidade máxima em estoque: ");
        int estoqueMaximo = myScanner.nextInt();
        
        System.out.print("Quantidade mínima em estoque: ");
        int estoqueMinimo = myScanner.nextInt();
        
        int quantidadeMedia = (estoqueMaximo + estoqueMinimo) / 2;
        
        if (estoqueAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
        
        myScanner.close();
    }
}
