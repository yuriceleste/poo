package exercicio19;

public interface ObjetoGeometrico {

   	Ponto centro() throws Exception;
 
   	double calcula�rea();
 
   	double calculaPer�metro();
   	
   	ObjetoGeometrico clona() throws Exception;
   	
}
