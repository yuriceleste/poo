package exercicio24;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


		// OK


/**
 * Oferece m�todos est�ticos de grava��o e leitura de objetos no disco
 * atrav�s de serializa��o.
 *
  * @author Yuri Celeste Pulier
  * @version 1.0 (junho-2019)
*/
public abstract class Arquivo {
	/**
	 * Realiza grava��o de um objeto no disco
	 * @param _nomeArquivo nome do arquivo que ser� criado na grava��o
	 * @param _objeto inst�ncia que ser� gravada no arquivo
	 * @exception IOException problemas na cria��o do arquivo ou grava��o
	*/
	public static void grava(String _nomeArquivo, Object _objeto) throws IOException {	
		ObjectOutputStream buffer = new ObjectOutputStream(new FileOutputStream(_nomeArquivo));
		buffer.writeObject(_objeto.toString());
		buffer.close();
		
	}
	
	/**
	 * Realiza grava��o de um objeto num arquivo .txt
	 * @param _objeto inst�ncia que ser� gravada no arquivo
	 * @exception IOException problemas na cria��o do arquivo ou grava��o
	*/
	public static void gravaTxt(Object _objeto) throws IOException {
		BufferedWriter arqSaida;
		arqSaida = new BufferedWriter(new FileWriter("arquivo_de_saida.txt"));
		arqSaida.write(_objeto.toString());
		arqSaida.close();
	}
	
	/**
	 * Realiza leitura de um objeto no arquivo
	 * @param _nomeArquivo nome do arquivo a ser lido
	 * @return retorna uma inst�ncia da classe Object lida do arquivo
	 * @exception IOException problemas na leitura do arquivo
	 * @exception ClassNotFoundException problemas na convers�o do objeto lido
	 */
	public static Object le(String _nomeArquivo) throws IOException, ClassNotFoundException  {
		ObjectInputStream buffer = new ObjectInputStream(new FileInputStream(_nomeArquivo));
		Object _objeto = buffer.readObject(); 
		buffer.close();
		return _objeto;
	}
}
