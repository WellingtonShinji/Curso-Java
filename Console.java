package Fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		 
		System.out.print("BOM ");
		System.out.print("DIA ");
		System.out.println("BOM");
		System.out.println("DIA");
		System.out.printf("Megasena: %d , %d , %d , %d", 1 , 2 , 3, 4);
		Scanner entrada = new Scanner (System.in);
		System.out.println("\nQual é seu nome?");
		String nome = entrada.nextLine();
		System.out.println("\nDigite seu sobrenome Sr " + nome);
		String sobrenome = entrada.nextLine();
		System.out.print("\nSeu nome completo é:"+ nome +" "+ sobrenome);
		entrada.close();
				
		
		
	}

}
