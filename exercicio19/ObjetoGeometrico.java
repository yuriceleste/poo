package exercicio19;

public interface ObjetoGeometrico {

   	Ponto centro() throws Exception;
 
   	double calculaÁrea();
 
   	double calculaPerímetro();
   	
   	ObjetoGeometrico clona() throws Exception;
   	
}
