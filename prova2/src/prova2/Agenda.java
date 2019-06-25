package prova2;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * <p>
 * <b> Cole��es usadas: LinkedList e TreeSet </b>
 * 
 * <p>
 * Encapsula os objetos de ItemAgenda em uma LinkedList, facilitando o seu uso e ordenando.
 * Ao trabalhar com Meta, Lembrete e Evento, houve uma separa��o de acordo com seu tipo, inserindo-as
 * em sua respectiva TreeSet para melhor atender as necessidades do problema.
 * 
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 */

public class Agenda {
	/** Itens da classe ItemAgenda que preencheram a LinkedList */
	private List<ItemAgenda> itens;
	
	/**
	 * Construtor para instanciar um objeto da classe Agenda
	 */
	public Agenda() {
		itens = new LinkedList<ItemAgenda>();
	}
	
	/**
	 * Retorna os itens da agenda
	 * 
	 * @return itens
	 */
	public List<ItemAgenda> getItens() {
		return this.itens;
	}
	
	/**
	 * M�todo para inserir um novo item na LinkedList
	 * @param _novo um novo objeto de ItemAgenda a ser inserido
	 */
	public void insereItem(ItemAgenda _novo) {
		this.itens.add(_novo);
	}
	
	/**
	 * M�todo para gerar o relat�rio completo de Agenda
	 * @return getItens()
	 */
	public List<ItemAgenda> relatorioAgendaCompleta() {
		return this.getItens();
	}
	
	/**
	 * M�todo para gerar o relat�rio dos itens de Agenda dentro de um intervalo de Datas
	 * 
	 * @param _inicial data inicial para o intervalo do relat�rio
	 * @param _final data final para o intervalo do relat�rio
	 * @return itensInterDatas LinkedList dos itens de Agenda que est�o entre as datas dos parametros
	 */
	public List<ItemAgenda> relatorioItensInterDatas(Data _inicial, Data _final) {
		List<ItemAgenda> itensInterDatas = new LinkedList<ItemAgenda>();
		int i;
		for (i = 0; i < this.itens.size(); i++) {
			if ( this.itens.get(i).getPeriodo().getDataInicio().compareTo(_inicial) != -1 && 
					this.itens.get(i).getPeriodo().getDataFim().compareTo(_final) != 1) {
				itensInterDatas.add(this.itens.get(i));
			}
		}
		return itensInterDatas;
	}
	
	/**
	 * M�todo para gerar o relat�rio de Meta ordenados por prioridade
	 * @return metasOrdenadas TreeSet das metas ordenadas por prioridade
	 */
	public Set<Meta> relatorioMetas() {
		Set<Meta> metasOrdenadas = new TreeSet<Meta>();
		int i;
		for (i = 0; i < this.itens.size(); i++) {
			if ( this.itens.get(i).getClass().toString().equalsIgnoreCase("class prova2.Meta")) {
				metasOrdenadas.add((Meta) this.itens.get(i));
			}
		}
		return metasOrdenadas;
	}
	
	/**
	 * M�todo para gerar o relat�rio de Lembrete ordenados por minutos de anteced�ncia
	 * @return lembretesOrdenados TreeSet dos lembretes ordenadas por minutos de anteced�ncia do alerta
	 */
	public Set<Lembrete> relatorioLembretes() {
		Set<Lembrete> lembretesOrdenados = new TreeSet<Lembrete>();
		int i;
		for (i = 0; i < this.itens.size();i++) {
			if (this.itens.get(i).getClass().toString().equalsIgnoreCase("class prova2.Lembrete")) {
				lembretesOrdenados.add((Lembrete) this.itens.get(i));
			}
		}
		return lembretesOrdenados;
	}
	
	/**
	 * M�todo para gerar o relat�rio de Evento ordenados alfabeticamente pela localidade
	 * @return lembretesOrdenados TreeSet dos eventos ordenadas alfabeticamente pela localidade
	 */
	public Set<Evento> relatorioEventos() {
		Set<Evento> eventosOrdenados = new TreeSet<Evento>();
		int i;
		for (i = 0; i < this.itens.size();i++) {
			if (this.itens.get(i).getClass().toString().equalsIgnoreCase("class prova2.Evento")) {
				eventosOrdenados.add((Evento) this.itens.get(i));
			}
		}
		return eventosOrdenados;
	}
	
	/**
	 * M�todo sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return dados.toString() retorna String com todos os valores dos campos da classe
	 */
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.itens);
		return dados.toString();
	}
}
