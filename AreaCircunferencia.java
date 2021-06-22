package Fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		int raio = 3;
		final double pi = 3.14;  // "final" define a constante..
		double area = pi * raio * raio;
		raio = 10; // nao precisa colocar o tipo da variavel
		area = pi * raio * raio;
		System.out.println("raio é igual á : " + area+ "m2");
	}
}
