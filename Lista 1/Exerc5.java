import java.util.Scanner;

public class Exerc5 {
    public float account(float base, float height) {
        return (base*height)/2;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Exerc5 converter = new Exerc5();
        System.out.print("Digite a Base: ");
        float base = myScanner.nextFloat();
        System.out.print("Digite a Altura: ");
        float height = myScanner.nextFloat();
        float resultado = converter.account(base, height);
        System.out.println("Área: " + resultado);

        myScanner.close();
    }
}