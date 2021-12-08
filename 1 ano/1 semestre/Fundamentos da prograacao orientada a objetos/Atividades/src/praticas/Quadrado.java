package praticas;

import java.util.Scanner;

public class Quadrado {
	private double areaQuadrado() {
		double a, c;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o valor da base: ");
		a = leitor.nextDouble();
		
		 c = a * a;
		 
		return c;
	}
	void imprimirDados() {
		double c = areaQuadrado();
		System.out.print("\n*************************************\n"
				+ "A área do Quadrado é de: " + c + " m2"
				+ "\n*************************************");
	
}

}