package calculadoraAreas;
import java.util.Scanner;

public class Calculadora implements Controlador {
	
	private double a, b, c, d;
	Scanner leitor = new Scanner(System.in);
	
	public Calculadora() {
	}
		
	private double getA() {
		System.out.print("Informe o valor: ");
		a = leitor.nextDouble();
		return a;
	}
	private void setA(double a) {
		this.a = a;
	}
	private double getB() {
		System.out.print("Informe o valor: ");
		b = leitor.nextDouble();
		return b;
	}
	private void setB(double b) {
		this.b = b;
	}
	private double getC() {
		return c;
	}
	private void setC(double c) {
		this.c = c;
	}
	private double getD() {
		System.out.print("Informe o valor: ");
		d = leitor.nextDouble();
		return d;
	}
	private void setD(double d) {
		this.d = d;
	}
	
	@Override
	public void circulo() {
		this.getA();
		c = Math.PI * Math.pow(a, 2);
		System.out.print("\n*************************************\n"
				+ "A área do Círculo é de: " + c + " m2"
				+ "\n*************************************\n");
		}

	@Override
	public void elipse() {
			this.getA();
			this.getB();
			c = Math.PI * a * b;
			System.out.print("\n*************************************\n"
					+ "A área da Elipse é de: " + c + " m2"
					+ "\n*************************************\n");	
	}

	@Override
	public void retangulo() {
			this.getA();
			this.getB();
			c = a * b;
			System.out.print("\n*************************************\n"
					+ "A área do Retângulo é de: " + c + " m2"
					+ "\n*************************************\n");	
	}

	@Override
	public void triangulo() {
			this.getA();
			this.getB();
			c = (a * b) / 2;
			System.out.print("\n*************************************\n"
					+ "A área do Triângulo é de: " + c + " m2"
					+ "\n*************************************\n");	
	}

	@Override
	public void quadrado() {
			this.getA();
			c = a * a;
			System.out.print("\n*************************************\n"
					+ "A área do Quadrado é de: " + c + " m2"
					+ "\n*************************************\n");
	}

	@Override
	public void trapezio() {
		
		this.getA();
		this.getB();
		this.getD();
		c = ((a + d) / 2) * b;
		System.out.print("\n*************************************\n"
				+ "A área do Trapézio é de: " + c + " m2"
				+ "\n*************************************\n");	
	}

	@Override
	public void trianguloHeron() {
		this.getA();
		this.getB();
		this.getD();
			 c = (a + b + d) / 2;
			 c = Math.sqrt(c * (c - a) * (c - b) * (c - d));
			System.out.print("\n*************************************\n"
					+ "A área do Triângulo pela fórmula de Heron é de: " + c + " m2"
					+ "\n*************************************\n");
			
		
	
	}

}
