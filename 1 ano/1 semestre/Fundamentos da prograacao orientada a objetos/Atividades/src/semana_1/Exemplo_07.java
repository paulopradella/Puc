package semana_1;

public class Exemplo_07 {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i+=3) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i + " ");
		}
		System.out.println("Fim 1\n");
		
		for (int j = 1; j <+ 20; j +=3) {
			if (j % 5 ==0)
				break;
			System.out.println(j  + " ");
		}
		
		System.out.println("Fim 2");
	}
	
	
}
