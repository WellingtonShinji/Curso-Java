package Fundamentos;

public class TiposPrimitivos {

	
	public static void main(String[] args) {
		// tipos numericos inteiros
		
		byte AnosdeEmpresa = 23;
		short NumerosdeVoo = 542;
		int id = 56842;
		long PontosAcumuladdos = 3_254_102_008L;
		
		//tipos numericos reais
		
		float salario = 2.590F;
		double VendasAcumulads = 2_258_149_00;
		
		//tipos boleanos
		
		boolean queroirtrabalharhj = false;
		char status = 'A' ;
		
		System.out.println(AnosdeEmpresa * 365);
		System.out.println(NumerosdeVoo / 2);
		System.out.println(PontosAcumuladdos/VendasAcumulads);
		System.out.println(id+ "ganha por mes>>>"+ salario);
		System.out.println("foi trabalhar??"+queroirtrabalharhj);
		System.out.println("o status do funcionario Wellington é  "+status);
		
		
				
		
	}
}
