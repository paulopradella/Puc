package semana_3;

public class Carro {
		private String  marca;  // atributo oculto (encapsulamento / privado)
		
		public Carro(String marca) { // Método construtor
			this.marca = marca;
		}
	  	public void imprimir() { // Método que exibe o valor do atributo na tela
			System.out.println("Marca:  " + this.marca);
		}
		public static void main(String[] args) {
			Carro meuCarro = new Carro("Ford"); // instancia Carro
			meuCarro.imprimir();    // método público para exibir dados 
	                                     // privados / encapsulados de carro 
		}
	}

	