package testeMain;

import metodo.Ativo;
import metodo.Pessoa;

public class main {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa (1,"Jose", "05/12/2001");
		
		System.out.println(p1);
		
		Ativo a1 = new Ativo(1);
		
		a1.addPessoas(p1);
		
		System.out.println(a1);
		
		
	}
}
