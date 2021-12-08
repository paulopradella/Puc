package praticas;

import java.util.Scanner;

public class TrianguloHeron {
	
	private double areaTrianguloHeron() {
		double a1, a2, a3, c, d;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o valor do primeiro lado: ");
		a1 = leitor.nextDouble();
		System.out.print("Informe o valor do segundo lado: ");
		a2 = leitor.nextDouble();
		System.out.print("Informe o valor do terceiro lado: ");
		a3 = leitor.nextDouble();
		
		 c = (a1 + a2 + a3) / 2;
		 
		 d = Math.sqrt(c * (c - a1) * (c - a2) * (c - a3));
		 
		return d;
	}
	void imprimirDados() {
		double d = areaTrianguloHeron();
		System.out.print("\n*************************************\n"
				+ "A área do Triângulo pela fórmula de Heron é de: " + d + " m2"
				+ "\n*************************************");
		
	
}

}