package exercicio19;

public interface Escalavel {
	/**
   	 * O método amplia modifica os campos do objeto para alterar o seu tamanho.
   	 * @param escala a escala para modificação do objeto
	 * @throws Exception 
   	 */
   	void amplia(double escala) throws Exception;
 
   	/**
   	 * O método espelha modifica os campos do objeto para alterar a sua posição (fazendo
   	 * com que o objeto fique refletido nas suas coordenadas horizontais)
   	 * @throws Exception 
   	 */
   	void espelha() throws Exception;
}
