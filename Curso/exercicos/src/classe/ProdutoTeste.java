package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook",4200.90,0.29);
		
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 5200.90;
		p2.desconto = 0.20;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		System.out.println(p1.precoComDesconto(0.1));
	}
}
