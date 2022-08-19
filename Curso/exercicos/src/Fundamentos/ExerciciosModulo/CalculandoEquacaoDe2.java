package Fundamentos.ExercicioModulo;

public class CalculandoEquacaoDe2 {
	public static void main(String[] args) {
		int a = 1;
		int b = 12;
		int c = -13;
		int quadrado = 0;
		int resultadoA = 0;
		int resultadoB = 0;
		
	//X	
		//ax²
		while (quadrado < 2) {
			resultadoA = a * a;
			resultadoB = b * b;
			quadrado++;
		}
		
		//abx + 13 = 
		/*int ab = resultadoA + b; // = 13;
		
		int x = -13 / ab;
		
		System.out.println("Valor de X: " + x);*/
		
		//Delta
		int delta = resultadoB - 4 * (a * c);
		
		System.out.println("Valor de delta: " + delta);
		
		//x' , x"
		double x1 = (-b + Math.sqrt(delta)) / 2;
		double x2 = (+b + Math.sqrt(delta)) / 2;
		
		System.out.println("Valor do x': " + x1);
		System.out.println("Valor do x\": " + x2);
	}
}
