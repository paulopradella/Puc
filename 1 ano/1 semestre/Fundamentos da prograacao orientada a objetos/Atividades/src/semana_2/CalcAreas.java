package semana_2;
import java.util.Scanner;

public class CalcAreas {
	
	static double retangulo ( double l, double a) {
		return l * a;
	}
	static double triangulo ( double b, double h) {
		return (b * h) / 2;
	}
	static double circulo ( double r) {
		return 3.14 * (r * r);
	}
	static double quadrado ( double la) {
		return la * la ;
	}

	public static void main(String[] args) {
		double z;
		int operacao;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Selecione a operação desejada:\n1- Retângulo\n2 - Triângulo\n3 - Círculo\n4 - Quadrado\n");

		switch (operacao = leitor.nextInt()) {
		
		case 1:
			System.out.print("Informe o valor da base: ");
			double l = leitor.nextDouble();
			System.out.print("Informe o valor da altura: ");
			double a = leitor.nextDouble();
			z = CalcAreas.retangulo(l, a);
			System.out.println("A área do retângulo é de: " + z + "m2");
			break;
			
		case 2:
			System.out.print("Informe o valor da base: ");
			double b = leitor.nextDouble();
			System.out.print("Informe o valor da altura: ");
			double h = leitor.nextDouble();
			z = CalcAreas.triangulo(b, h);
			System.out.println("A área do triângulo é de: " + z + "m2");
			break;
			
		case 3:
			System.out.print("Informe o valor do raio: ");
			double r = leitor.nextDouble();
			z = CalcAreas.circulo(r);
			System.out.println("A área do círculo é de: " + z + "m2");
			break;
			
		case 4:
			System.out.print("Informe o valor do lado: ");
			double la = leitor.nextDouble();
			z = CalcAreas.quadrado(la);
			System.out.println("A área do quadrado é de: " + z + "m2");
			break;
			
		default:
			System.out.println("Operação inválida.");
			break;
		}
		
		
		
	}

}
