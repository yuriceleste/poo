package exercicio24;

import java.io.Serializable;

/**
 * Coleções utilizadas: TreeSet 
 * <p>
 * Usado para criar o objeto sorteio que será utilizado para preencher a LinkedList na classe ConjuntoSorteio
 * 
 * <p>
 * Implementa a interface Serializable, para permitir que as suas instâncias possam
 * ser usadas numa serialização (por exemplo, gravação em disco)
 * 
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 */
@SuppressWarnings("serial")
public class Sorteio implements Comparable<Sorteio>, Serializable {
	/** Data do sorteio */
	private Data dataSorteio;
	/** Numeros sorteados */
	private NumerosSorteados numSorteados;
	/** quantidade de numeros sorteados*/
	private static final int QTD_NUM_SORTEADOS = 4;
	private static int qtd_num_sorteados = QTD_NUM_SORTEADOS;
	/** faixa vai de valor dos numeros sorteados*/
	private static final int LIM_SUP_SORTEIO = 99;
	private static int lim_sup_sorteio = LIM_SUP_SORTEIO;
	private static final int LIM_INF_SORTEIO = 1;
	private static int lim_inf_sorteio = LIM_INF_SORTEIO;
	
	/**
	 * construtor para inicializar valores nos campos
	 *
	 * @param _data data do primeiro sorteio a ser realizado
	 * @param _qtdSorteios quantidade de sorteios realizados
	 * @throws Exception caso a data seja inválida
	 */
	public Sorteio(Data _data, int _qtdSorteios) throws Exception {
		this.setSorteio(_data, _qtdSorteios);
	}
	
	/**
  	 * construtor que cria um objeto data com parametros de dia, mes e ano
  	 *
  	 * @param _dia dia do primeiro sorteio
  	 * @param _mes mes do primeiro sorteio
  	 * @param _ano ano do primeiro sorteio
  	 * @param _qtdSorteios quantidade de sorteios realizados
	 * @throws Exception caso a data seja inválida
  	 */
	public Sorteio(int _dia, int _mes, int _ano, int _qtdSorteios) throws Exception {
		this(new Data(_dia,_mes,_ano), _qtdSorteios);
	}
	
	
	/**
	 * pega a quantidade de numeros sorteados
	 * 
	 * @return qtd_num_sorteados
	 */
	public static int getQtdNumSorteados() {
		return Sorteio.qtd_num_sorteados;
	}
	
	/**
	 * pega limite inferior dos numeros do sorteio
	 * 
	 * @return lim_inf_sorteio
	 */
	public static int getLimInfSorteio() {
		return Sorteio.lim_inf_sorteio;
	}
	
	/**
	 * pega limite superior dos numeros do sorteio
	 * 
	 * @return lim_sup_sorteio
	 */
	public static int getLimSupSorteio() {
		return Sorteio.lim_sup_sorteio;
	}
	
	/**
	 * pega a data do sorteio realizado
	 * 
	 * @return dataSorteio
	 */
	public Data getDataSorteio() {
		return this.dataSorteio;
	}
	
	/**
	 * pega os numeros sorteados no sorteio
	 * 
	 * @return numSorteados
	 */
	public NumerosSorteados getNumSorteados(){
		return this.numSorteados;
	}
	
	/**
	 * redefine quantidade de numeros sorteados
	 * @param qtd_num quantidade de numeros sorteados em cada sorteio
	 */
	public static void setQtdNumSorteados(int qtd_num) {
		Sorteio.qtd_num_sorteados = qtd_num;
	}
	
	/**
	 * redefine o limite superior dos numeros do sorteio
	 * @param limite novo valor do limite superior
	 */
	public static void setLimSupSorteio(int limite) {
		Sorteio.lim_sup_sorteio = limite;
	}
	
	/**
	 * redefine o limite inferior dos numeros do sorteio
	 * @param limite novo valor do limite inferior
	 */
	public static void setLimInfSorteio(int limite) {
		Sorteio.lim_inf_sorteio = limite;
	}
	
	/**
	 * redefine o objeto sorteio
	 * 
	 * @param _dataSorteio dia do primeiro sorteio
  	 * @param _qtdSorteios quantidade de sorteios realizados
	 */
	public void setSorteio(Data _dataSorteio, int _qtdSorteios) {
		this.dataSorteio = _dataSorteio;
		this.numSorteados = new NumerosSorteados(getQtdNumSorteados(),getLimInfSorteio(),getLimSupSorteio());
	}
	
	/**
	 * compara dois sorteios
	 */
	@Override
	public int compareTo(Sorteio o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * Método sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return retorna String com todos os valores dos campos
	 */
	public String toString() {
		StringBuilder retorno = new StringBuilder();
		retorno.append(this.getDataSorteio());
		retorno.append("\t");
		retorno.append(this.getNumSorteados());
		return retorno.toString();
	}

}



