package Controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("DIGITE UMA NOTA DE 0 A 10. ");
		double nota = Scanner.nextDouble();
		if(nota > 10 || nota  < 0) {
			System.out.println("Nota Invalida");
		}else if( nota >= 8.1 ) {
			System.out.println("Obrigado...");
		}else if( nota >= 6.1) {
			System.out.println("Achou o Atendimento Bom?? ");
			System.out.println("Vamos Melhorar Tenha Certeza Disso....Desculpe");
		}else if( nota >= 4.1) {		
			System.out.println("Achou nosso Atendimento Regular?? ");
		    System.out.println("Desculpe estamos melhorando..");
		}else if( nota >= 2.1) {
			System.out.println("Achou Nosso Atendimento Péssimo??.");
		    System.out.println("Desculpe estamos melhorando");	
		}else if (nota >= 0) {
			System.out.println("Horrivel??.");
		    System.out.println("Procure o Gerente..");	
			
		}
		
		
		
		
		Scanner.close();
		
	}
	
	

}
