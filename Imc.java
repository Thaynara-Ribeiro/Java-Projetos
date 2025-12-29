import java.util.Scanner;
public class Imc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu Peso: ");
        double peso = input.nextDouble();
        System.out.print("Digite sua Altura: ");
        double altura = input.nextDouble();
        double IMC = peso/(altura*altura);
        System.out.println("Seu IMC: " + IMC);
//      Foi organizado o else if de forma crescente para eliminar qualquer lacuna de intervalo.
        if (IMC < 18.5) {
            System.out.println("BAIXO PESO");
        }
        else if (IMC < 25) {
            System.out.println("PESO NORMAL");
        }
        else if (IMC < 30){
            System.out.println("SOBREPESO");
        }
        else if (IMC < 35){
            System.out.println("OBESIDADE 1° GRAU");
        }
        else if (IMC < 40){
            System.out.println("OBESIDADE 2° GRAU");
        }
        else {
            System.out.println("OBESIDADE 3° GRAU (MÓRBIDA)");
        }
        input.close();
    }
}



