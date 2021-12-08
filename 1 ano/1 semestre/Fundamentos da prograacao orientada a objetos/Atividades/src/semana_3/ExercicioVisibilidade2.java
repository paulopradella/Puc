package semana_3;

public class ExercicioVisibilidade2 {

	static void f() {
		System.out.println("Método f (sem modificador)");
		ExercicioVisibilidade.g();
		int x = ExercicioVisibilidade.k;
		System.out.println("Valor de x = " + x);
		ExercicioVisibilidade.k = 10;
		System.out.println("Valor de k = " + ExercicioVisibilidade.k);
	}
	
	public  static void main (String args[]) {
		f();
	} 
}