import java.util.Scanner;

public class Exerc3 {
    public String result(int a, int b) {
        if (a>b){
            return "Time A venceu";
        }else if(b>a){
            return "Time B venceu";
        }else{
            return "Empatou!";
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Exerc3 converter = new Exerc3();
        System.out.print("Placar A: ");
        int a = myScanner.nextInt();
        System.out.print("Placar B: ");
        int b = myScanner.nextInt();
        String resultado = converter.result(a, b);
        System.out.println(resultado);

        myScanner.close();
    }   
}
