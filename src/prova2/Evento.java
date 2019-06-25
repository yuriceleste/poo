package prova2;

/**
 * <p>
 * Classe destinada � cria��o e manipula��o de objetos do tipo Evento, filha da classe abstrata ItemAgenda.
 * 
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 */
public class Evento extends ItemAgenda implements Comparable<Evento> {
	/** Local que ocorre o Evento */
	private String local;
	
	/**
	 * Construtor para instanciar um objeto da classe Evento
	 *
	 * @param _titulo t�tulo do evento
	 * @param _descricao descri��o do evento
	 * @param _periodo per�odo no qual ser� realizado o evento
	 * @param _local local do evento
	 */
	public Evento(String _titulo, String _descricao, Periodo _periodo, String _local) {
		super.setTitulo(_titulo);
		super.setDescricao(_descricao);
		super.setPeriodo(_periodo);
		this.setLocal(_local);
	}
	
	/**
	 * Construtor para instanciar um objeto da classe Evento
	 *
	 * @param _titulo t�tulo do evento
	 * @param _descricao descri��o do evento
	 * @param _dataInicio data de in�cio do evento
	 * @param _horarioInicio hor�rio de in�cio do evento
	 * @param _dataFim data final do envento
	 * @param _horarioFim horario final do evento
	 * @param _local local do evento
	 * @throws Exception caso o periodo seja inv�lido
	 */
	public Evento(String _titulo, String _descricao, Data _dataInicio, Horario _horarioInicio, 
			Data _dataFim, Horario _horarioFim, String _local) throws Exception {
		this(_titulo, _descricao, new Periodo(_dataInicio,_horarioInicio,_dataFim,_horarioFim), _local);
	}
	
	/**
	 * Retorna o local do evento
	 * 
	 * @return local
	 */
	public String getLocal() {
		return this.local;
	}
	
	/**
	 * Redefine o local do evento
	 * 
	 * @param _local local do evento
	 */
	public void setLocal(String _local) {
		this.local = _local;
	}
	
	/**
  	 * M�todo que confere se dois eventos s�o iguais
  	 * 
  	 * @param objeto sendo um Object da classe Evento
  	 * 
  	 * @return true se forem lembretes iguais e false se forem eventos diferentes
  	 */
	public boolean equals(Object objeto) {
		Evento aux = (Evento)objeto;
		if( super.getTitulo().equals(aux.getTitulo()) &&
				super.getDescricao().equals(aux.getDescricao())  &&
				super.getPeriodo().equals(aux.getPeriodo()) && 
				this.getLocal().equals(aux.getLocal()) ) {
			return true;
		}
		return false;
	}

	/**
  	 * M�todo sobreposto que compara dois objetos da classe Evento
  	 *
  	 * @param _evento um objeto de Evento para compara��o
  	 * 
  	 * @return 1 se maior, -1 se menor ou 0 se igual
  	 */
	@Override
	public int compareTo(Evento _evento) {
		return this.getLocal().compareTo(_evento.getLocal());
	}
	
	/**
	 * M�todo sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return dados.toString() retorna String com todos os valores dos campos da classe
	 */
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\n");
		dados.append(this.getLocal());
		return dados.toString();
	}

}