package praticas;

import java.util.Scanner;
import java.math.*;

public class Elipse {

	private double areaElipse() {
		double a, b, c;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o valor do semi-eixo maior: ");
		a = leitor.nextDouble();
		System.out.print("Informe o valor do semi-eixo menor: ");
		b = leitor.nextDouble();
		
		 c = Math.PI * a * b;
		 
		return c;
	}
	void imprimirDados() {
		double c = areaElipse();
		System.out.print("\n*************************************\n"
				+ "A área da Elipse é de: " + c + " m2"
				+ "\n*************************************");
		
	
}

}