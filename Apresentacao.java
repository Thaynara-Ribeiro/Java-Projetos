//Escreva um programa que solicite ao usuario seu nome, idade e a sua cidade natal
import java.util.Scanner;
public class Apresentacao {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Qual sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite qual sua cidade natal: ");
        String cidade = sc.nextLine();
        System.out.println("\n--- Dados Coletados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cidade Natal: " + cidade);
        sc.close();
    }
}
