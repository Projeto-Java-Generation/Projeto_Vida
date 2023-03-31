package projetoJavaGrupo;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class menu {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String[] Produtos = { "Cesta Básica", "Agasalho", "Agua" };
		String zona = "1 - Zona Leste\n2 - Zona Oeste\n3 - Zona Sul\n4 - Zona Norte";
		String nome, tel, doc, localizacao = "";

		int[] quantidade = new int[Produtos.length];
		for (int i = 0; i < Produtos.length; i++) {
			quantidade[i] = (int) (Math.random() * 10.0);
		}
		int idProduto = 0, quant = 0;
		int opcao, localb, continuarCaseI;

		boolean continuar = true, continuarCaseB = true;

		List<Ong> ongs = new ArrayList<Ong>();
		List<Estoque> estoqueOng = new ArrayList<Estoque>();
		estoqueOng.add(new Estoque("Cesta Básica", 5));

		System.out.println(Cor.TEXT_BLUE_BOLD
				+ "                                                                                  ");
		System.out.println("                                                                                 ");
		System.out.println("          GYG#&                                                                  ");
		System.out.println("           G??JYPB    &                                                          ");
		System.out.println("            #Y????YP# #B#&                                                       ");
		System.out.println("              5?????JYG##GG#                                                     ");
		System.out.println("               GJ???JJJJ5B#GPG#                                                  ");
		System.out.println("                 #GYJ??JJJYPB#P5G&                                               ");
		System.out.println("                  &##BPYJJJJJP#&G55B&                                            ");
		System.out.println("                  &PJ5GBGPYJJJJP& #P5PB&            &&##B#&&&               &&&#&");
		System.out.println("                    #Y??JYPGG5YJJ5# &B55P#       &#&BGGGPPPGGBB& &&&###BBGGBB##& ");
		System.out.println("                      GJ???JYPBBPYJ5#  &G55#   #G55PG#  && &    &GPGGGB##&       ");
		System.out.println("                       &G5YJ??JYPBBG5P# #&#G# BY5PB##&#GPBBPGGB  &B#             ");
		System.out.println("                         &PGGP5YJJYG##GG#GPB&&G#&#BPGB5#P5PPB& &BG#              ");
		System.out.println("                          BJJ5PGBGP5Y5GB  #PYG#G55YG#55G#P#&&BGPB&               ");
		System.out.println("                           &5???JY5GGBGPPG# #YYYYYG&555P   B5PP&                 ");
		System.out.println("                             BGP555YYY5PGBBB #YYYG PY55#   B5P&                  ");
		System.out.println("                      &#BB#    #PPPPGGGGGGGB  #YP G5PBB&   PP&                   ");
		System.out.println("      &&&&         &5J77JG& #GB#&BGPPP555GB&   GB BBGP5G   G#                    ");
		System.out.println("  BJ& #GP5YJJJY5GB  BGGB  #5????JYYY5PG# &   #5Y& GYY5Y5                         ");
		System.out.println("&#5!7P &B##BGGBBGGP5YP  GJ?7?????JYPPGGPYJB#5JJG GYYY5G&                         ");
		System.out.println("#B#&&#  G?!JB B?!!7JB#P?777??J5PGGP5JJ??JJ#PJ5# GYYYP&                           ");
		System.out.println("   #BPP& YG  BYPG#& PJY5PG##&  #P5YJJJY5PG BB#GYJYP&                             ");
		System.out.println(" &Y7?5#  &     #B        &##        &##B& &B5Y5PB&                               ");
		System.out.println("  #    PJ5B&G5YYBB55Y5YJJ5B& &#BGP5YJY5B&BGB#&                                   ");
		System.out.println("    &##GG#&##&  57!!77?JP&   ########&                                           ");
		System.out.println("    &BGPY5B   #Y???77?P#                                                         ");
		System.out.println("            #J~~~!7JG                                                            ");
		System.out.println("          BY!7J5G#&                                                              ");
		System.out.println("         &GB&                                                                    \n");

		// System.out.println(Cor.TEXT_GREEN_BOLD+
		// "===============================================================================================");
		System.out.println(Cor.TEXT_GREEN_BOLD +

				"  8888888b.                     d8b          888            888     888 d8b      888           ");
		System.out.println(
				"  888   Y88b                    Y8P          888            888     888 Y8P      888           ");
		System.out.println(
				"  888    888                                 888            888     888          888           ");
		System.out.println(
				"  888   d88P 888d888  .d88b.   8888  .d88b.  888888  .d88b. Y88b   d88P 888  .d88888  8888b.   ");
		System.out.println(
				"  8888888P   888P    d88  88b   888 d8P  Y8b 888    d88  88b Y88b d88P  888 d88  888      88b  ");
		System.out.println(
				"  888        888     888  888   888 88888888 888    888  888  Y88o88P   888 888  888 .d888888  ");
		System.out.println(
				"  888        888     Y88..88P   888 Y8b.     Y88b.  Y88..88P   Y888P    888 Y88b 888 888  888  ");
		System.out.println(
				"  888        888       Y88P     888   Y8888    Y888   Y88P      Y8P     888   Y88888  Y888888  ");
		System.out.println(
				"                                888                                                            ");
		System.out.println(
				"                               d88P                                                            ");
		System.out.println(
				"                             888P                                                              ");
		System.out.println(
				"===============================================================================================");

		System.out.println(Cor.TEXT_WHITE_UNDERLINED + "\nDigite seu nome:" + Cor.ANSI_RESET + Cor.TEXT_RESET);

		nome = leia.nextLine();

		System.out.println(Cor.TEXT_WHITE_UNDERLINED + "\nDigite o nº do documento de identidade:" + Cor.ANSI_RESET
				+ Cor.TEXT_RESET);

		doc = leia.nextLine();

		System.out.println(Cor.TEXT_WHITE_UNDERLINED + "\nDigite o nº do telefone:" + Cor.ANSI_RESET + Cor.TEXT_RESET);

		tel = leia.nextLine();
		do {
			System.out.println("\n" + zona);

			System.out
					.println(Cor.TEXT_WHITE_UNDERLINED + "\nEscolha sua localização" + Cor.ANSI_RESET + Cor.TEXT_RESET);

			/*
			 * System.out.println(Cor.
			 * TEXT_WHITE+"\nDigite seu nome:                                   "+Cor.
			 * TEXT_RESET);
			 * nome = leia.nextLine();
			 * System.out.println("\nDigite o nº do documento de identidade:            ");
			 * doc = leia.nextLine();
			 * System.out.println("\nDigite o nº do telefone:                           ");
			 * tel = leia.nextLine();
			 * System.out.println(zona);
			 * System.out.println("\nEscolha sua localização                            ");
			 */

			localb = leia.nextInt();

			if (localb <= 4 && localb > 0) {
				if (localb == 1) {
					localizacao = "Zona Leste";
					continuarCaseB = false;
				}
				if (localb == 2) {
					localizacao = "Zona Oeste";
					continuarCaseB = false;
				}
				if (localb == 3) {
					localizacao = "Zona Sul";
					continuarCaseB = false;
				}
				if (localb == 4) {
					localizacao = "Zona Norte";
					continuarCaseB = false;
				}
			} else {
				System.out.println("ID da Zona incoreeto");
			}
		} while (continuarCaseB);

		Pessoa pessoa1 = new Pessoa(nome, doc, tel, localizacao);
		pessoa1.exibir();

		do {
			continuar = true;

			System.out.println(Cor.TEXT_CYAN
					+ "-----------------------------------------------------");

			System.out.println("                                                     ");
			System.out.println("                      Bem-vinde!                     ");
			System.out.println("-----------------------------------------------------");
			System.out.println("                                                     ");
			System.out.println("            1 - OFERECER DOAÇÃO.                     ");
			System.out.println("            2 - SOLICITAR DOAÇÃO.                    ");
			System.out.println("            3 - INFORMAÇÕES ÚTEIS.                   ");
			System.out.println("            4 - CADASTRO DE ONGS.                    ");
			System.out.println("            5 - ENCERRAR.                            ");
			System.out.println("-----------------------------------------------------");
			System.out.println("                                                     ");
			System.out.println("            Digite a opção desejada:                 ");

			System.out.println("-----------------------------------------------------" + Cor.TEXT_RESET);

			opcao = leia.nextInt();

			switch (opcao) {
				case 1:
					do {
						System.out.println("\t    __..,,... .,,,,,.");
						System.out.println("\t''''        ,'        ` .");
						System.out.println("\t          ,'  ,.  ..      `  .");
						System.out.println("\t          `.,'      ..           `");
						System.out.println("\t__..,.             .  ..     .");
						System.out.println("\t       ` .       .  `.  .` `");
						System.out.println("\t           ,  `.  `.  `._,..");
						System.out.println("\t             .  `.  `..'");
						System.out.println("\t              ` -'`''");
						System.out.println("\t\t1 - OFERECER DOAÇÃO.");
						System.out.println("\n\tFicamos felizes com sua atitude, ela pode salvar vidas.");
						System.out.println("\n\tPor favor, selecione o produto que deseja doar");
						do {
							try {
								for (int i = 0; i < 3; i++) {
									System.out.println((i + 1) + " " + Produtos[i] + " = " + quantidade[i]);
								}
								System.out.println("\n\tPor favor, digidte o ID do produto que deseja doar: ");
								idProduto = leia.nextInt();
								if (idProduto < 1 || idProduto > Produtos.length) {
									System.out.println("ID do produto não válido!");
								}
							} catch (Exception e) {
								System.err.println("ID do produto não válido!");
							}
						} while (continuarCaseB);

						System.out.println("\n\tDigite a quantidade desejada:");
						quant = leia.nextInt();

						quantidade[idProduto - 1] += quant;
						System.out.println(
								"===============================================================================================");
						System.out.println("\n\tDoação realizada! Confira nosso estoque atual ");
						for (int i = 0; i < 3; i++) {
							System.out.println((i + 1) + " " + Produtos[i] + " = " + quantidade[i]);
						}
						System.out.println("\nObrigade! " + nome
								+ " por sua contribuição, ela vai fazer a diferença na vida de alguém!");
						if (localb == 1) {
							System.out.println("\nEnvie o produto para a Doa Brasil, 11-1234-5678. Av. Itaquera, 1000");
						}
						if (localb == 2) {
							System.out.println(
									"\nnEnvie o produto para a Vidas que importam, 11-8765-4321. Av. Paulista, 5000");
						}
						if (localb == 3) {
							System.out.println(
									"\nnEnvie o produto para a Pró Vida, 11 1234-1234. Av. Belmira Marim, 510");
						}
						if (localb == 4) {
							System.out.println(
									"\nnEnvie o produto para a Geração Guerreiro, 11 1234-1234. Av. Cruzeiro do Sul, 1000");
						}
						System.out.println("Voçe deseja continuar nessa página?");
								System.out.println("1 - Sim\n 2 - Não");
								continuarCaseI = leia.nextInt();
								do {
									try{
								if(continuarCaseI == 2){
									continuarCaseB = false;
								}
							} catch(Exception e) {System.err.println("ID inválido");}
							} while(continuarCaseB);

					} while (continuarCaseB);
					/*
					 * do {
					 * try {
					 * for (int i = 0; i < 3; i++) {
					 * System.out.println((i + 1) + " " + Produtos[i]);
					 * }
					 * System.out.println("\tSelecione o produto que deseja doar: ");
					 * idProduto = leia.nextInt();
					 * if (idProduto < 1 || idProduto > 3) {
					 * System.err.println("\nID do produto não válido!\n");
					 * continuarCaseB = true;
					 * }
					 * else {
					 * continuarCaseB = false;
					 * }
					 * } catch (Exception e) {
					 * System.err.println("\nDigite apenas numeros");
					 * leia.next();
					 * }
					 * 
					 * } while(continuarCaseB);
					 * 
					 * do {
					 * try {
					 * System.out.println("\n\tInsira quantas unidades do produto (" +
					 * Produtos[idProduto - 1]
					 * + ") você deseja doar: ");
					 * quant = leia.nextInt();
					 * } catch (Exception e) {
					 * System.err.println("Apenas números inteiros como quantidade");
					 * leia.nextLine();
					 * }
					 * } while (quant < 1);
					 * 
					 * quantidade[idProduto - 1] += quant;
					 * 
					 * if (localb == 1) {
					 * estoqueZonaLeste.add(new Estoque(Produtos[idProduto - 1], quant));
					 * } else if (localb == 2) {
					 * estoqueZonaOeste.add(new Estoque(Produtos[idProduto - 1], quant));
					 * } else if (localb == 3) {
					 * estoqueZonaSul.add(new Estoque(Produtos[idProduto - 1], quant));
					 * } else if (localb == 4) {
					 * estoqueZonaNorte.add(new Estoque(Produtos[idProduto - 1], quant));
					 * }
					 * 
					 * for (Ong ong : ongs) {
					 * List<Estoque> estoqueOng = ong.getEstoque();
					 * for (Estoque estoque : estoqueOng) {
					 * if (estoque.getNome().equals(Produtos[idProduto - 1])) {
					 * System.out.println("\nObrigade! " + nome
					 * + " por sua contribuição, ela vai fazer a diferença na vida de alguém!");
					 * System.out.println(
					 * "\nFoi doado " + estoque.getQuantidade() + " do produto "
					 * + estoque.getNome()
					 * + " para a ONG: " + ong.getNomePessoa());
					 * System.out.
					 * println("\nVeja como ficou nosso estoque depois da sua contribuição");
					 * }
					 * }
					 * }
					 * for (int i = 0; i < 3; i++) {
					 * System.out.println((i + 1) + " " + Produtos[i] + " " + quantidade[i]);
					 * }
					 * System.out.
					 * println("\t\tDeseja continuar na página de doação?\n1 - Sim\n2 - Não");
					 * continuarCaseI = leia.nextInt();
					 * if (continuarCaseI == 2) {
					 * continuarCaseB = false;
					 * }
					 * } while (continuarCaseB);
					 */
					break;
				case 2:
					do {
						System.out.println("\t    __..,,... .,,,,,.");
						System.out.println("\t''''        ,'        ` .");
						System.out.println("\t          ,'  ,.  ..      `  .");
						System.out.println("\t          `.,'      ..           `");
						System.out.println("\t__..,.             .  ..     .");
						System.out.println("\t       ` .       .  `.  .` `");
						System.out.println("\t           ,  `.  `.  `._,..");
						System.out.println("\t             .  `.  `..'");
						System.out.println("\t              ` -'`''");
						System.out.println("\t\t2 - SOLICITAR DOAÇÃO.");
						for (int i = 0; i < 3; i++) {
							System.out.println((i + 1) + " " + Produtos[i] + " = " + quantidade[i]);
						}
						System.out.println("\n\tPor favor, selecione o produto que deseja solicitar: ");
						idProduto = leia.nextInt();
						if (idProduto < 1 || idProduto > Produtos.length) {
							System.out.println("ID do produto não válido!");
						}

						System.out.println("\n\tDigite a quantidade desejada:");
						quant = leia.nextInt();
						if (quant < 1 || quant > quantidade[idProduto]) {
							System.out.println("Quantidade inserida não válida!");
						}

						quantidade[idProduto - 1] -= quant;
						System.out.println("\n\tDoação solicitada! Confira nosso estoque atual ");
						for (int i = 0; i < 3; i++) {
							System.out.println((i + 1) + " " + Produtos[i] + " = " + quantidade[i]);
						}
						System.out.println("\n\tPor favor retire sua doação no endereço abaixo: ");

						if (localb == 1) {
							System.out.println("\nDoa Brasil, 11-1234-5678. Av. Itaquera, 1000");
						}
						if (localb == 2) {
							System.out.println("\nVidas que importam, 11-8765-4321. Av. Paulista, 5000");
						}
						if (localb == 3) {
							System.out.println("\nPró Vida, 11 1234-1234. Av. Belmira Marim, 510");
						}
						if (localb == 4) {
							System.out.println("\nGeração Guerreiro, 11 1234-1234. Av. Cruzeiro do Sul, 1000");
						}
						System.out.println("\tDeseja continuar na página de doação?\n1 - Sim\n2 - Não");
						continuarCaseI = leia.nextInt();
						if (continuarCaseI == 2) {
							continuarCaseB = false;
						}
					} while (continuarCaseB);
					break;

				case 3:
					System.out.println("     _________________________________________________________________");
					System.out.println("    /\\                                                                \\");
					System.out.println("(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)");
					System.out.println("    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''/");
					System.out.println("    (                                                                 (");
					System.out.println("     )                     3 - INFORMAÇÕES ÚTEIS                       )");
					System.out.println("    (                                                                 (");
					System.out.println("     )          O Projeto Vida é um programa desenvolvido para         )");
					System.out.println("              facilitar a doação de doadores por ONGs próximas.");
					System.out.println("    (           O programa visa promover a solidariedade entre        (");
					System.out.println("     )        as pessoas, contribuindo para um mundo mais justo        )");
					System.out.println("    (         e solidario                                             (");
					System.out.println("     )                                                                 )");
					System.out.println("                Com o Projeto Vida, a doação se torna mais fácil");
					System.out.println("    (         e acessível, contribuindo para melhorar a qualidade     (");
					System.out.println("     )        de vida de quem mais precisa                             )");
					System.out.println("    (                                                                 (");
					System.out.println("     )                                                                 )");
					System.out.println("                O projeto foi desenvolvido pela equipe composta");
					System.out.println("    (         por: Erenilda Tavares, Juliana Lopes                    (");
					System.out.println("     )             Larissa Senezio, Mariane Anjos                      )");
					System.out.println("    (              Renan Gonçalves e Renato Nunes                     (");
					System.out.println("     )                                                                 )");
					System.out.println("    (                    Repósitório do GitHub:                       (");
					System.out.println("     )https://github.com/Projeto-Java-Generation/Projeto_Java/tree/main)");
					System.out.println("    (                                                                 (");
					System.out.println("    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''\\");
					System.out.println("(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)");
					System.out.println("    \\/________________________________________________________________/");
					break;

				case 4:
					leia.nextLine();
					System.out.println("4 - CADASTRO DE ONGS.");
					System.out.println("Digite o nome da ONG:");
					String nomeOng = leia.nextLine();
					System.out.println("Digite o telefone da ONG:");
					String telOng = leia.nextLine();
					System.out.println("Digite o nº o CNPJ da ONG:");
					String docOng = leia.nextLine();
					System.out.println(zona + "\nDigite o nº referente a  localização da ONG:");
					int localizacaoZ = leia.nextInt();
					switch (localizacaoZ) {
						case 1:
							localizacao = "Zona Leste";
							break;
						case 2:
							localizacao = "Centro";
							break;
						case 3:
							localizacao = "Zona Oeste";
							break;
						case 4:
							localizacao = "Zona Sul";
							break;
						case 5:
							localizacao = "Zona Norte";
							break;
					}
					Ong ong = new Ong(nomeOng, docOng, telOng, localizacao, estoqueOng);
					ong.exibirOngNova();
					break;
				case 5:
					System.out.println("\nSoftware finalizado.");
					continuar = false;
					break;

				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		} while (continuar);
	}
}
