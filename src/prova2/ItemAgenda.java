package prova2;

/**
 * <p>
 * Usado para como classe abstrata para as classes Meta, Lembrete e Evento.
 * 
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 */
abstract public class ItemAgenda {
	/** Titulo do Item da Agenda */
	private String titulo;
	/** Descri��o do Item da Agenda */
	private String descricao;
	/** Per�odo do Item da Agenda */
	private Periodo periodo;
	
	/**
	 * Retorna o t�tulo do item da agenda
	 * 
	 * @return titulo
	 */
	public String getTitulo() {
		return this.titulo;
	}
	
	/**
	 * Retorna a descri��o do item da agenda
	 * 
	 * @return descricao
	 */
	public String getDescricao() {
		return this.descricao;
	}
	
	/**
	 * Retorna o per�odo do item da agenda
	 * 
	 * @return periodo
	 */
	public Periodo getPeriodo() {
		return this.periodo;
	}
	
	/**
	 * Redefine o t�tulo do item da agenda
	 * 
	 * @param _titulo t�tulo do item da agenda
	 */
	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}
	
	/**
	 * Redefine a descri��o do item da agenda
	 * 
	 * @param _descricao descri��o do item da agenda
	 */
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}
	
	/**
	 * Redefine o per�odo do item da agenda
	 * 
	 * @param _periodo per�odo do item da agenda
	 */
	public void setPeriodo(Periodo _periodo) {
		this.periodo = _periodo;
	}
	
	/**
	 * M�todo sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return dados.toString() retorna String com todos os valores dos campos da classe
	 */
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("\n");
		dados.append(this.getTitulo());
		dados.append(" - ");
		dados.append(this.getDescricao());
		dados.append("\n");
		dados.append(this.getPeriodo());
		return dados.toString();
	}
}