import java.util.Scanner;

public class Exerc3 {
    public float imc(float weight, float height) {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Exerc3 converter = new Exerc3();
        System.out.print("Digite o Peso em kg: ");
        float weight = myScanner.nextFloat();
        System.out.print("Digite a Altura em m: ");
        float height = myScanner.nextFloat();
        float resultado = converter.imc(weight, height);
        System.out.println("IMC: " + resultado);

        myScanner.close();
    }
}