package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadoraModulo {
	// Le num1
	// Le num2
	// + - * / %
	public static void main(String[] args) {
		
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite um numero: ");
	String valor1 = entrada.nextLine();
	
	System.out.println("Digite qual operação quer realizar: ");
	System.out.println("Sendo + - * / %");
	String op = entrada.nextLine();
	
	System.out.print("Digite outro numero: ");
	String valor2 = entrada.nextLine();
	
	double num1 = Double.parseDouble(valor1);
	double num2 = Double.parseDouble(valor2);
	
	double resultado = "+".equals(op) ? num1 + num2 : 0;
	resultado = "-".equals(op) ? num1 - num2 : resultado;
	resultado = "*".equals(op) ? num1 * num2 : resultado;
	resultado = "/".equals(op) ? num1 / num2 : resultado;
	resultado = "%".equals(op) ? num1 % num2 : resultado;
	
	
	System.out.println(resultado);
	entrada.close();
	
	
	
	
	
	
	
	
	

	}
}
