package exercicio14;

import java.util.Scanner;

public class Uso {
	public static void main(String args[]) throws Exception {
		final int QTDE = 50;

		// vetor capaz de armazenar QTDE objetos de Cliente
		Cliente vetor[] = new Cliente[QTDE];
		// variaveis auxiliares e temporarias
		String nome, email, celular, endereco;
		double rendaFamiliar;
		int opcao;
		
		for(int i=0; i < QTDE; i++) {
			System.out.print("\nCadastro: " + (i+1) + "\n (1) Cliente\n (2) Contato\n\n  Opcao: ");
			opcao = new Scanner(System.in).nextInt();
			try {
				switch(opcao) {
				case 1: 
					System.out.print("\n  Nome: ");
					nome = new Scanner(System.in).next();
					System.out.print("  Email: ");
					email = new Scanner(System.in).next();
					System.out.print("  Celular: ");
					celular = new Scanner(System.in).next();
					System.out.print("  Endereco: ");
					endereco = new Scanner(System.in).next();
					System.out.print("  Renda Familiar: ");
					rendaFamiliar = new Scanner(System.in).nextDouble();
					vetor[i] = new Cliente(nome, email, celular, endereco, rendaFamiliar );
					break;
				case 2: 
					System.out.print("\n  Nome: ");
					nome = new Scanner(System.in).next();
					System.out.print("  Email: ");
					email = new Scanner(System.in).next();
					vetor[i] = new Cliente(nome, email, "", "", 0.0);
					break;
				default:
					i--;
					continue;
				}
			}
			// se houver algum erro
			catch(Exception e) {
				System.out.println(e);
				i--;
				continue;
			}
		}
		
		// chamada polimorfica do metodo toString
		for(int i=0; i < QTDE; i++) {
			System.out.println("\n" + vetor[i].toString());
		}
	

	}
}
