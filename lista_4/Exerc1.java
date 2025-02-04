package lista_4;

import java.util.Scanner;

public class Exerc1{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();
            
            System.out.print("Digite sua data de nascimento (dd/mm/aaaa): ");
            String dataNascimento = scanner.nextLine();
            
            System.out.print("Digite sua pretensão salarial: ");
            String pretensaoSalarial = scanner.nextLine();
            
            System.out.print("Digite seu grau de instrução (Ensino Médio, Técnico ou Superior): ");
            String grauInstrucao = scanner.nextLine();
            
            System.out.print("Digite o cargo pretendido: ");
            String cargoPretendido = scanner.nextLine();
            
            System.out.print("Você possui CNH do tipo B? (sim ou não): ");
            String possuiCNH = scanner.nextLine();
            
            System.out.println("\nCadastro realizado com sucesso! Seus dados são:");
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Data de nascimento: " + dataNascimento);
            System.out.println("Pretensão salarial: " + pretensaoSalarial);
            System.out.println("Grau de instrução: " + grauInstrucao);
            System.out.println("Cargo pretendido: " + cargoPretendido);
            System.out.println("Possui CNH do tipo B: " + possuiCNH);
        }
    }
}
