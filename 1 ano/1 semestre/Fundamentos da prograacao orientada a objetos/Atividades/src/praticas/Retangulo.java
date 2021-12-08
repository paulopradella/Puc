package praticas;
import java.util.Scanner;

public class Retangulo {
	
	private double areaRetangulo() {
		double a, b, c;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o valor da base: ");
		a = leitor.nextDouble();
		System.out.print("Informe o valor da altura: ");
		b = leitor.nextDouble();
		
		 c = a * b;
		 
		return c;
	}
	void imprimirDados() {
		double c = areaRetangulo();
		System.out.print("\n*************************************\n"
				+ "A área do Retângulo é de: " + c + " m2"
				+ "\n*************************************");
		
	
}

}