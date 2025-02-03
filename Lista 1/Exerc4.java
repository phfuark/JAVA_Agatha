import java.util.Scanner;

public class Exerc4 {
    public float[] account(float value) {
        return new float[]{
            (value*value), 
            (value*value*value)
        };
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Exerc4 converter = new Exerc4();
        System.out.print("Digite o Número: ");
        float value = myScanner.nextFloat();
        float[] resultado = converter.account(value);
        System.out.println("Quadrado: " + resultado[0] + "\nCubo: " + resultado[1]);

        myScanner.close();
    }
}