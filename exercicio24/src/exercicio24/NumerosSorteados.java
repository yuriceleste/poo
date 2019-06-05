package exercicio24;

import java.util.*;

/**
 * Encapsula os números sorteados em um sorteio em uma TreeSet, facilitando o seu uso e ordenando
 * os números gerados randomicamente
 *
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 */
public class NumerosSorteados {
	private TreeSet<Integer> ordenarNumeros = new TreeSet<Integer>();
	
	/**
  	 * construtor para inicializar valores nos campos e adicionar na coleção TreeSet
  	 * os numeros sorteados aleatoriamente em forma ordenada (crescente)
  	 *
  	 * @param _qtdNum quantidade de números sorteados para cada sorteio
  	 * @param _limInf menor número possível a ser sorteado
  	 * @param _limSup maior número possível a ser sorteado
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
  	 * Sobreposição do método toString para retornar todo o conteúdo da coleção
  	 * separando os elementos por espaços
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
