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
	/** Descrição do Item da Agenda */
	private String descricao;
	/** Período do Item da Agenda */
	private Periodo periodo;
	
	/**
	 * Retorna o título do item da agenda
	 * 
	 * @return titulo
	 */
	public String getTitulo() {
		return this.titulo;
	}
	
	/**
	 * Retorna a descrição do item da agenda
	 * 
	 * @return descricao
	 */
	public String getDescricao() {
		return this.descricao;
	}
	
	/**
	 * Retorna o período do item da agenda
	 * 
	 * @return periodo
	 */
	public Periodo getPeriodo() {
		return this.periodo;
	}
	
	/**
	 * Redefine o título do item da agenda
	 * 
	 * @param _titulo título do item da agenda
	 */
	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}
	
	/**
	 * Redefine a descrição do item da agenda
	 * 
	 * @param _descricao descrição do item da agenda
	 */
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}
	
	/**
	 * Redefine o período do item da agenda
	 * 
	 * @param _periodo período do item da agenda
	 */
	public void setPeriodo(Periodo _periodo) {
		this.periodo = _periodo;
	}
	
	/**
	 * Método sobreposto para devolver os campos formatados em uma String
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