package lista_2;

public class Exerc1 {
    public static void main(String[] args) {
        double valor1 = Math.pow(-3.0 / 4.0, -2);
        double valor2 = Math.pow(3, -1) / 4;
        double valor3 = Math.pow(-3.0 / 4.0, -1);
        
        double numerador = (3 * valor1) + (6 * valor2 - 4);
        double denominador = (7 * valor3) + 2;
        
        double resultadoFinal = Math.pow((numerador / denominador), -1) + 4;
        
        System.out.println(resultadoFinal);
    }
}
