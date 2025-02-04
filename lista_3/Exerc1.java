package lista_3;

import java.util.Scanner;

public class Exerc1 {
    
    public void classificarIdade(int idade) {
        if (idade >= 0 && idade <= 14) {
            System.out.println("Classificação: Criança");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("Classificação: Adolescente");
        } else if (idade >= 18 && idade <= 30) {
            System.out.println("Classificação: Adulto jovem");
        } else {
            System.out.println("Classificação: Adulto");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exerc1 classificacao = new Exerc1();
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        
        classificacao.classificarIdade(idade);
        
        scanner.close();
    }
}