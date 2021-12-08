package semana_2;
 import java.util.Scanner;
 
public class Cambio {
	static double cotacaoDolar = 0;
	
	double converterDolar (double valorReal) {
		return valorReal / cotacaoDolar;
	}
	
	double converterReal ( double valorReal) {
		return valorReal * cotacaoDolar;
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valorDolar, valorReal;
		int operacao;
		System.out.println("Informe a operação que deseja realizar:\n1 - Dólares para reais\n2 - Reais para dólares ");
		
		Cambio moeda = new Cambio();
		
		operacao = leitor.nextInt();
		
		switch(operacao) {
		
		case 1:
			System.out.println("Você escolheu converter dólares para reias.\nInforme o valor atual do dólar: ");
			cotacaoDolar = leitor.nextDouble();
			System.out.println("Agora informe o valor que deseja converter para reais: ");
			valorReal = leitor.nextDouble();
			System.out.println("U$ " + valorReal + " equivale a R$: " + moeda.converterReal(valorReal));
			break;
			
		case 2:
			System.out.println("Você escolheu converter reais para dólares.\nInforme o valor atual do dólar: ");
			cotacaoDolar = leitor.nextDouble();
			System.out.println("Agora informe o valor que deseja converter para dólar: ");
			valorReal = leitor.nextDouble();
			System.out.println(cotacaoDolar + " equivale a R$: " + moeda.converterDolar(valorReal));
			break;
			
		default:
			break;
			
		}
		
	}

}
