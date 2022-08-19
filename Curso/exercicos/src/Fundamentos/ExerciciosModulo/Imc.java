package Fundamentos.ExercicioModulo;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
			System.out.print("Me passe seu peso: ");
			double peso = entrada.nextDouble();
			System.out.println("Me passe sua altura");
			double altura = entrada.nextDouble();
			
			double imc =   peso / (altura * altura);
			
			System.out.printf("Seu IMC é : %.2f", imc);
		
		
		entrada.close();
		
	}

}
