package prova2;

import java.lang.Object;


/**
 * Classe utilizada para criação de objetos do tipo Data, possíveis comparações e manipulações
 * desse objeto. Podendo ser criados de diversas formas distintas. 
 *
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 */
public class Data {
	private int d, m, a;
	
	/**
  	 * construtor que cria um objeto Data com parametros de dia, mes e ano
  	 *
  	 * @param d dia
  	 * @param m mes
  	 * @param a ano
  	 * 
  	 * @throws Exception caso a data seja inválida
  	 */
	public Data(int d, int m, int a) throws Exception {
		this.setData(d,m,a);
	}

	/**
  	 * construtor para inicializar os parametros default
  	 * 
  	 * @throws Exception caso a data seja inválida
  	 */
	public Data() throws Exception {
		this(1,1,1900);
	}	
	
	
	/**
	 * pega o dia da data
	 * 
	 * @return d
	 */
	public int getDia() {
		return this.d;
	}
	
	/**
	 * pega o mes da data
	 * 
	 * @return m
	 */
	public int getMes() {
		return this.m;
	}
	
	/**
	 * pega o ano da data
	 * 
	 * @return a
	 */
	public int getAno() {
		return this.a;
	}
	
	
	/**
	 * redefine os valores dos campos d, m, a
	 * 
	 * @param d dia como um int
  	 * @param m mes como um int
  	 * @param a ano como um int
  	 * 
	 * @throws Exception caso a data seja inválida
	 */
	public void setData(int d, int m, int a) throws Exception {
		if(Data.isDataValida(d,m,a)) {
			this.d = d;
			this.m = m;
			this.a = a;
		}else {
			throw new Exception("Error.");
		}
	}
	
	/**
	 * redefine os valores dos campos d, m, a
	 * 
	 * @param d dia como um int
  	 * @param mes como uma String
  	 * @param a como um int
	 * @throws Exception caso a data seja inválida
	 */
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
	
	/**
	 * redefine os valores dos campos d, m, a
	 * 
  	 * @param m como um int
  	 * @param a como um int
	 * @throws Exception caso a data seja inválida
	 */
	public void setData(int m, int a) throws Exception {
		this.setData(1,m,a);
	}

	/**
	 * redefine os valores dos campos d, m, a
	 * 
  	 * @param str uma data em formato de String completa, 
  	 * seja dd/mm/aaaa ou d/m/aaaa
	 * @throws Exception caso a data seja inválida
	 */
	public void setData(String str) throws Exception {
		int dia;
		int mes;
		int ano;
		int cont;
		cont = str.indexOf("/");
		// Formato: "dd	"
		if(cont == 2) {
			dia = Integer.parseInt(str.substring(0,2));
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
	
	/**
  	 * Método que confere se duas datas são iguais
  	 * 
  	 * @param objeto sendo um Object da classe Data
  	 * 
  	 * @return true se forem datas iguais e false se forem datas diferentes
  	 */
	public boolean equals(Object objeto) {
		Data aux = (Data)objeto;
		if( this.getDia() == (aux.getDia()) &&
				this.getMes() == (aux.getMes()) &&
				this.getAno() == (aux.getAno()) ) {
			return true;
		}
		return false;
	}
	
	
	/**
  	 * Método que verifica se uma data é válida ou não
  	 * 
  	 * @param d dia como um int
  	 * @param m mes como um int
  	 * @param a ano como um int
  	 * 
  	 * @return true se for válida e false se for inválida
  	 */
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
	
	/**
  	 * Método static que verifica se o ano é bissexto
  	 *
  	 * @param a ano como um int
  	 * 
  	 * @return true se for bissexto e false se não for bissexto
  	 */
	public static boolean isBissexto(int a) {
		if(a%4==0) {
			if(a%100!=0) return true;
			else {
				if(a%400==0) return true;
			}
		}
		return false;
	}
	
	/**
  	 * Método que verifica se o ano é bissexto
  	 *
  	 * @return true se for bissexto e false se não for bissexto
  	 */
	public boolean isBissexto() {
		if(this.getAno()%4==0) {
			if(this.getAno()%100!=0) return true;
			else {
				if(this.getAno()%400==0) return true;
			}
		}
		return false;
	}
		
	
	/**
	 * Método que incrementa um dia no valor da Data, tratando os casos em que
	 * é o último dia do mês ou o último dia do último mês do ano
	 * @throws Exception caso a nova data seja inválida
	 */
	public void incrementa() throws Exception {	
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
	}
	
	
	/**
  	 * Método que compara duas datas
  	 *
  	 * @param date2 um objeto Data para comparação
  	 * @return inteiro, 1 se maior, -1 se menor ou 0 se igual
  	 */
	public int compareTo(Data date2) {
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
	
	
	/**
	 * Método sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return retorna String com todos os valores dos campos
	 */
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		return dados.toString();
	}

}