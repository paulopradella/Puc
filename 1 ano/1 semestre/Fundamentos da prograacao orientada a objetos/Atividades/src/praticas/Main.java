package calculadoraAreas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int operacao= 0;
		Calculadora c = new Calculadora();
		
		while(operacao != 8) {
			
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
						c.retangulo();
						break;
						
					case 2:
						c.triangulo();
						break;
						
					case 3:
						c.circulo();
						break;
						
					case 4:
						c.quadrado();
						break;
					
					case 5:
						c.elipse();
						break;
						
					case 6:
						c.trapezio();
						break;
						
					case 7:
						c.trianguloHeron();
						break;
						
					case 8:
						System.out.println("Volte Sempre.");
						
						break;
			
				}	
		}

		}
	}