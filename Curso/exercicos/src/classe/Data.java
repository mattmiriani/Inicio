package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data () {
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data(int diaFornecido, int mesFornecido, int anoFornecido){
		dia = diaFornecido;
		mes = mesFornecido;
		ano = anoFornecido;
	}
	
	
	String dataFormatada() {
		
		String formato = "" + dia + "/" + mes + "/" + ano;
		
		return formato;
	}
	
}
