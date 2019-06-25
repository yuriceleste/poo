package prova2;

/**
 * <p>
 * Classe destinada à criação e manipulação de objetos do tipo Periodo.
 * 
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 */
public class Periodo {
	/** Data de início e Data fim do período */
	private Data dataInicio, dataFim;
	/** Horário de início e Horário fim do período */
	private Horario horarioInicio, horarioFim;
	
	/**
	 * Construtor para instanciar um objeto da classe Periodo
	 *
	 * @param _dataInicio data de início do período
	 * @param _horarioInicio horário de início do período
	 * @param _dataFim data final do período
	 * @param _horarioFim horário final do período
	 * @throws Exception caso o final do período ocorra num instante anterior ao inicial
	 */
	public Periodo(Data _dataInicio, Horario _horarioInicio, Data _dataFim, Horario _horarioFim) throws Exception {
		this.setHorarioInicio(_horarioInicio);
		this.setDataInicio(_dataInicio);
		this.setHorarioFim(_horarioFim);
		this.setDataFim(_dataFim);
	}
	
	/**
	 * Construtor para instanciar um objeto da classe Periodo
	 *
	 * @param _diaInicio dia de início do período
	 * @param _mesInicio mes de início do período
	 * @param _anoInicio ano de início do período
	 * @param _horaInicio hora de início do período
	 * @param _minutoInicio minuto de início do período
	 * @param _segundoInicio segundo de início do período
	 * @param _diaFim dia final do período
	 * @param _mesFim mes final do período
	 * @param _anoFim ano final do período
	 * @param _horaFim hora final do período
	 * @param _minutoFim minuto final do período
	 * @param _segundoFim segundo final do período
	 * @throws Exception caso o final do período ocorra num instante anterior ao inicial
	 */
	public Periodo(int _diaInicio, int _mesInicio, int _anoInicio, int _horaInicio, int _minutoInicio, int _segundoInicio, 
			int _diaFim, int _mesFim, int _anoFim, int _horaFim, int _minutoFim, int _segundoFim) throws Exception {
		this(new Data(_diaInicio,_mesInicio,_anoInicio), new Horario(_horaInicio,_minutoInicio,_segundoInicio), 
				new Data(_diaFim,_mesFim,_anoFim), new Horario(_horaFim,_minutoFim,_segundoFim));
	}
	
	/**
	 * Retorna a data de início do período
	 * 
	 * @return dataInicio
	 */
	public Data getDataInicio() {
		return this.dataInicio;
	}
	
	/**
	 * Retorna a data final do período
	 * 
	 * @return dataFim
	 */
	public Data getDataFim() {
		return this.dataFim;
	}
	
	/**
	 * Retorna a horario de início do período
	 * 
	 * @return horarioInicio
	 */
	public Horario getHorarioInicio() {
		return this.horarioInicio;
	}
	
	/**
	 * Retorna a horario final do período
	 * 
	 * @return horarioFim
	 */
	public Horario getHorarioFim() {
		return this.horarioFim;
	}
	
	/**
	 * Redefine o horario de início do período
	 * 
	 * @param _horarioInicio horario de início do período
	 */
	public void setHorarioInicio(Horario _horarioInicio) {
		this.horarioInicio = _horarioInicio;
	}
	
	/**
	 * Redefine o data de início do período
	 * 
	 * @param _dataInicio data de início do período
	 */
	public void setDataInicio(Data _dataInicio) {
		this.dataInicio = _dataInicio;
	}
	
	/**
	 * Redefine o horario final do período
	 * 
	 * @param _horarioFim horario final do período
	 */
	public void setHorarioFim(Horario _horarioFim) {
		this.horarioFim = _horarioFim;
	}
	
	/**
	 * Redefine a data final do período
	 * 
	 * @param _dataFim data final do período
	 * @throws Exception caso o final do período ocorra num instante anterior ao inicial
	 */
	public void setDataFim(Data _dataFim) throws Exception {
		if(this.dataInicio.compareTo(_dataFim) == -1){
			this.dataFim = _dataFim;
		}
		else if(this.dataInicio.compareTo(_dataFim) == 0) {
			if(this.horarioInicio.compareTo(this.horarioFim) == -1) {
				this.dataFim = _dataFim;
			}else {
				throw new Exception("Error.");
			}
		}
		else {
			throw new Exception("Error.");
		}
		
	}
	
	/**
  	 * Método que confere se dois períodos são iguais
  	 * 
  	 * @param objeto sendo um Object da classe Periodo
  	 * 
  	 * @return true se forem períodos iguais e false se forem períodos diferentes
  	 */
	public boolean equals(Object objeto) {
		Periodo aux = (Periodo)objeto;
		if( this.getDataInicio() == (aux.getDataInicio()) &&
				this.getDataFim() == (aux.getDataFim()) &&
				this.getHorarioInicio() == (aux.getHorarioInicio()) &&
				this.getHorarioFim() == (aux.getHorarioFim())) {
			return true;
		}
		return false;
	}
	
	/**
	 * Método sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return dados.toString() retorna String com todos os valores dos campos da classe
	 */
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("[");
		dados.append(this.getDataInicio());
		dados.append(" - ");
		dados.append(this.getHorarioInicio());
		dados.append("]");
		dados.append(" ~ ");
		dados.append("[");
		dados.append(this.getDataFim());
		dados.append(" - ");
		dados.append(this.getHorarioFim());
		dados.append("]");
		return dados.toString();
	} 
	
}
