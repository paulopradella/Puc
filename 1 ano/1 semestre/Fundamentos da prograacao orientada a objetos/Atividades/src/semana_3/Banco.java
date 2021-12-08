package semana_3;

public class Banco {

	public static void main(String[] args) {
		Conta cta1 = new Conta ();
		Conta cta2 = new Conta ();
		
		cta1.setDono("Maria");
		cta1.setSaldo(150.30);
		
		cta2.setDono("Maria");
		cta2.setSaldo(128.57);
		
		System.out.println("Cta1 - Correntista: " + cta1.getDono());
		System.out.println("Cta1 - Saldo: " + cta1.getSaldo());
		
		System.out.println("Cta2 - Correntista: " + cta2.getDono());
		System.out.println("Cta2 - Saldo: " + cta2.getSaldo());

	}

}
