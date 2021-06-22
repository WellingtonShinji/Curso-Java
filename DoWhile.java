package Controle;

import java.util.Scanner;

public class DoWhile {
      public static void main(String[] args) {
		
    	 Scanner entrada = new Scanner(System.in);
    	 
    	 String texto = "";
    	 
		do {	System.out.println("VOCÊ PRECISA FALAR AS PALAVRAS MAGICAS...  ");
		System.out.println("QUER SAIR?? ");
		texto = entrada.nextLine();
		
		}while(!texto.equalsIgnoreCase("POR FAVOR"));
		
		System.out.println("CORRETO");
			
		
		
		entrada.close();
    	  
	}

}