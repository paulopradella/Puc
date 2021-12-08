package semana_3;

class ExercicioVisibilidade {
 
		static int k; // valor default = zero
		

		static void g() {
			System.out.println("------------------");
			System.out.println("... Método A.g (sem modificador)");
			System.out.println("... Valor de A.k = " + k);
			System.out.println("------------------");
		}
	}