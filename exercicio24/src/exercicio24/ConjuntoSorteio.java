package exercicio24;

import java.io.Serializable;
import java.util.*;

/**
 * Encapsula a classe LinkedList facilitando o seu uso e tipificando os objetos
 * para inclusão como instâncias da classe Sorteio
 *
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 */
@SuppressWarnings("serial")
public class ConjuntoSorteio implements Serializable {
  	private List<Sorteio> grupoSorteios;
  	
  	ConjuntoSorteio() {
  		grupoSorteios = new LinkedList<Sorteio>();
  	}
  	
  	/**
  	 * Insere uma instância da classe Sorteio
  	 *
  	 * @param _sorteio objeto a ser incluído na coleção
  	 */
  	public void insere(Sorteio _sorteio) {
        	this.grupoSorteios.add(_sorteio);
  	}
 
  	/**
  	 * Insere uma instância da classe Sorteio por intermédio dos seus campos
  	 *
  	 * @param _data data do primeiro sorteio a ser realizado
  	 * @param _qtdSorteios quantidade de sorteios a serem realizados
  	 * @throws Exception caso ocorra erro na classe Data ou na classe Sorteio
  	 */
  	public void insere(Data _data, int _qtdSorteios) throws Exception {
        for(int i=0; i<_qtdSorteios; i++) {
        	Data dataIncrementada = new Data(_data.getDia(),_data.getMes(),_data.getAno());
        	this.insere(new Sorteio(dataIncrementada, _qtdSorteios));
			_data.incrementa();
	    	dataIncrementada = new Data(_data.getDia(),_data.getMes(),_data.getAno());
        }
  	}
  	
  	/**
	 * Método sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return retorna String com todos os valores da coleção
	 */
  	public String toString() {
  		StringBuilder s = new StringBuilder();
    	for (int i = 0; i < this.grupoSorteios.size(); i++) {
          	s.append(this.grupoSorteios.get(i));
          	s.append("\r\n");
    	}
    	return s.toString();
	}
  	
}
