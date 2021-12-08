package praticas;

import java.util.Scanner;

public class Trapezio {
	
	private double areaTrapezio() {
		double a, a1,  b, c;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o valor da base maior: ");
		a = leitor.nextDouble();
		System.out.print("Informe o valor da base menor: ");
		a1 = leitor.nextDouble();
		System.out.print("Informe o valor da altura: ");
		b = leitor.nextDouble();
		
		 c = ((a + a1) / 2) * b;
		 
		return c;
	}
	void imprimirDados() {
		double c = areaTrapezio();
		System.out.print("\n*************************************\n"
				+ "A área do Trapézio é de: " + c + " m2"
				+ "\n*************************************");
		
	
}

}