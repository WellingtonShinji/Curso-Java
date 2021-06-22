package Fundamentos;

public class DesafioLogico {
	public static void main(String[] args) {
		
		boolean bico1 = true;
		boolean bico2 = false;
		boolean tv50 = bico1 && bico2;
		boolean tv32 = bico1 ^ bico2;
		boolean sorvete = bico1 || bico2;
		
		
		System.out.println("juntou a grana para a tv de 50\"? "+ tv50 );
		System.out.println("Só deu para comprar a tv de 32\"!! " + tv32);
		System.out.println("Rolou um sorvete?? " + sorvete );
		
		
	}
	
	

}
