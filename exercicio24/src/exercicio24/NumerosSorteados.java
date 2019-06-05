package exercicio24;

import java.util.*;

/**
 * Encapsula os n�meros sorteados em um sorteio em uma TreeSet, facilitando o seu uso e ordenando
 * os n�meros gerados randomicamente
 *
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 */
public class NumerosSorteados {
	private TreeSet<Integer> ordenarNumeros = new TreeSet<Integer>();
	
	/**
  	 * construtor para inicializar valores nos campos e adicionar na cole��o TreeSet
  	 * os numeros sorteados aleatoriamente em forma ordenada (crescente)
  	 *
  	 * @param _qtdNum quantidade de n�meros sorteados para cada sorteio
  	 * @param _limInf menor n�mero poss�vel a ser sorteado
  	 * @param _limSup maior n�mero poss�vel a ser sorteado
  	 */
	public NumerosSorteados(int _qtdNum, int _limInf, int _limSup) {
		int i;
		
		Random gerador = new Random();
		
		int aux;
		for(i=0; i<_qtdNum; i++) {
			aux = (gerador.nextInt(_limSup - _limInf) + _limInf);
			if(ordenarNumeros.contains(aux)==false) {
				ordenarNumeros.add(aux);
			}else {
				i--;
			}
		}
	}
	
	/**
  	 * Sobreposi��o do m�todo toString para retornar todo o conte�do da cole��o
  	 * separando os elementos por espa�os
  	 * @return retorna ums String com todos os dados
  	 */
  	public String toString() {
  			StringBuilder s = new StringBuilder("");
        	Iterator<Integer> i = this.ordenarNumeros.iterator();
        	while (i.hasNext())
              	s.append(i.next() + "  ");
        	return s.toString();
  	}
	
}
