package Fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Boa noite X";
		s = s.replace("X","senhora");
		s = s.toUpperCase();
		
		s = s.concat("!!!");
		
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String y = "Bom dia X".replace("X","GUI" );
		System.out.println(y);
		
		String v = "Bom dia X".replace("X", "Mane").toUpperCase();
		System.out.println(v);
	}
	

}