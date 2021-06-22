package Controle;

public class SwitchSemBreak {
 public static void main(String[] args) {
	
	 String categoria = "D";
	 
	 switch (categoria.toLowerCase()) {
	 case "E":
		 System.out.println("Habilitado para conduzir Veiculos Articulados.");
	 case "D":
		 System.out.println("Habilitado para conduzir Onibus.");
	 case "B":
		 System.out.println("Habilitado para conduzir Automoveis..");
	 case"A":
		 System.out.println("Habilitado para conduzir Motonetas.");
		 break;
             default:
			System.out.println("Não sou Habilitado");
		 
	 
	 
	 }
	 
  }
}
