package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("Wellington" == "Lizandra");
		System.out.println("Wellington" == "Wellington");
		String a = new String ("2");
		
		System.out.println("2".equals(a));
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2));
		
		entrada.close();
				
		
		
	}

}
