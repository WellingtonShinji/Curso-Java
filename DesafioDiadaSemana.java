package Controle;

import java.util.Scanner;

public class DesafioDiadaSemana {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Digite o nome do dia");
		String dia = Scanner.next();
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);	
		}
		if(dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		}
		if(dia.equalsIgnoreCase("terca")) {
			System.out.println(3);	
		}
		if(dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);	
		}
		if(dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);	
		}
		if(dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);	
		}
		if(dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);	
		}else {
			System.out.println("Dia Invalido");	
		}
		Scanner.close();
			
		
	}
	
	
}
