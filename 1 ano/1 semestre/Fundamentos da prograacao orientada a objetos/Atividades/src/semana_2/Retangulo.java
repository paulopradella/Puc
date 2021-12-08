package semana_2;
import java.util.Scanner;

public class Retangulo {

	double altura;
	float largura;
	
	double calcularPerimetro() {
		double perimetro;
		perimetro = 2 * altura + 2 * largura;
		return perimetro;
	}
	void imprimirDados () {
		double perimetro;
		perimetro = calcularPerimetro();
		
		System.out.println("Retângulo: \n- altura:    " + altura + "\n- Largura:   " + largura + "\n- Perimetro: " + perimetro);	
	}
	public static void main(String[] args) {
		Retangulo retg;
		
		retg = new Retangulo();
		
		Scanner altura = new Scanner(System.in);
		System.out.print("Informe a altura: ");
		retg.altura = altura.nextFloat();
		
		Scanner largura = new Scanner(System.in);
		System.out.print("informe a largura: ");
		
		retg.largura = largura.nextFloat();
		
		retg.imprimirDados();
		

	}

}
