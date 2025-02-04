package lista_4;

import java.util.Scanner;

public class Exer2{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o 1 número: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Digite o 2 número: ");
            int num2 = scanner.nextInt();
            
            System.out.println("\nSeus dados são:");
            System.out.println("Soma: " + (num1 + num2));
            System.out.println("Subtração: " + (num1 - num2));
            System.out.println("Multiplicação: " + (num1 * num2));
            System.out.println("Divisão: " + (num1 / num2));
            System.out.println("Número 1 elevado ao número 2: " + Math.pow(num1, num2));
            System.out.println("Resto da Divisão: " + (num1 % num2));
        }
    }
}
