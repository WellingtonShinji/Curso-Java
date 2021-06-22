package Controle;

import java.util.Scanner;

public class DesafioWhile {
  public static void main(String[] args) {
	
	  Scanner entrada = new Scanner(System.in);
	int quantidadedenotas = 0 ;
	double nota = 0;
	double total = 0;
	while (nota != -1 ){
		System.out.println("Informe sua nota");
		nota = entrada.nextDouble();
	
		if(nota <= 10 && nota >= 0) {
		total += nota;
		quantidadedenotas++;
		
	}else if(nota != -1) {
		System.out.println("NOTA INVALIDA ;D");	
	}
	} 
	double media = total / quantidadedenotas;
	System.out.println("A media das notas é : "+ media);
	entrada.close();
	  
  }

}