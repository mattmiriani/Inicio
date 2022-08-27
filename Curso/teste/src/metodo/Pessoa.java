package metodo;

public class Pessoa {
	private int codPessoa;
	private String nome;
	private String dataNascimento;
	
	public Pessoa () {}
	
	public Pessoa (int codPessoa, String nome, String dataNascimento) {
		this.codPessoa = codPessoa;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	//getters
	public int getCodPessoa () {
		return codPessoa;
	}
	
	public String getNome (){
		return nome;
	}	
	
	public String getDataNascimento () {
		return dataNascimento;
	}
	
	//setters
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setDataNascimento (String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String toString() {
		return "Pessoa = " + "CODIGO: " + codPessoa + " NOME: " + nome + " NASCIMENTO: " + dataNascimento;
	}
	
}
