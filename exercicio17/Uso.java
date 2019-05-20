package exercicio17;

import java.util.Scanner;

public class Uso {
	public static void main(String args[]) throws Exception {
		final int QTDE = 3;
		
		Circulo vetorC[] = new Circulo[QTDE];
		Retangulo vetorR[] = new Retangulo[QTDE];
		Quadrado vetorQ[] = new Quadrado[QTDE];
		
		double a1, a2, raio, comprimento, largura, espessura;
		boolean solido;
		int opcao;

		for(int i=0; i < QTDE; i++) {
			System.out.println("\nCadastro: " + (i+1) + "\n(1)Circulo, (2)Quadrado, (3)Retangulo: ");
			opcao = new Scanner(System.in).nextInt();

			try {
				switch(opcao) {
				case 1: 
					System.out.print("Coordenada 1: ");
					a1 = new Scanner(System.in).nextDouble();
					System.out.print("Coordenada 2: ");
					a2 = new Scanner(System.in).nextDouble();
					System.out.print("Raio: ");
					raio = new Scanner(System.in).nextDouble();
					System.out.print("Espessura: ");
					espessura = new Scanner(System.in).nextDouble();
					System.out.print("Solido: ");
					solido = new Scanner(System.in).nextBoolean();
					vetorC[i] = new Circulo(a1, a2, raio, espessura, solido);
					break;
				case 2: 
					System.out.print("Coordenada 1: ");
					a1 = new Scanner(System.in).nextDouble();
					System.out.print("Coordenada 2: ");
					a2 = new Scanner(System.in).nextDouble();
					System.out.print("Comprimento: ");
					comprimento = new Scanner(System.in).nextDouble();
					System.out.print("Espessura: ");
					espessura = new Scanner(System.in).nextDouble();
					System.out.print("Solido: ");
					solido = new Scanner(System.in).nextBoolean();
					vetorQ[i] = new Quadrado(a1, a2, comprimento, espessura, solido);
					break;
				case 3: 
					System.out.print("Coordenada 1: ");
					a1 = new Scanner(System.in).nextDouble();
					System.out.print("Coordenada 2: ");
					a2 = new Scanner(System.in).nextDouble();
					System.out.print("Comprimento: ");
					comprimento = new Scanner(System.in).nextDouble();
					System.out.print("Largura: ");
					largura = new Scanner(System.in).nextDouble();
					System.out.print("Espessura: ");
					espessura = new Scanner(System.in).nextDouble();
					System.out.print("Solido: ");
					solido = new Scanner(System.in).nextBoolean();
					vetorR[i] = new Retangulo(a1, a2, comprimento, largura, espessura, solido);
					break;
				default:
					i--;
					continue;
				}
			}
			catch(Exception e) {
				System.out.println(e);
				i--;
				continue;
			}
		}

		// chamada polimorfica do metodo calcular perimetro e area 
		for(int i=0; i < QTDE; i++) {
			vetorC[i].perimetroCirculo();
			vetorC[i].areaCirculo();
			vetorQ[i].perimetroQuadrado();
			vetorQ[i].areaQuadrado();
			vetorR[i].perimetroRetangulo();
			vetorR[i].areaRetangulo();
		}
		
	}
}
