package exercicio8;

import java.lang.Object;


public class ContaBancaria {
	private double saldo;
	private static double taxaJuros = 0.2;
	private String nomeCorrentista;
	
	
	//CONSTRUTORES
	
	//First
	public ContaBancaria(String nomeCorrentista, double saldo) throws Exception {
		this.setConta(nomeCorrentista,saldo);
	}

	//Default
	public ContaBancaria() throws Exception {
		this(" ",0.0);
	}
	
	//FIM CONSTRUTORES
	
	
	// GET and SET
	public String getNomeCorrentista() {
		return this.nomeCorrentista;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public static double getTaxaJuros() {
		return ContaBancaria.taxaJuros;
	}
	
	public static void setTaxaJuros(double novo) {
		ContaBancaria.taxaJuros = novo;
	}

	// Metodo de Interface Principal
	public void setConta(String nomeCorrentista, double saldo) throws Exception {
		if(ContaBancaria.isContaValida(nomeCorrentista, saldo)) {
			this.nomeCorrentista = nomeCorrentista;
			this.saldo = saldo;
		}else {
			throw new Exception("Conta inválida.");
		}
	}
	
	public void setAplica_Juros() {
		this.saldo += ContaBancaria.getTaxaJuros()*this.saldo;
	}

	// Fim GET and SET
	
	
	public static boolean isContaValida(String nomeCorrentista, double saldo) {
		if(saldo < 0.0 || nomeCorrentista.equals("")) {
			return false;
		}
		return true;
	}

	
	// Equals
	public boolean equals(Object objeto) {
		ContaBancaria aux = (ContaBancaria)objeto;
		if( this.getNomeCorrentista().toString() == (aux.getNomeCorrentista().toString())) {
			return true;
		}
		return false;
	}	
	
	// compareTo
		public int compareTo(ContaBancaria conta2) throws Exception {
			if( this.getSaldo() > conta2.getSaldo() ) {
				return 1;
			}
			if( this.getSaldo() < conta2.getSaldo() ) {
				return -1;
			}
			return 0;
		}
	
	//Criando string
	public String toString(String nome_correntista, double saldo) {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getNomeCorrentista());
		dados.append("\n\tR$");
		dados.append(this.getSaldo());
		return dados.toString();
	}
	
}
