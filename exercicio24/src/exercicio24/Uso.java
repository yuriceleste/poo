package exercicio24;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <p>
 * <b> Coleções usadas: LinkedList e TreeSet </b>
 * 
 * <p>
 * <b> LinkedList </b> - aceita elementos repetidos; permite acesso aleatório do
 * n-esimo elemento; apesar de percorrer sequencialmente a lista (da frente para trás
 * ou vice-versa, dependendo do que for mais próximo);
 * mantém a mesma ordem da inserção; para usar uma pesquisa binária (muito mais rápida que a linear),
 * com o método estático Collections.binarySearch(lista), os elementos deverão estar ordenados.
 
 * <p>
 * <b> TreeSet </b> - não aceita elementos repetidos; mantém os elementos
 * ordenados a cada inserção, possui busca rápida; é ruim para acessar os
 * elementos sequencialmente
 * 
 * <p>
 * Estas classes de coleções foram encapsuladas em outras classes para facilitar o seu uso
 * <p>
 * Os objetos são depois gravados em disco através da serialização.
 * <p>
 * Tipos primitivos só podem ser inseridos em coleções por intermédio de
 * classes wrapper (em versões mais recente do Java é possível inserir tipos primitivos)
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
          	System.out.println("Arquivo não encontrado");
    	}
		catch(IOException e) {
          	System.out.println("Problemas na leitura ou gravação do arquivo");
		}
    	catch(ClassNotFoundException e) {
          	System.out.println("Classe inexistente usada na conversão");
    	}
	}
}
