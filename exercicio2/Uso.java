package exercicio2;

import java.util.Scanner;

public class Uso {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Data date = new Data();
		Data date2 = new Data();
		int cont = 0, menu;
		int dia = 0, mes = 0, ano= 0;
		Data data_verificada = null;
		String mes_extenso="";
		
		System.out.println("=============================== MENU ===============================\n");
		System.out.println("  1. Tres Inteiros (dd/mm/aaaa);");
		System.out.println("  2. Dois Inteiros (mm/aaaa);");
		System.out.println("  3. String;");
		System.out.println("  4. Dois Inteiros e Uma String (dd/mes_extenso/aaaa);");
		System.out.println("  0. Sair;");
		System.out.print("\n  Opção: ");
		menu = new Scanner(System.in).nextInt(); 
		System.out.println("");
		 
		while(menu!=0) {
			if(menu>4 || menu<0) {
				break;
			}
			while(cont != 3){
				try{
					if(menu==1) {
						System.out.print("    => Dia: ");
					    dia = new Scanner(System.in).nextInt();  
					    System.out.print("    => Mes: ");
					    mes = new Scanner(System.in).nextInt();  
					    System.out.print("    => Ano: ");
					    ano = new Scanner(System.in).nextInt();  
					    date.setData(dia,mes,ano);
					   //Para teste do compareTo() uma segunda data será criada
					    System.out.println("\n   Segunda Data: \n");
					    System.out.print("    => Dia: ");
					    dia = new Scanner(System.in).nextInt();  
					    System.out.print("    => Mes: ");
					    mes = new Scanner(System.in).nextInt();  
					    System.out.print("    => Ano: ");
					    ano = new Scanner(System.in).nextInt();  
					    date2.setData(dia,mes,ano);
					}
					if(menu==2) {
						System.out.print("    => Mes: ");
					    mes = new Scanner(System.in).nextInt();  
					    System.out.print("    => Ano: ");
					    ano = new Scanner(System.in).nextInt();
					    date.setData(mes,ano);
					}
					if(menu==3) {
						System.out.print("    => Data: ");
					    date.setData(new Scanner(System.in).nextLine()); 
					}
					if(menu==4) {
						System.out.print("    => Dia: ");
					    dia = new Scanner(System.in).nextInt();  
					    System.out.print("    => Mes Extenso: ");
					    mes_extenso = new Scanner(System.in).next();  
					    System.out.print("    => Ano: ");
					    ano = new Scanner(System.in).nextInt();  
					    date.setData(dia,mes_extenso,ano); 
					}
					
					data_verificada = Data.verificaECriaData(date.getDia(),date.getMes(),date.getAno());
				    //System.out.print("Entre com a segunda data: ");
					//date2.setData(new Scanner(System.in).nextLine()); 
					
					break;
				}
				catch(Exception e){
					cont ++;
					System.out.println("\n       ! Data inválida !\n");
					date = new Data();
				}
			}
			
			// Teste da função verificaECriaData()
			
			//Teste para toString(), setData(), data() e demais métodos utilizados 
			System.out.println("\n    => Data: "+date.toString()+"\n");
			//System.out.println("    => Data 2: "+date2.toString()+"\n");
			//System.out.println("    As duas datas são iguais? "+ date.equals(date2)+"\n");
			System.out.println("    Compara Datas: "+ date.compareTo(date2)+"\n");
			System.out.println("\n    => Data Verificada: "+data_verificada.toString()+"\n");
			System.out.println("    => Data Incrementada: "+date.incrementa()+"\n");

			System.out.println("\n=============================== MENU ===============================\n");
			System.out.println("  1. Tres Inteiros (dd/mm/aaaa);");
			System.out.println("  2. Dois Inteiros (mm/aaaa);");
			System.out.println("  3. String (dd/mm/aaaa) ou (d/m/aaaa);");
			System.out.println("  4. Dois Inteiros e Uma String (dd/mes_extenso/aaaa);");
			System.out.println("  0. Sair;");
			System.out.print("\n  Opção: ");
			menu = new Scanner(System.in).nextInt();
			System.out.println("");
			
		}
		
		System.out.print("\n      Saindo");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");	
		Thread.sleep(300);
		System.out.println("\n\n=======================================================================");
	}
	
}