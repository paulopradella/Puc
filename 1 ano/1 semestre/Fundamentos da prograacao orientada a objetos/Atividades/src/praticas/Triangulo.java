package praticas;

import java.util.Scanner;

public class Triangulo {
	private double areaTriangulo() {
		double a, b, c;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o valor da base: ");
		a = leitor.nextDouble();
		System.out.print("Informe o valor da altura: ");
		b = leitor.nextDouble();
		
		 c = (a * b) / 2;
		 
		return c;
	}
	void imprimirDados() {
		double c = areaTriangulo();
		System.out.print("\n*************************************\n"
				+ "A área do Triângulo é de: " + c + " m2"
				+ "\n*************************************");
		
	
}

}