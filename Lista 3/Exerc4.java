import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Onde você pretende passar suas férias?");
        System.out.println("1 – Maceió");
        System.out.println("2 – Porto de Galinhas");
        int destino = myScanner.nextInt();
        
        System.out.println("Você deseja o valor com almoço/janta incluso?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int incluso = myScanner.nextInt();
        
        double valorBase = 3000.00;
        double valorFinal = valorBase;
        
        if (destino == 1) {
            if (incluso == 1) {
                valorFinal += valorBase; 
            } else if (incluso == 2) {
                valorFinal += valorBase * 0.85; 
            }
        } else if (destino == 2) {
            if (incluso == 1) {
                valorFinal += valorBase * 0.60; 
            } else if (incluso == 2) {
                valorFinal += valorBase * 0.45; 
            }
        }
        
        System.out.printf("O valor final da sua viagem será: R$ %.2f%n", valorFinal);
        
        myScanner.close();
    }
}
