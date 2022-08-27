package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 05;
		d1.mes = 12;
		d1.ano = 2001;
		
		System.out.println("Data de nascimento do Matheus");
		System.out.println("Data: " + d1.dia + "/" + d1.mes + "/" + d1.ano);
	}
}
