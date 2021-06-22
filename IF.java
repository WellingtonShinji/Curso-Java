package Controle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("INFORME A MEDIA: ");
		Double media = Scanner.nextDouble();
		
		if (media <= 10 && media >= 7) {
			System.out.println("APROVADO");
		    System.out.println("PARABÉNS");
		}
		if (media <= 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		if (media <= 5 && media >= 0) {
			System.out.println("Reprovado");
			System.out.println("Estude mais");
		}
		Scanner.close();
	}
	
}
