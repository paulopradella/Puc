package praticas;
import java.util.Scanner;

public class CalculadoraAreas {

	public static void main(String[] args) {
		
			int operacao;
		
			Scanner leitor = new Scanner(System.in);
			System.out.print("*************************************\n"
					+ "Seja bem vindo a calculadora de áreas\n"
					+ "*************************************\n"
					+ "Selecione a forma desejada:\n"
					+ "1- Retângulo\t\t 2 - Triângulo\n"
					+ "3 - Círculo\t\t 4 - Quadrado\n"
					+ "5 - Elipse\t\t 6 - Trapézio\n"
					+ "7 - Triângulo (Heron)\t 8 - Sair\n");

			switch (operacao = leitor.nextInt()) {
			
				case 1:
					Retangulo retg;
					retg = new Retangulo();
					retg.imprimirDados();
					break;
					
				case 2:
					Triangulo tri;
					tri = new Triangulo();
					tri.imprimirDados();
					break;
					
				case 3:
					Circulo cir;
					cir = new Circulo();
					cir.imprimirDados();
					break;
					
				case 4:
					Quadrado qua;
					qua = new Quadrado();
					qua.imprimirDados();
					break;
				
				case 5:
					Elipse eli;
					eli = new Elipse();
					eli.imprimirDados();
					break;
					
				case 6:
					Trapezio tra;
					tra = new Trapezio();
					tra.imprimirDados();
					break;
					
				case 7:
					TrianguloHeron trih;
					trih = new TrianguloHeron();
					trih.imprimirDados();
					break;
					
				case 8:
					System.out.println("Volte Sempre.");
					break;
		
			}	
	}

	}

