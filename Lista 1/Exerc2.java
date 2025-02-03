import java.util.Scanner;

public class Exerc2 {
    public float tempConvert(float celsius) {
        return (celsius*9/5)+32;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Exerc2 converter = new Exerc2();
        System.out.print("Digite a Temperatura em Celsius: ");
        float celsius = myScanner.nextFloat();
        float resultado = converter.tempConvert(celsius);
        System.out.println("Temperatura em Fahrenheit: " + resultado);

        myScanner.close();
    }
}