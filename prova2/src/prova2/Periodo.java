package prova2;

/**
 * <p>
 * Classe destinada � cria��o e manipula��o de objetos do tipo Periodo.
 * 
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 */
public class Periodo {
	/** Data de in�cio e Data fim do per�odo */
	private Data dataInicio, dataFim;
	/** Hor�rio de in�cio e Hor�rio fim do per�odo */
	private Horario horarioInicio, horarioFim;
	
	/**
	 * Construtor para instanciar um objeto da classe Periodo
	 *
	 * @param _dataInicio data de in�cio do per�odo
	 * @param _horarioInicio hor�rio de in�cio do per�odo
	 * @param _dataFim data final do per�odo
	 * @param _horarioFim hor�rio final do per�odo
	 * @throws Exception caso o final do per�odo ocorra num instante anterior ao inicial
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
	 * @param _diaInicio dia de in�cio do per�odo
	 * @param _mesInicio mes de in�cio do per�odo
	 * @param _anoInicio ano de in�cio do per�odo
	 * @param _horaInicio hora de in�cio do per�odo
	 * @param _minutoInicio minuto de in�cio do per�odo
	 * @param _segundoInicio segundo de in�cio do per�odo
	 * @param _diaFim dia final do per�odo
	 * @param _mesFim mes final do per�odo
	 * @param _anoFim ano final do per�odo
	 * @param _horaFim hora final do per�odo
	 * @param _minutoFim minuto final do per�odo
	 * @param _segundoFim segundo final do per�odo
	 * @throws Exception caso o final do per�odo ocorra num instante anterior ao inicial
	 */
	public Periodo(int _diaInicio, int _mesInicio, int _anoInicio, int _horaInicio, int _minutoInicio, int _segundoInicio, 
			int _diaFim, int _mesFim, int _anoFim, int _horaFim, int _minutoFim, int _segundoFim) throws Exception {
		this(new Data(_diaInicio,_mesInicio,_anoInicio), new Horario(_horaInicio,_minutoInicio,_segundoInicio), 
				new Data(_diaFim,_mesFim,_anoFim), new Horario(_horaFim,_minutoFim,_segundoFim));
	}
	
	/**
	 * Retorna a data de in�cio do per�odo
	 * 
	 * @return dataInicio
	 */
	public Data getDataInicio() {
		return this.dataInicio;
	}
	
	/**
	 * Retorna a data final do per�odo
	 * 
	 * @return dataFim
	 */
	public Data getDataFim() {
		return this.dataFim;
	}
	
	/**
	 * Retorna a horario de in�cio do per�odo
	 * 
	 * @return horarioInicio
	 */
	public Horario getHorarioInicio() {
		return this.horarioInicio;
	}
	
	/**
	 * Retorna a horario final do per�odo
	 * 
	 * @return horarioFim
	 */
	public Horario getHorarioFim() {
		return this.horarioFim;
	}
	
	/**
	 * Redefine o horario de in�cio do per�odo
	 * 
	 * @param _horarioInicio horario de in�cio do per�odo
	 */
	public void setHorarioInicio(Horario _horarioInicio) {
		this.horarioInicio = _horarioInicio;
	}
	
	/**
	 * Redefine o data de in�cio do per�odo
	 * 
	 * @param _dataInicio data de in�cio do per�odo
	 */
	public void setDataInicio(Data _dataInicio) {
		this.dataInicio = _dataInicio;
	}
	
	/**
	 * Redefine o horario final do per�odo
	 * 
	 * @param _horarioFim horario final do per�odo
	 */
	public void setHorarioFim(Horario _horarioFim) {
		this.horarioFim = _horarioFim;
	}
	
	/**
	 * Redefine a data final do per�odo
	 * 
	 * @param _dataFim data final do per�odo
	 * @throws Exception caso o final do per�odo ocorra num instante anterior ao inicial
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
  	 * M�todo que confere se dois per�odos s�o iguais
  	 * 
  	 * @param objeto sendo um Object da classe Periodo
  	 * 
  	 * @return true se forem per�odos iguais e false se forem per�odos diferentes
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
	 * M�todo sobreposto para devolver os campos formatados em uma String
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
