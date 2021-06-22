package Fundamentos;

public class Relacionais {

	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(3 >= 8);
		System.out.println(8 <= 4);
		//System.out.println(10 != 10);
		
		double nota = 7.0;
		boolean bomComportamento = true;
		boolean possouPorMedia = nota >= 7.0;
		boolean desconto = bomComportamento && possouPorMedia;
		System.out.println("Direito a desconto: " + desconto);
		
				
		
		
	}
}
