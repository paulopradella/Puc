//Com alterações efetuadas por mim para exercitar.
package semana_2;
import java.util.Scanner;

public class Calculadora {
	
	static double somar ( double a, double b) {
		return a + b;
	}
	static double subtrair ( double a, double b) {
		return a - b;
	}
	static double multiplicar ( double a, double b) {
		return a * b;
	}
	static double dividir ( double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {
		double z;
		int operacao;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o valor de X: ");
		double x = leitor.nextDouble();
		
		System.out.print("Informe o valor de Y: ");
		double y = leitor.nextDouble();
		
		System.out.print("Selecione a operação desejada:\n1- Soma\n2 - subtração\n3 - Multiplicação\n4 - Divisão\n");

		switch (operacao = leitor.nextInt()) {
		
		case 1:
			z = Calculadora.somar(x, y);
			System.out.println("A soma de: " + x + " + " + y + " é: " + z);
			break;
			
		case 2:
			z = Calculadora.subtrair(x, y);
			System.out.println("A subtração de: " + x + " - " + y + " é: " + z);
			break;
			
		case 3:
			z = Calculadora.multiplicar(x, y);
			System.out.println("A multiplicação de: " + x + " * " + y + " é: " + z);
			break;
			
		case 4:
			z = Calculadora.dividir(x, y);
			System.out.println("A divisão de: " + x + " / " + y + " é: " + z);
			break;
			
		default:
			System.out.println("Operação inválida.");
			break;
		}
		
		
		
	}

}
