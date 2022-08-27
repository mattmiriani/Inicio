package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4200.90;
		p1.desconto = 0.29;
		
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 5200.90;
		p2.desconto = 0.20;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		System.out.println(p1.preco * (1 -p1.desconto));
	}
}
