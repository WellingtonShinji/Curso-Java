package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.12345f;   //Explícita (CAST)
		System.out.println(b);
		
		int c = 128;
		byte d = ( byte ) c;     //Explícita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f= (int) e;
		System.out.println(f);
		
		
		
	}

}
