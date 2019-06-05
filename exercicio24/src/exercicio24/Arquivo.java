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
 * Oferece métodos estáticos de gravação e leitura de objetos no disco
 * através de serialização.
 *
  * @author Yuri Celeste Pulier
  * @version 1.0 (junho-2019)
*/
public abstract class Arquivo {
	/**
	 * Realiza gravação de um objeto no disco
	 * @param _nomeArquivo nome do arquivo que será criado na gravação
	 * @param _objeto instância que será gravada no arquivo
	 * @exception IOException problemas na criação do arquivo ou gravação
	*/
	public static void grava(String _nomeArquivo, Object _objeto) throws IOException {	
		ObjectOutputStream buffer = new ObjectOutputStream(new FileOutputStream(_nomeArquivo));
		buffer.writeObject(_objeto.toString());
		buffer.close();
		
	}
	
	/**
	 * Realiza gravação de um objeto num arquivo .txt
	 * @param _objeto instância que será gravada no arquivo
	 * @exception IOException problemas na criação do arquivo ou gravação
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
	 * @return retorna uma instância da classe Object lida do arquivo
	 * @exception IOException problemas na leitura do arquivo
	 * @exception ClassNotFoundException problemas na conversão do objeto lido
	 */
	public static Object le(String _nomeArquivo) throws IOException, ClassNotFoundException  {
		ObjectInputStream buffer = new ObjectInputStream(new FileInputStream(_nomeArquivo));
		Object _objeto = buffer.readObject(); 
		buffer.close();
		return _objeto;
	}
}
