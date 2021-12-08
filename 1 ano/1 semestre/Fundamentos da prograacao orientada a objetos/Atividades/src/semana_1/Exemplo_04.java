package semana_1;
import java.util.Scanner;

public class Exemplo_04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escolha uma opcão entre 1 e 3:");
		
		int escolha;
		
		escolha = leitor.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println("Você escolheu a opção 1.");
			break;
		case 2:
			System.out.println("Você escolheu a opção 2.");
			break;
		case 3:
			System.out.println("Você escolheu a opção 3.");
			break;
		default:
			System.out.println("Operação inválida.");
			break;
		}
		
		

	}

}
