package classe;

public class Produto {
	 
	String nome;
	double preco;
	double desconto;
	
	Produto (String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	Produto (){
		
	}
	
	double precoComDesconto () {
		
		double valorFinal = preco *(1 - desconto);
		
		return valorFinal;
	}
	double precoComDesconto (double descontoGerente) {
		
		double valorFinal = preco *(1 - (desconto + descontoGerente));
		
		return valorFinal;
	}
	
}
