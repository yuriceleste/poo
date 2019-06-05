package exercicio24;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <p>
 * <b> Cole��es usadas: LinkedList e TreeSet </b>
 * 
 * <p>
 * <b> LinkedList </b> - aceita elementos repetidos; permite acesso aleat�rio do
 * n-esimo elemento; apesar de percorrer sequencialmente a lista (da frente para tr�s
 * ou vice-versa, dependendo do que for mais pr�ximo);
 * mant�m a mesma ordem da inser��o; para usar uma pesquisa bin�ria (muito mais r�pida que a linear),
 * com o m�todo est�tico Collections.binarySearch(lista), os elementos dever�o estar ordenados.
 
 * <p>
 * <b> TreeSet </b> - n�o aceita elementos repetidos; mant�m os elementos
 * ordenados a cada inser��o, possui busca r�pida; � ruim para acessar os
 * elementos sequencialmente
 * 
 * <p>
 * Estas classes de cole��es foram encapsuladas em outras classes para facilitar o seu uso
 * <p>
 * Os objetos s�o depois gravados em disco atrav�s da serializa��o.
 * <p>
 * Tipos primitivos s� podem ser inseridos em cole��es por interm�dio de
 * classes wrapper (em vers�es mais recente do Java � poss�vel inserir tipos primitivos)
 *
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 *
 */

public class Uso {
	
	public static void main(String[] args) throws Exception {
		try {
			ConjuntoSorteio conjunto = new ConjuntoSorteio();
			Data data = new Data(20,12,2019);
			
			conjunto.insere(data,4);
			
			// gravar sorteios no arquivo
			Arquivo.grava("conjunto.my",conjunto);
			// gravar sorteios no arquivo .txt
			Arquivo.gravaTxt(conjunto);
			
			// ler sorteios do arquivo
			System.out.println(Arquivo.le("conjunto.my").toString());
			
		}
		catch(FileNotFoundException e) {
          	System.out.println("Arquivo n�o encontrado");
    	}
		catch(IOException e) {
          	System.out.println("Problemas na leitura ou grava��o do arquivo");
		}
    	catch(ClassNotFoundException e) {
          	System.out.println("Classe inexistente usada na convers�o");
    	}
	}
}
