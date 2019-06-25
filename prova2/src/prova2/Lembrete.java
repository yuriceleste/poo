package prova2;

/**
 * <p>
 * Classe destinada à criação e manipulação de objetos do tipo Lembrete, filha da classe abstrata ItemAgenda.
 * 
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 */
public class Lembrete extends ItemAgenda implements Comparable<Lembrete> {
	/** Minutos que antecedem o alerta do lembrete */
	private int alertaInicio;
	
	/**
	 * Construtor para instanciar um objeto da classe Lembrete
	 *
	 * @param _titulo título do lembrete
	 * @param _descricao descrição do lembrete
	 * @param _periodo período no qual será realizado o lembrete
	 * @param _alertaInicio minutos antes do alerta do lembrete
	 * @throws Exception caso o periodo seja inválido ou o alerta seja inválido
	 */
	public Lembrete(String _titulo, String _descricao, Periodo _periodo, int _alertaInicio) throws Exception {
		super.setTitulo(_titulo);
		super.setDescricao(_descricao);
		super.setPeriodo(_periodo);
		this.setAlertaInicio(_alertaInicio);
	}
	
	/**
	 * Construtor para instanciar um objeto da classe Lembrete
	 *
	 * @param _titulo título do lembrete
	 * @param _descricao descrição do lembrete
	 * @param _dataInicio data de início do lembrete
	 * @param _horarioInicio horário de início do lembrete
	 * @param _dataFim data fim do lembrete
	 * @param _horarioFim horário fim do lembrete
	 * @param _alertaInicio minutos antes do alerta do lembrete
	 * @throws Exception caso o periodo seja inválido ou o alerta seja inválido
	 */
	public Lembrete(String _titulo, String _descricao, Data _dataInicio, Horario _horarioInicio, 
			Data _dataFim, Horario _horarioFim, int _alertaInicio) throws Exception {
		this(_titulo, _descricao, new Periodo(_dataInicio,_horarioInicio,_dataFim,_horarioFim), _alertaInicio);
	}
	
	/**
	 * Retorna o tempo em minutos que antecede o alerta do lembrete
	 * 
	 * @return alertaInicio
	 */
	public int getAlertaInicio() {
		return this.alertaInicio;
	}
	
	/**
	 * Redefine o tempo em minutos que antecede o alerta do lembrete
	 * 
	 * @param _alertaInicio minutos que antecedem o alerta do lembrete
	 * @throws Exception caso o valor dos minutos seja inválido
	 */
	public void setAlertaInicio(int _alertaInicio)  throws Exception {
		if(_alertaInicio >= 0) {
			this.alertaInicio = _alertaInicio;
		}else {
			throw new Exception("Error!");
		}
		
	}
	
	/**
  	 * Método que confere se dois lembretes são iguais
  	 * 
  	 * @param objeto sendo um Object da classe Lembrete
  	 * 
  	 * @return true se forem lembretes iguais e false se forem lembretes diferentes
  	 */
	public boolean equals(Object objeto) {
		Lembrete aux = (Lembrete)objeto;
		if( super.getTitulo().equals(aux.getTitulo()) &&
				super.getDescricao().equals(aux.getDescricao())  &&
				super.getPeriodo().equals(aux.getPeriodo()) && 
				this.getAlertaInicio() == aux.getAlertaInicio() ) {
			return true;
		}
		return false;
	}
	
	/**
  	 * Método sobreposto que compara dois objetos da classe Lembrete
  	 *
  	 * @param _lembrete um objeto de Lembrete para comparação
  	 * @return 1 se maior, -1 se menor ou 0 se igual
  	 */
	@Override
	public int compareTo(Lembrete _lembrete) {
		if (this.getAlertaInicio() > _lembrete.getAlertaInicio()) {
			return 1;
		}
		if (this.getAlertaInicio() < _lembrete.getAlertaInicio()) {
			return -1;
		}
		return 0;
	}
	
	/**
	 * Método sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return dados.toString() retorna String com todos os valores dos campos da classe
	 */
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\n + ");
		dados.append(this.getAlertaInicio());
		return dados.toString();
	}
}
