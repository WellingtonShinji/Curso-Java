package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner visor = new Scanner (System.in);
		String valor = "";
		
		while (! valor.equalsIgnoreCase("12345")) {
			
			System.out.print("digite a senha: ");
			valor = visor.nextLine();	
		
		}
				
		visor.close();
		
	}

}
