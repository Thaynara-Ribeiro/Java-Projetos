import java.util.Scanner;
public class Calculos {
    public static void main(String[] args) {

//	Escreva um programa que imprime a soma, subtração, multiplicação, divisão e resto de dois números.

//	int numero = 10;
//	int outroNumero = 5;
//	int soma = numero + outroNumero;
//	int sub = numero - outroNumero;
//	int mult = numero * outroNumero;
//	int div = numero / outroNumero;
//	double resto = numero % outroNumero;
//	System.out.println("A Soma: " + soma);
//	System.out.println("A Subtração: " + sub);
//	System.out.println("A Multiplicação: " + mult);
//	System.out.println("A Divisão: " + div);
//	System.out.println("O Resto da Divisão:  " + resto);


//	Escreva um programa que calcule o resto da divisão e o calculo de um número sobre outro número.

//	int numero = 10;
//	int outroNumero = 5;
//	double resto = numero % outroNumero;
//	double potencia = Math.pow(numero, outroNumero);
//	System.out.println("O Resto da Divisão: " + resto);
//	System.out.println("A Potência: " + potencia);


// Escreva um programa que calcule a media de três números

                Scanner sc = new Scanner(System.in);
                System.out.print("Digite o primeiro valor: ");
                double primeiroNumero = sc.nextDouble();
                System.out.print("Digite o segundo valor: ");
                double segundoNumero = sc.nextDouble();
                System.out.print("Digite o terceiro valor: ");
                double terceiroNumero = sc.nextDouble();
                double media = (primeiroNumero + segundoNumero + terceiroNumero) / 3;
                media = Math.round(media);
                System.out.print("A media: " + media);
                sc.close();
            }
        }