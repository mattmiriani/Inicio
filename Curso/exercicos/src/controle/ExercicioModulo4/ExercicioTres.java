package Controle.ExercicioModulo4;

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qntdNota = 0;
		double media = 0;
		double mediaCalculada = 0;

		while (qntdNota < 2) {
			System.out.print("Digite as notas: ");
			double nota = entrada.nextDouble();
				media += nota;
			qntdNota++;
		}
		
		mediaCalculada = media / qntdNota;
		
		if(mediaCalculada >= 7) {
			System.out.println("Aprovado!");
		}else if (mediaCalculada < 7 && mediaCalculada > 4) {
			System.out.println("Recuperação!");
		}else {
			System.out.println("Reprovado!");
		}

		entrada.close();
	}
}
