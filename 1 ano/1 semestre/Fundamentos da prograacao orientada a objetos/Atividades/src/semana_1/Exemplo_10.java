package semana_1;

public class Exemplo_10 {

	public static void main(String[] args) {
		final int LIN = 3;
			final int COL=4;
			
		int [][] mat = new int [LIN][COL];
		int valor;
		
		for(int i = 0; i < LIN; i++) {
			for(int j = 0; j < COL; j++) {
				valor = i + j;
				mat[i][j] = valor;
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
