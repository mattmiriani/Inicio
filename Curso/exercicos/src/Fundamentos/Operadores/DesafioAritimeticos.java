package Fundamentos.Operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		/*int a = 3 * 4 -10;
		int b = (int)Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);*/
		
		//Minha tentativa
		/*
		int eSup1 = 3 + 2;
		int eSup2 = eSup1 * 6;
		int eSup3 = (int)Math.pow(eSup2, 2);
		int eInf1 = 3 * 2;
		int eConj1 = eSup3 / eInf1;
		
		int dSup1 = (1 - 5) * (2 - 7);
		int dSup2 =  dSup1 / 2;
		int dConj1 = (int)Math.pow(dSup2, 2);
		
		int conjSup = eConj1 - dConj1;
		
		int conjSup2 = (int)Math.pow(conjSup , 3);
		int conjInf = (int)Math.pow(10 , 3);
		
		int resultado = conjSup2 / conjInf;
		
		System.out.println("O resultado é : " + resultado);
		*/
		
		//Corrigido
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);
	}
}
