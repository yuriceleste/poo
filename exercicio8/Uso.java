package exercicio8;

import java.util.Scanner;

public class Uso {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ContaBancaria conta = new ContaBancaria();
		ContaBancaria conta2 = new ContaBancaria();
		int cont = 0, menu;
		double saldo;
		String nomeCorrentista = "";
		
		while(cont != 3){
			try{
				System.out.println("   => Conta 1 ");
				System.out.print("     => Nome Correntista: ");
				nomeCorrentista = new Scanner(System.in).nextLine();  
			    System.out.print("     => Saldo: R$");
			    saldo = new Scanner(System.in).nextDouble();   
			    conta.setConta(nomeCorrentista,saldo);
			    
			    System.out.println("");
			    System.out.println("   => Conta 2 ");
			    System.out.print("     => Nome Correntista: ");
			    nomeCorrentista = new Scanner(System.in).nextLine();  
			    System.out.print("      => Saldo: R$");
			    saldo = new Scanner(System.in).nextDouble();   
			    conta2.setConta(nomeCorrentista,saldo);
				
				break;
			}
			catch(Exception e){
				cont ++;
				System.out.println("\n       ! Conta inválida !\n");
				conta = new ContaBancaria();
			}
		}
		
		//Teste para os demais métodos utilizados 
		System.out.println("\n==================== Contas ====================");
		System.out.println("    => Conta 1: "+conta.toString(conta.getNomeCorrentista(),conta.getSaldo())+"\n");
		System.out.println("    => Conta 2: "+conta2.toString(conta2.getNomeCorrentista(),conta2.getSaldo())+"\n");
		System.out.println("    As duas datas são iguais? "+ conta.equals(conta2)+"\n");
		System.out.println("    Compara Datas: "+ conta.compareTo(conta2)+"\n");
		
		if(cont != 3) {
			cont = 0;
			while(cont != 3){
				try{
					System.out.println("=========== APLICAÇÃO DE JUROS ============");
					System.out.print("    => Informe o número da Conta a ser aplicado o Juros: ");
					menu = new Scanner(System.in).nextInt();
					if( menu == 1 ) {
						conta.setAplica_Juros();
					}
					if( menu == 2 ) {
						conta2.setAplica_Juros();
					}
					break;
				}
				catch(Exception e){
					cont ++;
					System.out.println("\n       ! Conta inválida !\n");
				}
			}
			
			System.out.println("\n    => Conta 1: "+conta.toString(conta.getNomeCorrentista(),conta.getSaldo())+"\n");
			System.out.println("    => Conta 2: "+conta2.toString(conta2.getNomeCorrentista(),conta2.getSaldo())+"\n");
			
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