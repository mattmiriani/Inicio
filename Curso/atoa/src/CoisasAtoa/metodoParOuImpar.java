package CoisasAtoa;

import java.util.Scanner;

public class metodoParOuImpar {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		String a = entrada.nextLine();
		
		System.out.print("Digite outro numero: ");
		String b = entrada.nextLine();
		
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		
		int preResult = num1 * num2 ;
		
		int result = preResult % 2;
		
		if(result == 0) {
			System.out.println("A multiplicação dos dois numeros é " + preResult + " e Par!");
		}
		else {
			System.out.println("A multiplicação dos dois numeros é " + preResult + " e Impar!");
		}
		
		
		
		
		

	}
}
