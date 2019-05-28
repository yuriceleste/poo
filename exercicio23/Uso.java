package exercicio23;

import java.util.*;

public class Uso {
	public static void main(String[] args) throws Exception {
		int i, cont;
		String texto = "eu gosto de poo";
		String[] palavras = texto.split(" ");
				
		
		// EXERCICIO A
		Set<String> palavrasOrdenadas = new TreeSet<String>();
		
		for(i=0; i<palavras.length; i++) {
			palavrasOrdenadas.add(palavras[i]);
		}
		
		System.out.print("Palavras Ordenadas......: "+palavrasOrdenadas);
		
		
		// EXERCICIO B
		System.out.print("\n");
		
		Map<String,Integer> frequenciaPalavra = new HashMap<String,Integer>();
		
		for(i=0; i<palavras.length; i++) {
			if(frequenciaPalavra.containsKey(palavras[i])) {
				cont = frequenciaPalavra.get(palavras[i]);
				frequenciaPalavra.put(palavras[i], cont + 1);
			}else {
				frequenciaPalavra.put(palavras[i], 1);
			}
		}	
		
		System.out.print("Frequencia..............: "+frequenciaPalavra);
		
		
		// EXERCICIO C
		System.out.print("\n");
		
		List<String> textoDesordenado = new LinkedList<String>();
		
		for(i=0; i<palavras.length; i++) {
			textoDesordenado.add(palavras[i]);
		}
		
		Collections.shuffle(textoDesordenado);
		
		System.out.print("Texto Desordenadas......: "+textoDesordenado);
		
		
		// EXERCICIO D
		System.out.print("\n");
		
		Random gerador = new Random();
		TreeSet<Integer> ordenarNumeros = new TreeSet<Integer>();
		int aux;
		for(i=0; i<20; i++) {
			aux = (gerador.nextInt(49) + 1);
			if(ordenarNumeros.contains(aux)==false) {
				ordenarNumeros.add(aux);
			}else {
				i--;
			}
		}
		
		System.out.print("Numeros Ordenados.......: "+ordenarNumeros);
		
		
		// EXERCICIO E
		System.out.print("\n");
		String nomes = "Yuri Diogenes Yuri Ayrton Victor Douglas Mycon Yuri Ayrton";
		String[] vetorNome = nomes.split(" ");
	
		cont = 0;
		
		Map<String,Integer> nomesOrdenados = new TreeMap<String,Integer>();
		
		for(i=0; i<vetorNome.length; i++) {
			if(nomesOrdenados.containsKey(vetorNome[i])) {
				cont = nomesOrdenados.get(vetorNome[i]);
				nomesOrdenados.put(vetorNome[i], cont + 1);
			}else {
				nomesOrdenados.put(vetorNome[i], 1);
			}
		}	
		 
		System.out.print("Nomes Ordenados.........: "+nomesOrdenados);
		
		/*Saida*/
		System.out.print("\n\n\n      Saindo");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");	
		Thread.sleep(300);
		System.out.println("\n\n=========================================================================================================");
	}
	
	
	
}
