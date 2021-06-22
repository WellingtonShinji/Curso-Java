package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("\nQual é Seu Salario Lizandra?");
		String salarioLizandra = entrada.nextLine().replace(",", ".");
		System.out.println("\nQual é Seu Salario Victor?");
		String salarioVictor = entrada.nextLine().replace(",", ".");
		System.out.println("\nQual é Seu Salario Wellington?");
		String salarioWellington = entrada.nextLine().replace(",", ".");
		double salarioW = Double.parseDouble(salarioWellington);
		double salarioJ = Double.parseDouble(salarioLizandra);
		double salarioP = Double.parseDouble(salarioVictor);
		double salarios = salarioW + salarioJ + salarioP;
		System.out.print("\n A media Salarial é:"+ salarios / 3);
		entrada.close();
		
	     }
		
	
		
		
	}

