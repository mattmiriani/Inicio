package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data(05,12,2001);
		//d1.dia = 05;
		//d1.mes = 12;
		//d1.ano = 2001;
		
		Data d2 = new Data();
		
		System.out.println("Data de nascimento do Matheus");
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
	}
}
