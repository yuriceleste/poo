package prova2;

/**
 * <p>
 * Classe destinada � cria��o e manipula��o de objetos do tipo Meta, filha da classe abstrata ItemAgenda.
 * 
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 */
public class Meta extends ItemAgenda implements Comparable<Meta>{
	/** Prioridade do Item da Agenda */
	private int prioridade;
	
	/**
	 * Construtor para instanciar um objeto da classe Meta
	 *
	 * @param _titulo t�tulo da meta
	 * @param _descricao descri��o da meta
	 * @param _periodo per�odo no qual ser� realizado a meta
	 * @param _prioridade prioridade da meta
	 * @throws Exception caso o periodo seja inv�lido
	 */
	public Meta(String _titulo, String _descricao, Periodo _periodo, int _prioridade) throws Exception {
		super.setTitulo(_titulo);
		super.setDescricao(_descricao);
		super.setPeriodo(_periodo);
		this.setPrioridade(_prioridade);
	}
	
	/**
	 * Construtor para instanciar um objeto da classe Meta
	 *
	 * @param _titulo t�tulo da meta
	 * @param _descricao descri��o da meta
	 * @param _dataInicio data de in�cio da meta
	 * @param _horarioInicio hor�rio de in�cio da meta
	 * @param _dataFim data fim da meta
	 * @param _horarioFim hor�rio fim da meta
	 * @param _prioridade prioridade da meta
	 * @throws Exception caso o per�odo seja inv�lido
	 */
	public Meta(String _titulo, String _descricao, Data _dataInicio, Horario _horarioInicio, 
			Data _dataFim, Horario _horarioFim, int _prioridade) throws Exception {
		this(_titulo, _descricao, new Periodo(_dataInicio,_horarioInicio,_dataFim,_horarioFim), _prioridade);
	}
	
	/**
	 * Retorna a prioridade da meta
	 * 
	 * @return prioridade
	 */
	public int getPrioridade() {
		return this.prioridade;
	}
	
	/**
	 * Redefine a prioridade da meta
	 * 
	 * @param _prioridade prioridade da meta
	 * @throws Exception caso o valor da prioridade seja inv�lido
	 */
	public void setPrioridade(int _prioridade) throws Exception {
		if(_prioridade >= 1 && _prioridade <=5 ) {
			this.prioridade = _prioridade;
		}else {
			throw new Exception("Error!");
		}
		
	}
	
	/**
  	 * M�todo que confere se duas metas s�o iguais
  	 * 
  	 * @param objeto sendo um Object da classe Meta
  	 * 
  	 * @return true se forem metas iguais e false se forem metas diferentes
  	 */
	public boolean equals(Object objeto) {
		Meta aux = (Meta)objeto;
		if( super.getTitulo().equals(aux.getTitulo()) &&
				super.getDescricao().equals(aux.getDescricao())  &&
				super.getPeriodo().equals(aux.getPeriodo()) && 
				this.getPrioridade() == aux.getPrioridade() ) {
			return true;
		}
		return false;
	}
	
	/**
  	 * M�todo sobreposto que compara dois objetos da classe Meta
  	 *
  	 * @param _meta um objeto de Meta para compara��o
  	 * @return 1 se maior, -1 se menor ou 0 se igual
  	 */
	@Override
	public int compareTo(Meta _meta) {	
		if (this.getPrioridade() > _meta.getPrioridade()) {
			return 1;
		}
		if (this.getPrioridade() < _meta.getPrioridade()) {
			return -1;
		}
		return 0;
	}

	/**
	 * M�todo sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return dados.toString() retorna String com todos os valores dos campos da classe
	 */
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(" # ");
		dados.append(this.getPrioridade());
		return dados.toString();
	}
	
}
