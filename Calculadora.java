//Crie uma calculadora simples.
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o 1° número: ");
        int numero = input.nextInt();
        System.out.print("Digite o 2° número: ");
        int outroNumero = input.nextInt();
        System.out.println("Escolha qual opção você deseja: \n[1] Somar \n[2] Subtrair \n[3] Multiplicar \n[4] Dividir");
        int escolha = input.nextInt();
        if (escolha == 1){
            System.out.print("A Soma: : " + (numero + outroNumero));
        }
        else if (escolha == 2){
            System.out.print("A Subtração: " +  (numero - outroNumero));
        }
        else if (escolha == 3){
            System.out.print("A Multiplicação: " + numero * outroNumero);
        }
        else if (escolha == 4){
            System.out.print("A Divisão: " +  numero / outroNumero);
        }
        input.close();
    }
}
