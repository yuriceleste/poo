package aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import prova2.*;

/**
 * <p>
 * <b> Coleções usadas: LinkedList e TreeSet </b>
 * 
 * <p>
 * A classe uso permite cadastrar adequadamente os itens de agenda, armazenar em disco, recuperar a agenda por completo.
 * Além disso, é possível gerar relatórios tais como todos os itens agendados, especificar os itens entre datas,
 * listar as metas ordenadas pela sua prioridade, listar os lembretes em ordem de minutos de antecedência do alerta e
 * listar todos os eventos por ordem alfabética da localização.
 * <p>
 * Os objetos podem ser gravados em disco através de arquivo
 *
 * @author Yuri Celeste Pulier
 * @version 1.0 (junho-2019)
 *
 */

public class Uso {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Agenda itens = new Agenda();
		int menu = 1, diaInicio, mesInicio, anoInicio, diaFim, mesFim, anoFim, 
				horaInicio, minInicio, segInicio, horaFim ,minFim,segFim;
		int prioridade, min_antecedencia;
		String registro, descricao, local;
		Data dataInicio, dataFim;
		Horario horarioInicio, horarioFim;
		Periodo periodo = null;
		Meta meta = null;
		Evento evento = null;
		Lembrete lembrete = null;
		
		
		System.out.println("====================== AGENDA ======================");
		while (menu != 0) {
			System.out.println("\n 1. Adicionar uma meta\n 2. Adicionar um evento\n 3. Adicionar um lembrete\n"
					+ " 4. Exibir Agenda completa\n 5. Exibir itens da agenda em um intervalo de datas\n"
					+ " 6. Exibir metas por ordem de prioridade\n 7. Exibir lembretes por minutos de antecedencia\n"
					+ " 8. Exibir eventos por ordem de local\n 9. Salvar agenda em disco\n 10. Recuperar agenda do disco\n"
					+ " 0. Sair: ");
			System.out.print("\n  Opção: ");
			menu = new Scanner(System.in).nextInt();
			System.out.println();
			if (menu == 1) {
				System.out.print("  => Nome Meta: ");
				registro = new Scanner(System.in).nextLine();
				System.out.print("  => Descricao Meta: ");
				descricao = new Scanner(System.in).nextLine();
				while (true) {
					try {
						while (true) {
							System.out.println("  => Data Inicio Meta");
							System.out.print("    Dia: ");
							diaInicio = new Scanner(System.in).nextInt();
							System.out.print("    Mes: ");
							mesInicio = new Scanner(System.in).nextInt();
							System.out.print("    Ano: ");
							anoInicio = new Scanner(System.in).nextInt();
							try {
								dataInicio = new Data(diaInicio,mesInicio,anoInicio);
								break;
							} catch (Exception e) {
								System.out.println("Data invalida.");
							}
						}
						while (true) {
							System.out.println("  => Horário Inicio Meta");
							System.out.print("    Horas: ");
							horaInicio = new Scanner(System.in).nextInt();
							System.out.print("    Minutos: ");
							minInicio = new Scanner(System.in).nextInt();
							System.out.print("    Segundos: ");
							segInicio = new Scanner(System.in).nextInt();
							try {
								horarioInicio = new Horario(horaInicio,minInicio,segInicio);
								break;
							} catch (Exception e) {
								System.out.println("Horario invalido.");
							}
						}
						while (true) {
							System.out.println("  => Data Término Meta");
							System.out.print("    Dia: ");
							diaFim = new Scanner(System.in).nextInt();
							System.out.print("    Mes: ");
							mesFim = new Scanner(System.in).nextInt();
							System.out.print("    Ano: ");
							anoFim = new Scanner(System.in).nextInt();
							try {
								dataFim = new Data(diaFim,mesFim,anoFim);
								break;
							} catch (Exception e) {
								System.out.println("Data invalida.");
							}
						}
						while (true) {
							System.out.println("  => Horário Término Meta");
							System.out.print("    Horas: ");
							horaFim = new Scanner(System.in).nextInt();
							System.out.print("    Minutos: ");
							minFim = new Scanner(System.in).nextInt();
							System.out.print("    Segundos: ");
							segFim = new Scanner(System.in).nextInt();
							try {
								horarioFim = new Horario(horaFim,minFim,segFim);
								break;
							} catch (Exception e) {
								System.out.println("Horario invalido.");
							}
						}
						periodo = new Periodo(dataInicio,horarioInicio,dataFim,horarioFim);
						// Caso dê erro no período, vai pular para o catch e não instanciar new Meta
						while (true) {
							System.out.print("  => Prioridade Meta (1-5): ");
							prioridade = new Scanner(System.in).nextInt();
							try {
								meta = new Meta(registro, descricao, periodo, prioridade);
								break;
							} catch (Exception e) {
								System.out.println("Valor invalido.");
							}
						}
						itens.insereItem(meta);
						System.out.println("Operação realizada com sucesso!\n");
						break;
					}catch (Exception e){
						System.out.println("Período inválido (Data ou Horario inicial menor que a data ou horario final).");
					}
				}
			}
			
			if (menu == 2) {
				System.out.print("  => Nome Evento: ");
				registro = new Scanner(System.in).nextLine();
				System.out.print("  => Descrição Evento: ");
				descricao = new Scanner(System.in).nextLine();
				System.out.print("  => Local Evento: ");
				local = new Scanner(System.in).nextLine();
				while (true) {
					try {		
						while (true) {
							System.out.println("  => Data Início Evento");
							System.out.print("    Dia: ");
							diaInicio = new Scanner(System.in).nextInt();
							System.out.print("    Mes: ");
							mesInicio = new Scanner(System.in).nextInt();
							System.out.print("    Ano: ");
							anoInicio = new Scanner(System.in).nextInt();
							try {
								dataInicio = new Data(diaInicio,mesInicio,anoInicio);
								break;
							} catch (Exception e) {
								System.out.println("Data invalida.");
							}
						}
						while (true) {
							System.out.println("  => Horário Início Evento");
							System.out.print("    Horas: ");
							horaInicio = new Scanner(System.in).nextInt();
							System.out.print("    Minutos: ");
							minInicio = new Scanner(System.in).nextInt();
							System.out.print("    Segundos: ");
							segInicio = new Scanner(System.in).nextInt();
							try {
								horarioInicio = new Horario(horaInicio,minInicio,segInicio);
								break;
							} catch (Exception e) {
								System.out.println("Horario invalido.");
							}
						}
						while (true) {
							System.out.println("  => Data Término Evento");
							System.out.print("    Dia: ");
							diaFim = new Scanner(System.in).nextInt();
							System.out.print("    Mes: ");
							mesFim = new Scanner(System.in).nextInt();
							System.out.print("    Ano: ");
							anoFim = new Scanner(System.in).nextInt();
							try {
								dataFim = new Data(diaFim,mesFim,anoFim);
								break;
							} catch (Exception e) {
								System.out.println("Data invalida.");
							}
						}
						while (true) {
							System.out.println("  => Horário Término Evento: ");
							System.out.print("    Horas: ");
							horaFim = new Scanner(System.in).nextInt();
							System.out.print("    Minutos: ");
							minFim = new Scanner(System.in).nextInt();
							System.out.print("    Segundos: ");
							segFim = new Scanner(System.in).nextInt();
							try {
								horarioFim = new Horario(horaFim,minFim,segFim);
								break;
							} catch (Exception e) {
								System.out.println("Horario inválido.");
							}
						}
						periodo = new Periodo(dataInicio,horarioInicio,dataFim,horarioFim);
						// Caso dê erro no período, vai pular para o catch e não instanciar new Evento
						evento = new Evento(registro, descricao, periodo, local);
						itens.insereItem(evento);
						System.out.println("Operação realizada com sucesso!\n");
						break;
					}catch (Exception e){
						System.out.println("Período inválido (Data ou Horario inicial menor que a data ou horario final).");
					}
				}
			}
			
			if (menu == 3) {
				System.out.print("  => Nome Lembrete: ");
				registro = new Scanner(System.in).nextLine();
				System.out.print("  => Descrição Lembrete: ");
				descricao = new Scanner(System.in).nextLine();
				while (true) {
					try {
						while (true) {
							System.out.println("  => Data Início Lembrete");
							System.out.print("    Dia: ");
							diaInicio = new Scanner(System.in).nextInt();
							System.out.print("    Mes: ");
							mesInicio = new Scanner(System.in).nextInt();
							System.out.print("    Ano: ");
							anoInicio = new Scanner(System.in).nextInt();
							try {
								dataInicio = new Data(diaInicio,mesInicio,anoInicio);
								break;
							} catch (Exception e) {
								System.out.println("Data invalida.");
							}
						}
						while (true) {
							System.out.println("  => Horário Início Lembrete");
							System.out.print("    Horas: ");
							horaInicio = new Scanner(System.in).nextInt();
							System.out.print("    Minutos: ");
							minInicio = new Scanner(System.in).nextInt();
							System.out.print("    Segundos: ");
							segInicio = new Scanner(System.in).nextInt();
							try {
								horarioInicio = new Horario(horaInicio,minInicio,segInicio);
								break;
							} catch (Exception e) {
								System.out.println("Horario invalido.");
							}
						}
						while (true) {
							System.out.println("  => Data Término Lembrete");
							System.out.print("    Dia: ");
							diaFim = new Scanner(System.in).nextInt();
							System.out.print("    Mes: ");
							mesFim = new Scanner(System.in).nextInt();
							System.out.print("    Ano: ");
							anoFim = new Scanner(System.in).nextInt();
							try {
								dataFim = new Data(diaFim,mesFim,anoFim);
								break;
							} catch (Exception e) {
								System.out.println("Data invalida.");
							}
						}
						while (true) {
							System.out.println("  => Horário Término Lembrete");
							System.out.print("    Horas: ");
							horaFim = new Scanner(System.in).nextInt();
							System.out.print("    Minutos: ");
							minFim = new Scanner(System.in).nextInt();
							System.out.print("    Segundos: ");
							segFim = new Scanner(System.in).nextInt();
							try {
								horarioFim = new Horario(horaFim,minFim,segFim);
								break;
							} catch (Exception e) {
								System.out.println("Horario invalido!!");
							}
						}
						periodo = new Periodo(dataInicio,horarioInicio,dataFim,horarioFim);
						// Caso dê erro no período, vai pular para o catch e não instanciar new Evento
						while (true) {
							System.out.print("  => Minutos Antecedência: ");
							min_antecedencia = new Scanner(System.in).nextInt();
							try {
								lembrete = new Lembrete(registro, descricao, periodo, min_antecedencia);
								break;
							} catch (Exception e) {
								System.out.println("Valor invalido.");
							}
						}
						itens.insereItem(lembrete);
						System.out.println("Operação realizada com sucesso!\n");
						break;
					} catch (Exception e) {
						System.out.println("Período inválido (Data ou Horario inicial menor que a data ou horario final).");
					}
				}
			}
			
			if (menu == 4) {
				System.out.println(itens.getItens());
			}
			
			if (menu == 5) {
				while (true) {
					while (true) {
						System.out.println("  => Data Inicial Intervalo: ");
						System.out.print("    Dia: ");
						diaInicio = new Scanner(System.in).nextInt();
						System.out.print("    Mes: ");
						mesInicio = new Scanner(System.in).nextInt();
						System.out.print("    Ano: ");
						anoInicio = new Scanner(System.in).nextInt();
						try {
							dataInicio = new Data(diaInicio,mesInicio,anoInicio);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida.");
						}
					}
					while (true) {
						System.out.println("  => Data Final Intervalo ");
						System.out.print("    Dia: ");
						diaFim = new Scanner(System.in).nextInt();
						System.out.print("    Mes: ");
						mesFim = new Scanner(System.in).nextInt();
						System.out.print("    Ano: ");
						anoFim = new Scanner(System.in).nextInt();
						try {
							dataFim = new Data(diaFim,mesFim,anoFim);
							break;
						} catch (Exception e) {
							System.out.println("Data invalida.");
						}
					}
					if (dataInicio.compareTo(dataFim) == 1) {
						System.out.println("A Data Inicial deve ser anterior a Data Final.");
					}
					else {
						break;
					}
				}
				System.out.println(itens.relatorioItensInterDatas(dataInicio, dataFim).toString());
			}
			
			if (menu == 6) {
				System.out.println(itens.relatorioMetas());
			}
			
			if (menu == 7) {
				System.out.println(itens.relatorioLembretes());
			}
			
			if (menu == 8) {
				System.out.println(itens.relatorioEventos());
			}
			
			if (menu == 9) {
				try {
					BufferedWriter arqSaida;
					arqSaida = new BufferedWriter(new FileWriter("arquivo_de_saida.txt"));  
					arqSaida.write(itens.toString()+"\r\n");
					arqSaida.close();
					System.out.println("Operação realizada com sucesso!\n");
					
				} catch(FileNotFoundException e) {
					System.out.println("Arquivo não encontrado");
				}
				catch(IOException e) {
					System.out.println("Problemas na leitura ou gravação do arquivo");
				}
				catch (Exception e) {
					e.getMessage();
				}
			}
			
			if (menu == 10) {
				try {
					BufferedReader arqEnt;
					arqEnt = new BufferedReader(new FileReader("arquivo_de_saida.txt"));
					int i;    
			          while((i=arqEnt.read())!=-1)    
			          System.out.print((char)i);    
			          arqEnt.close();
					
				} catch(FileNotFoundException e) {
					System.out.println("Arquivo não encontrado");
				}
				catch(IOException e) {
					System.out.println("Problemas na leitura ou gravação do arquivo");
				}
				catch (Exception e) {
					e.getMessage();
				}
			}
			
			if (menu == 0) {
				break;
			}
			if(menu < 0  ||  menu > 10) {
				System.out.println("Opcao invalida.\n");
			}
		}
	}
}
