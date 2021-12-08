package praticas;

import java.util.Scanner;

import java.math.*;

public class Circulo {
	private double areaCirculo() {
		double a, c;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o valor o raio: ");
		a = leitor.nextDouble();
		c = Math.PI * Math.pow(a, 2);
		 
		return c;
	}
	void imprimirDados() {
		double c = areaCirculo();
		System.out.print("\n*************************************\n"
				+ "A área do Círculo é de: " + c + " m2"
				+ "\n*************************************");
		
	
}

}