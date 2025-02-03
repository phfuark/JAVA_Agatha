import java.util.Scanner;

public class Exerc6 {
    
    public void calcularDelta(float a, float b, float c) {
        
        float delta = b * b - 4 * a * c;
        
        
        System.out.println("Delta: " + delta);
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Exerc6 exercicio = new Exerc6();
        
        
        System.out.print("Digite o valor de a: ");
        float a = myScanner.nextFloat();
        
        System.out.print("Digite o valor de b: ");
        float b = myScanner.nextFloat();
        
        System.out.print("Digite o valor de c: ");
        float c = myScanner.nextFloat();
        
        
        exercicio.calcularDelta(a, b, c);

        
        myScanner.close();
    }
}
