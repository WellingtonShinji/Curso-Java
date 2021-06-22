package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("INFORME O NUMERO: ");
		double num1 = entrada.nextDouble();
		System.out.println("INFORME O NUMERO: ");
		double num2 = entrada.nextDouble();
		System.out.println("INFORME A OPERA��O: ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		
		System.err.printf("%.2f %s %.2f = %.2f ?",num1 , op , num2 , resultado );
	
		entrada.close();
		
		
	}
	
}
