package lista_3;

import java.util.Scanner;

public class Exerc2 {
    public double account(double uniValue, double qnt) {
        if (qnt<12){
            return uniValue*qnt;
        }else{
            uniValue = uniValue-(uniValue*0.10);
            return uniValue*qnt;
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Exerc2 converter = new Exerc2();
        System.out.print("Digite a Quantidade de Produto: ");
        double qnt = myScanner.nextDouble();
        System.out.print("Digite o Valor Unitário: ");
        double uniValue = myScanner.nextDouble();
        double resultado = converter.account(uniValue, qnt);
        System.out.println("Total: " + resultado);

        myScanner.close();
    }
}