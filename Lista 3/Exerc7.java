import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Você quer responder a pergunta 1 ou 2?");
        int perguntaEscolhida = myScanner.nextInt();
        myScanner.nextLine();  
        
        if (perguntaEscolhida == 1) {
            System.out.println("Pergunta 1: Qual a capital do Brasil?");
            System.out.println("a) Rio de Janeiro");
            System.out.println("b) São Paulo");
            System.out.println("c) Brasília");
            String resposta = myScanner.nextLine().toLowerCase();
            
            if (resposta.equals("c")) {
                System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners");
            } else {
                System.out.println("Você não acertou, mas tente novamente numa próxima");
            }
        } else if (perguntaEscolhida == 2) {
            System.out.println("Pergunta 2: Quem descobriu o Brasil?");
            System.out.println("a) Pedro Álvares Cabral");
            System.out.println("b) Cristóvão Colombo");
            System.out.println("c) Vasco da Gama");
            String resposta = myScanner.nextLine().toLowerCase();
            
            if (resposta.equals("a")) {
                System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners");
            } else {
                System.out.println("Você não acertou, mas tente novamente numa próxima");
            }
        } else {
            System.out.println("Opção inválida.");
        }
        
        myScanner.close();
    }
}
