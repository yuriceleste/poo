package exercicio15;

import java.util.Date;

@SuppressWarnings("serial")
public class Data extends java.util.Date {
	private int month;
	private static Date data;
	
	public void setMonth(String _mes) throws Exception {
		String mes_num = "";
		if(_mes.contentEquals("janeiro")) mes_num = "0" ;
		if(_mes.contentEquals("fevereiro")) mes_num = "1" ;
		if(_mes.contentEquals("março")) mes_num = "2";
		if(_mes.contentEquals("abril")) mes_num = "3";
		if(_mes.contentEquals("maio")) mes_num = "4";
		if(_mes.contentEquals("junho")) mes_num = "5";
		if(_mes.contentEquals("julho")) mes_num = "6";
		if(_mes.contentEquals("agosto")) mes_num = "7";
		if(_mes.contentEquals("setembro")) mes_num = "8";
		if(_mes.contentEquals("outubro")) mes_num = "9";
		if(_mes.contentEquals("novembro")) mes_num = "10";
		if(_mes.contentEquals("dezembro")) mes_num = "11";
		this.month = Integer.parseInt(mes_num);
	}
	
	public int getMonth() {
		return this.month + 1;
	}
	
	public int qtdDias(Date _data, Date _data2) {
		int qtd = (int) ((Math.abs(_data.getTime()*1000 - _data2.getTime()*1000))/1440);
		return qtd;
	}
	
	public int qtdDias(Date _data2) {
		long qtd = (int) ((Math.abs(this.getTime()*1000 - _data2.getTime()*1000))/1440);
		return qtd;
	}
	
	public int qtdDias(int _day, int _month, int _year, int _hour, int _minutes, int _seconds) {
		Data data_aux = new Data(_day,_month,_year,_hour,_minutes,_seconds);
		int qtd = (int) ((Math.abs(this.getTime() - data_aux.getTime()))/1440000);
		return qtd;
	}
	
	public static void incrementa(Data _data) {
		long tempo = ((_data.getTime())/1440000)+1440000;
		
	}

	
}
