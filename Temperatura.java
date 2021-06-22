package Fundamentos;

public class Temperatura {
 
	public static void main(String[] args) {
		final double ocilacao2 = 5.0/9.0;
		double grausF =86;
		final double ocilacao = 32;
		double grausC = (grausF - ocilacao) * ocilacao2;
		System.out.println("O Resultado é : "+grausC);
		
		grausF = 150;
		grausC = (grausF - ocilacao) * ocilacao2;
		System.out.println("O Resultado é : "+grausC);
		
		 
	}
}
