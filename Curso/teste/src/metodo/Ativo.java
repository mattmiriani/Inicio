package metodo;

import java.util.ArrayList;
import java.util.List;

public class Ativo {
	
	private int codAtivo;
	public List<Pessoa> Pessoas = new ArrayList<>();
	
	public Ativo () {}
	
	public Ativo (int codAtivo) {
		this.codAtivo = codAtivo;
	}
	
	//getters
	public int getCodAtivo () {
		return codAtivo;
	} 
	
	
	public void addPessoas (Pessoa pessoa) {
		this.Pessoas.add(pessoa);
	}
	
	public void removePessoas (Pessoa pessoa) {
		this.Pessoas.remove(pessoa);
	}
	
	public String toString (int CodAtivo) {
		return "Pessoas Ativas = " + codAtivo;
	}
}
