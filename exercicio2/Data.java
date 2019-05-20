package exercicio2;

import java.lang.Object;

// ALTERAR setData(String str) - usar indexOf("/")

public class Data {
	private int d, m, a;
	
	//CONSTRUTORES
	//First
	public Data(int d, int m, int a) throws Exception {
		this.setData(d,m,a);
	}

	//Default
	public Data() throws Exception {
		this(1,1,1900);
	}	
	//FIM CONSTRUTORES
	
	
	// GET and SET
	public int getDia() {
		return this.d;
	}
	
	public int getMes() {
		return this.m;
	}
	
	public int getAno() {
		return this.a;
	}
	
	
	// Metodo de Interface Principal
	public void setData(int d, int m, int a) throws Exception {
		if(Data.isDataValida(d,m,a)) {
			this.d = d;
			this.m = m;
			this.a = a;
		}else {
			throw new Exception("Data inválida.");
		}
	}
	
	// dia como inteiro, o nome do mês como String e o ano como inteiro.
	public void setData(int d, String mes, int a) throws Exception {
		int mes_int = 0;
		if(mes.contentEquals("janeiro")) mes = "1" ;
		if(mes.contentEquals("fevereiro")) mes = "2" ;
		if(mes.contentEquals("março")) mes = "3";
		if(mes.contentEquals("abril")) mes = "4";
		if(mes.contentEquals("maio")) mes = "5";
		if(mes.contentEquals("junho")) mes = "6";
		if(mes.contentEquals("julho")) mes = "7";
		if(mes.contentEquals("agosto")) mes = "8";
		if(mes.contentEquals("setembro")) mes = "9";
		if(mes.contentEquals("outubro")) mes = "10";
		if(mes.contentEquals("novembro")) mes = "11";
		if(mes.contentEquals("dezembro")) mes = "12";
		mes_int = Integer.parseInt(mes);
		this.setData(d,mes_int,a);
	}
	
	// de uma data contendo somente o mês e ano (neste caso o dia receberá 1)
	public void setData(int m, int a) throws Exception {
		this.setData(1,m,a);
	}

	// de uma data completa  no formato String “dd/mm/aaaa”, sendo possível dia e mês com dois ou apenas 1 caractere.  Veja as dicas sobre a classe string a seguir.
	public void setData(String str) throws Exception {
		int dia;
		int mes;
		int ano;
		int cont;
		cont = str.indexOf("/");
		// Formato: "dd	"
		if(cont == 2) {
			dia = Integer.parseInt(str.substring(0,2));
			System.out.println(dia);
			cont = str.indexOf("/",3);	
			// Formato: "dd/m/aaaa"
			if(cont == 4) {
				mes = Integer.parseInt(str.substring(3,4));
				ano = Integer.parseInt(str.substring(5,9));
			}else {		// Formato: "dd/mm/aaaa"
				mes = Integer.parseInt(str.substring(3,5));
				ano = Integer.parseInt(str.substring(6,10));
			}
		// Formato: "d"
		}else {
			dia = Integer.parseInt(str.substring(0,1));
			cont = str.indexOf("/",2);
			// Formato: "d/m/aaaa"
			if(cont == 3) {
				mes = Integer.parseInt(str.substring(2,3));
				ano = Integer.parseInt(str.substring(4,8));
			}else {		// Formato: "d/mm/aaaa"
				mes = Integer.parseInt(str.substring(2,4));
				ano = Integer.parseInt(str.substring(5,9));
			}
		}	
		this.setData(dia,mes,ano);
	}
	// Fim GET and SET
	
	
	// Equals
	public boolean equals(Object objeto) {
		Data aux = (Data)objeto;
		if( this.getDia() == (aux.getDia()) &&
				this.getMes() == (aux.getMes()) &&
				this.getAno() == (aux.getAno()) ) {
			return true;
		}
		return false;
	}
	
	
	//Método de comparação de objetos Data
	public int compareTo(Data date2) throws Exception {
		if( this.getAno() > date2.getAno() ) {
			return 1;
		}
		if( this.getAno() < date2.getAno() ) {
			return -1;
		}
		else {
			if( this.getMes() > date2.getMes() ) {
				return 1;
			}
			if( this.getMes() < date2.getMes() ) {
				return -1;
			}
			else {
				if(this.getDia() > date2.getDia()) {
					return 1;
				}
				if(this.getDia() < date2.getDia()) {
					return -1;
				}
			}
		}
		return 0;
	}
	
	
	// Validez
	public static boolean isDataValida(int d, int m, int a) {
		if(d<1 || d>31) return false;
		
		if(m<1 || m>12) return false;
			
		if(a < 1582) return false;
		
		if((m==4 || m==6 || m==9 || m==11) && (d>30)) return false;
		
		if(m==2 && d>=29) {
			if(d>29) return false;
			if( Data.isBissexto(a) == false ) return false;
		}
		return true;
	}
	
	public static boolean isBissexto(int a) {
		if(a%4==0) {
			if(a%100!=0) return true;
			else {
				if(a%400==0) return true;
			}
		}
		return false;
	}
	
	public boolean isBissexto() {
		if(this.getAno()%4==0) {
			if(this.getAno()%100!=0) return true;
			else {
				if(this.getAno()%400==0) return true;
			}
		}
		return false;
	}
	
	//Criando string
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		return dados.toString();
	}
	
	
	//Método de incremento
	public String incrementa() throws Exception {	
		try{
			this.setData(getDia()+1,getMes(),getAno());
		}
		catch(Exception dia){
			try{
				this.setData(1,getMes()+1,getAno());
			}
			catch(Exception mes){
				this.setData(1,1,getAno()+1);		
			}
		}
		return this.toString();
	}
	
	//Método de Valida e Cria
	public static Data verificaECriaData(int d, int m, int a) throws Exception {
		Data data;
		try{
			data = new Data(d,m,a);
		}
		catch(Exception e){
			return null;
		}
		return data;
	}
	

}