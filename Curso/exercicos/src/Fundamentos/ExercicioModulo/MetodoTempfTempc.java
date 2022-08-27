package Fundamentos.ExercicioModulo;

import java.util.Scanner;

public class MetodoTempfTempc {
	public static void main(String[] args) {
		//Exercicio 1
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Temperatura em Fahrenheit: ");
		double tempF = entrada.nextDouble();
		
		double tempC = (tempF - 32) / 1.8;
		
		System.out.printf("A temperatura informada %.2f, convertento para Celsius é: %.2f", tempF ,tempC);
		
	entrada.close();
		
		//Exercicio 2
		
	}
}
