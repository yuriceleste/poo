package prova2;

/**
 * <p>
 * Classe destinada à criação e manipulação de objetos do tipo Horario.
 * 
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 */
public class Horario {
	/**
	 * Hora do objeto Horario
	 * Minuto do objeto Horario
	 * Segundo do objeto Horario
	 */
	private int hora, minuto, segundo;
	
	/**
	 * Construtor para instanciar um objeto da classe Horario
	 *
	 * @param _hora horas do horario
	 * @param _minuto minutos do horario
	 * @param _segundo segundos do horario
	 * @throws Exception caso o horario seja inválido
	 */
	public Horario(int _hora, int _minuto, int _segundo) throws Exception {
		this.setHora(_hora);
		this.setMinuto(_minuto);
		this.setSegundo(_segundo);
	}
	
	/**
	 * Construtor para instanciar um objeto default da classe Horario
	 * 
	 * @throws Exception caso o horario seja inválido
	 */
	public Horario() throws Exception {
		this(0,0,0);
	}
	
	/**
	 * Retorna a hora do Horario
	 * 
	 * @return hora
	 */
	public int getHora() {
		return this.hora;
	}
	
	/**
	 * Retorna os minutos do Horario
	 * 
	 * @return minuto
	 */
	public int getMinuto() {
		return this.minuto;
	}
	
	/**
	 * Retorna os segundos do Horario
	 * 
	 * @return segundo
	 */
	public int getSegundo() {
		return this.segundo;
	}
	
	/**
	 * Redefine a hora do Horario
	 * 
	 * @param _hora hora do Horario
	 * @throws Exception caso o valor da hora seja inválido
	 */
	public void setHora(int _hora) throws Exception {
		if(_hora <= 23 && _hora >= 0) {
			this.hora = _hora;
		}else {
			throw new Exception("Error.");
		}
	}
	
	/**
	 * Redefine o minuto do Horario
	 * 
	 * @param _minuto hora do Horario
	 * @throws Exception caso o valor do minuto seja inválido
	 */
	public void setMinuto(int _minuto) throws Exception {
		if(_minuto <= 59 && _minuto >= 0) {
			this.minuto = _minuto;
		}else {
			throw new Exception("Error.");
		}
	}
	
	/**
	 * Redefine o segundo do Horario
	 * 
	 * @param _segundo segundo do Horario
	 * @throws Exception caso o valor do segundo seja inválido
	 */
	public void setSegundo(int _segundo) throws Exception {
		if(_segundo <= 59 && _segundo >= 0) {
			this.segundo = _segundo;
		}else {
			throw new Exception("Error.");
		}
	}
	
	/**
  	 * Método que confere se dois horários são iguais
  	 * 
  	 * @param objeto sendo um Object da classe Horario
  	 * 
  	 * @return true se forem horarios iguais e false se forem horarios diferentes
  	 */
	public boolean equals(Object objeto) {
		Horario aux = (Horario)objeto;
		if( this.getHora() == (aux.getHora()) &&
				this.getMinuto() == (aux.getMinuto()) &&
				this.getSegundo() == (aux.getSegundo()) ) {
			return true;
		}
		return false;
	}
	
	/**
  	 * Método que compara dois objetos da classe Horario
  	 *
  	 * @param _horario um objeto de Horario para comparação
  	 * @return 1 se maior, -1 se menor ou 0 se igual
  	 */
	public int compareTo(Horario _horario) {
		if( this.getHora() > _horario.getHora() ) {
			return 1;
		}
		if( this.getHora() < _horario.getHora() ) {
			return -1;
		}
		else {
			if( this.getMinuto() > _horario.getMinuto() ) {
				return 1;
			}
			if( this.getMinuto() < _horario.getMinuto() ) {
				return -1;
			}
			else {
				if(this.getSegundo() > _horario.getSegundo()) {
					return 1;
				}
				if(this.getSegundo() < _horario.getSegundo()) {
					return -1;
				}
			}
		}
		return 0;
	}
	
	/**
	 * Método sobreposto para devolver os campos formatados em uma String
	 * Realizado a verificação e manipulação dos dados armazenados para informar o horário de uma forma
	 * mais clara e habitual.
	 * 
	 * @return dados.toString() retorna String com todos os valores dos campos da classe
	 */
	public String toString() {
		StringBuilder dados = new StringBuilder();
		// Salvamos o valor como inteiro, quando menor que 10, devemos inserir um 0 antes do valor armazenado para um toString adequado do horario
		// Caso que nao necessita alteracao
		if(this.getHora() > 9 && this.getMinuto() > 9 && this.getSegundo() > 9) {
			dados.append(this.getHora() + ":" + this.getMinuto() + ":" + this.getSegundo());
		}
		// Caso que necessita de alteracao nos segundos
		else if(this.getHora() > 9 && this.getMinuto() > 9) {
			dados.append(this.getHora() + ":" + this.getMinuto() + ":0" + this.getSegundo());
		}
		// Caso que necessita de alteracao nos minutos
		else if(this.getHora() > 9 && this.getSegundo() > 9) {
			dados.append(this.getHora() + ":0" + this.getMinuto() + ":" + this.getSegundo());
		}
		// Caso que necessita de alteracao nas horas
		else if(this.getMinuto() > 9 && this.getSegundo() > 9) {
			dados.append("0" + this.getHora() + ":" + this.getMinuto() + ":" + this.getSegundo());
		}
		// Caso que necessita de alteracao nos minutos e segundos
		else if(this.getHora() > 9) {
			dados.append(this.getHora() + ":0" + this.getMinuto() + ":0" + this.getSegundo());
		}
		// Caso que necessita de alteracao nas horas e segundos
		else if(this.getMinuto() > 9) {
			dados.append(":0" + this.getHora() + ":" + this.getMinuto() + ":0" + this.getSegundo());
		}
		// Caso que necessita de alteracao nas horas e minutos
		else if(this.getSegundo() > 9) {
			dados.append(":0" + this.getHora() + ":0" + this.getMinuto() + ":" + this.getSegundo());
		}
		// Caso que necessita alteracao dos 3 elementos
		else {
			dados.append(":0" + this.getHora() + ":0" + this.getMinuto() + ":0" + this.getSegundo());
		}
		return dados.toString();
	}

}
