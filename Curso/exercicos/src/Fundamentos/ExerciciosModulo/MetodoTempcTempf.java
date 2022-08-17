package Fundamentos.ExerciciosModulo;

import java.util.Scanner;

public class MetodoTempcTempf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Temperatura em Celsius: ");
		double tempC = entrada.nextDouble();
		
		double tempF = (tempC * 1.8) + 32;
		
		System.out.printf("A temperatura informada %.2f, convertendo em Fahrenheit: %.2f", tempC , tempF);
		
		
		
		entrada.close();
	}
}
