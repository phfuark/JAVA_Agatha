package lista_1;

import java.util.Scanner;

public class Exerc1 {
    public float tempConvert(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Exerc1 converter = new Exerc1();
        System.out.print("Digite a Temperatura em Fahrenheit: ");
        float fahrenheit = myScanner.nextFloat();
        float resultado = converter.tempConvert(fahrenheit);
        System.out.println("Temperatura em Celsius: " + resultado);

        myScanner.close();
    }
}