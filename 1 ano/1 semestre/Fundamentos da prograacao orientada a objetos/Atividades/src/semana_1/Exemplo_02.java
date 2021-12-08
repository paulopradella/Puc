package semana_1;

import java.util.Scanner;

public class Exemplo_02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x, y, z;
		
		System.out.print("Entre com o valor de x (inteiro): ");
		x = leitor.nextInt();
		
		System.out.print("Entre com o valor de y (inteiro): ");
		y = leitor.nextInt();
		
		z = x + y;
		
		System.out.println("Soma de x + y é: " + z + "\nFim");
		leitor.close();

	}

}
