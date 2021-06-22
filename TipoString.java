package Fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Wellington".charAt(2));
		String b = "boa tarde";
		System.out.println(b.concat(" é o caralho"));
		System.out.println(b+(" é o caralho"));
		System.out.println(b.startsWith("tarde"));
		System.out.println(b.startsWith("boa"));
		System.out.println(b.endsWith("boa"));
		System.out.println(b.length());
		System.out.println(b.equals("boa tarde"));
		System.out.println(b.equalsIgnoreCase("boa tarde"));
		
		
		var nome ="Wellington";
		var sobrenome ="Santos";
		var idade = 37;
		var salario = 2.500;
		
		System.out.println("Nome:"+ nome +"\nSobrenome:" + sobrenome + "\nIdade:" + idade + "\nSalario:" + salario);
		
		
	}

}
