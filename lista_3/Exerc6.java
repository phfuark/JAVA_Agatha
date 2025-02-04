package lista_3;

import java.util.Scanner;
import java.util.Random;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSorteado = random.nextInt(100) + 1;
        int tentativa;
        int chances = 3;
        
        System.out.println("Tente acertar o número sorteado entre 1 e 100. Você tem 3 chances.");
        
        while (chances > 0) {
            System.out.print("Digite o seu palpite: ");
            tentativa = myScanner.nextInt();
            
            if (tentativa == numeroSorteado) {
                System.out.println("Você acertou!");
                break;
            } else {
                chances--;
                if (chances > 0) {
                    System.out.println("Você errou. Tente novamente. Chances restantes: " + chances);
                } else {
                    System.out.println("Você errou. O número sorteado era: " + numeroSorteado);
                }
            }
        }
        
        myScanner.close();
    }
}
