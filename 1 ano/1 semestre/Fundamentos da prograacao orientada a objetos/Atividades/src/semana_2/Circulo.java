package semana_2;

import java.util.Scanner;
import java.math.*;

public class Circulo {
	float raio;
	
	public Circulo (float raio) {
		this.raio = raio;
	}
	
	double calcularPerimetro() {
		return 2 * Math.PI * this.raio;
	}
	void imprimirDados() {
		System.out.println("Círculo: \n- Raio:      " + raio + "\n- Perímetro: " + calcularPerimetro());
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		float raio;
		System.out.println("Mundo dos Círculos\nEntre com o valor do raio:");
		raio = leitor.nextFloat();
		
		Circulo circ1 = new Circulo (raio);
		
		circ1.imprimirDados();
		System.out.println("--------------------------------");
	System.out.print("Entre com o valor do raio: ");
		raio = leitor.nextFloat();
		Circulo circ2 = new Circulo(raio);
		circ2.imprimirDados();

	}

}
