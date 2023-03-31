package projetoJavaGrupo;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class menu {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String[] Produtos = { "Cesta Básica", "Agasalho", "Água", "Roupas", "Calçados", "Cobertores",
				"Produtos de limpeza", "Brinquedos", "Livros" };
		String zona = Cor.TEXT_GREEN_BOLD + "1 - Zona Leste\n2 - Zona Oeste\n3 - Zona Sul\n4 - Zona Norte"
				+ Cor.TEXT_RESET;
		String nome, tel, doc, nomeOng = "", localizacao = "";

		int[] quantidade = new int[Produtos.length];
		for (int i = 0; i < Produtos.length; i++) {
			quantidade[i] = (int) (Math.random() * 10.0);
		}
		int[] ongQuantidade = new int[Produtos.length];
		for (int i = 0; i < Produtos.length; i++) {
			ongQuantidade[i] = 0;
		}

		int idProduto = 0, quant = 0, senhaOng = (int) (Math.random() * 9999.0);
		int opcao, localb, continuarCaseI;

		boolean continuar = true, continuarCaseB = true, ongCadastradaB = false, continuarCaseBo = true;

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
		System.out.println(
				"         &GB&                                                                    \n" + Cor.TEXT_RESET);

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
				"==============================================================================================="
						+ Cor.TEXT_RESET);

		System.out.println(Cor.TEXT_BLUE_BOLD + "\nDigite seu nome:" + Cor.TEXT_RESET);

		nome = leia.nextLine();

		System.out.println(Cor.TEXT_BLUE_BOLD + "\nDigite o nº do documento de identidade:" + Cor.TEXT_RESET);

		doc = leia.nextLine();

		System.out.println(Cor.TEXT_BLUE_BOLD + "\nDigite o nº do telefone:" + Cor.TEXT_RESET);

		tel = leia.nextLine();
		do {
			System.out.println("\n" + zona);

			System.out
					.println(Cor.TEXT_BLUE_BOLD + "\nEscolha sua localização" + Cor.TEXT_RESET);

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

			System.out.println(Cor.TEXT_BLUE_BOLD
					+ "-----------------------------------------------------" + Cor.TEXT_RESET);

			System.out.println("                                                     ");
			System.out.println(
					Cor.TEXT_GREEN_BOLD + "               Bem-vinde " + nome + "!                     "
							+ Cor.TEXT_RESET);
			System.out.println(
					Cor.TEXT_BLUE_BOLD + "-----------------------------------------------------" + Cor.TEXT_RESET);
			System.out.println(Cor.TEXT_GREEN_BOLD + "                                                     ");
			System.out.println("            1 - OFERECER DOAÇÃO.                     ");
			System.out.println("            2 - SOLICITAR DOAÇÃO.                    ");
			System.out.println("            3 - INFORMAÇÕES ÚTEIS.                   ");
			System.out.println("            4 - CADASTRO DE ONGS.                    ");
			System.out.println("            5 - ENCERRAR.                            " + Cor.TEXT_RESET);
			System.out.println(Cor.TEXT_BLUE_BOLD + "-----------------------------------------------------");
			System.out.println("                                                     ");
			System.out.println("            Digite a opção desejada:                 ");

			System.out.println("-----------------------------------------------------" + Cor.TEXT_RESET);

			opcao = leia.nextInt();
			switch (opcao) {

				case 1:

					while (ongCadastradaB) {
						try {
							System.out.println(Cor.TEXT_GREEN_BOLD + "Nova ONG registrada (" + nomeOng
									+ ") no sistema, deseja inserir produtos nela?" + Cor.TEXT_RESET);
							System.out.println(Cor.TEXT_BLUE_BOLD + "1 - Sim\n2 - Não" + Cor.TEXT_RESET);
							continuarCaseI = leia.nextInt();
							if (continuarCaseI == 1) {
								do {
									System.out
											.println(Cor.TEXT_BLUE_BOLD + "Digite a senha da ONG" + Cor.TEXT_RESET);
									int testaSenha = leia.nextInt();
									if (testaSenha == senhaOng) {
										do {
											try {
												continuarCaseB = true;
												for (int i = 0; i < Produtos.length; i++) {
													System.out.println(
															Cor.TEXT_GREEN_BOLD + (i + 1) + " " + Produtos[i]
																	+ " = " + ongQuantidade[i]);
												}
												System.out.println(Cor.TEXT_BLUE_BOLD
														+ "\n\tPor favor, digite o ID do produto que deseja inserir:"
														+ Cor.TEXT_RESET);
												idProduto = leia.nextInt();
												if (idProduto < 1 || idProduto > Produtos.length) {
													System.err.println(Cor.TEXT_RED_BOLD
															+ "ID do produto não válido!" + Cor.TEXT_RESET);
												} else {
													continuarCaseB = false;
												}
											} catch (Exception e) {
												System.err.println(Cor.TEXT_RED_BOLD + "ID do produto não válido!"
														+ Cor.TEXT_RESET);
											}
										} while (continuarCaseB);

										System.out.println(Cor.TEXT_BLUE_BOLD + "\n\tDigite a quantidade desejada:"
												+ Cor.TEXT_RESET);
										quant = leia.nextInt();

										ongQuantidade[idProduto - 1] += quant;
										System.out.println(Cor.TEXT_BLUE_BOLD +
												"==============================================================================================="
												+ Cor.TEXT_RESET);
										System.out.println(Cor.TEXT_GREEN_BOLD
												+ "\n\tProduto Inserido! Confira estoque da ONG:");
										for (int i = 0; i < Produtos.length; i++) {
											System.out.println(Cor.TEXT_GREEN_BOLD + (i + 1) + " " + Produtos[i]
													+ " = " + ongQuantidade[i]
													+ Cor.TEXT_RESET);
										}
										continuarCaseB = false;
										continuarCaseBo = true;
									} else {
										System.err.println(Cor.TEXT_RED_BOLD + "Senha incorreta!" + Cor.TEXT_RESET);
									}
								} while (continuarCaseB);
							} else if (continuarCaseI == 2) {
								ongCadastradaB = false;
								continuarCaseBo = false;
							}

						} catch (Exception e) {
							System.err.println("Digite apenas números inteiros");
						}
					}
					if (continuarCaseBo) {
						do {

							System.out.println(Cor.TEXT_BLUE_BOLD + "\t    __..,,... .,,,,,.");
							System.out.println("\t''''        ,'        ` .");
							System.out.println("\t          ,'  ,.  ..      `  .");
							System.out.println("\t          `.,'      ..           `");
							System.out.println("\t__..,.             .  ..     .");
							System.out.println("\t       ` .       .  `.  .` `");
							System.out.println("\t           ,  `.  `.  `._,..");
							System.out.println("\t             .  `.  `..'");
							System.out.println("\t              ` -'`''");
							System.out.println(Cor.TEXT_BLUE_UNDERLINED + "\t\t1 - OFERECER DOAÇÃO." + Cor.TEXT_RESET);
							System.out.println(Cor.TEXT_BLUE_BOLD
									+ "\n\tFicamos felizes com sua atitude, ela pode salvar vidas." + Cor.TEXT_RESET);
							do {
								try {
									for (int i = 0; i < Produtos.length; i++) {
										System.out.println(
												Cor.TEXT_GREEN_BOLD + (i + 1) + " " + Produtos[i] + " = "
														+ quantidade[i]);
									}
									System.out.println(Cor.TEXT_BLUE_BOLD
											+ "\n\tPor favor, digite o ID do produto que deseja Doar:"
											+ Cor.TEXT_RESET);
									idProduto = leia.nextInt();
									if (idProduto < 1 || idProduto > Produtos.length) {
										System.err.println(Cor.TEXT_RED_BOLD
												+ "ID do produto não válido!" + Cor.TEXT_RESET);
									} else {
										continuarCaseBo = false;
									}
								} catch (Exception e) {
									System.err.println(Cor.TEXT_RED_BOLD + "ID do produto não válido!"
											+ Cor.TEXT_RESET);
								}
							} while (continuarCaseBo);

							System.out
									.println(Cor.TEXT_BLUE_BOLD + "\n\tDigite a quantidade desejada:" + Cor.TEXT_RESET);
							quant = leia.nextInt();

							quantidade[idProduto - 1] += quant;
							System.out.println(Cor.TEXT_BLUE_BOLD +
									"==============================================================================================="
									+ Cor.TEXT_RESET);
							System.out
									.println(Cor.TEXT_GREEN_BOLD + "\n\tDoação realizada! Confira nosso estoque atual");
							for (int i = 0; i < Produtos.length; i++) {
								System.out.println(
										Cor.TEXT_GREEN_BOLD + (i + 1) + " " + Produtos[i] + " = " + quantidade[i]
												+ Cor.TEXT_RESET);
							}
							System.out.println(Cor.TEXT_BLUE_BOLD
									+ "\n\nNós do Projeto Vida agradecemos por sua contribuição, ela vai fazer a diferença na vida de alguém!"
									+ Cor.TEXT_RESET);
							if (localb == 1) {
								System.out.println(Cor.TEXT_GREEN_BOLD
										+ "\nSua doação foi enviada para a ONG Doa Brasil, 11-1234-5678. Av. Itaquera, 1000"
										+ Cor.TEXT_RESET);
							}
							if (localb == 2) {
								System.out.println(Cor.TEXT_GREEN_BOLD +
										"\nSua doação foi enviada para a ONG Vidas que importam, 11-8765-4321. Av. Paulista, 5000"
										+ Cor.TEXT_RESET);
							}
							if (localb == 3) {
								System.out.println(Cor.TEXT_GREEN_BOLD +
										"\nSua doação foi enviada para a ONG Pró Vida, 11 1234-1234. Av. Belmira Marim, 510"
										+ Cor.TEXT_RESET);
							}
							if (localb == 4) {
								System.out.println(Cor.TEXT_GREEN_BOLD +
										"\nSua doação foi enviada para a ONG Geração Guerreiro, 11 1234-1234. Av. Cruzeiro do Sul, 1000"
										+ Cor.TEXT_RESET);
							}
							do {

								System.out.println(
										Cor.TEXT_BLUE_BOLD + "\nVoçê deseja continuar nessa página?" + Cor.TEXT_RESET);
								System.out.println(Cor.TEXT_GREEN_BOLD + "1 - Sim\n2 - Não" + Cor.TEXT_RESET);
								opcao = leia.nextInt();

							} while (opcao < 1 || opcao > 2);

							continuarCaseBo = true;

						} while (opcao == 1);
					}

					break;
				case 2:
					continuarCaseB = true;
					System.out.println(Cor.TEXT_BLUE_BOLD + "\t    __..,,... .,,,,,.");
					System.out.println("\t''''        ,'        ` .");
					System.out.println("\t          ,'  ,.  ..      `  .");
					System.out.println("\t          `.,'      ..           `");
					System.out.println("\t__..,.             .  ..     .");
					System.out.println("\t       ` .       .  `.  .` `");
					System.out.println("\t           ,  `.  `.  `._,..");
					System.out.println("\t             .  `.  `..'");
					System.out.println("\t              ` -'`''");
					System.out.println(Cor.TEXT_BLUE_UNDERLINED + "\t\t2 - SOLICITAR DOAÇÃO." + Cor.TEXT_RESET);
					for (int i = 0; i < Produtos.length; i++) {
						System.out.println(Cor.TEXT_GREEN_BOLD + (i + 1) + " " + Produtos[i] + " = " + quantidade[i]
								+ Cor.TEXT_RESET);
					}
					do {
						try {
							for (int i = 0; i < Produtos.length; i++) {
								System.out.println(
										Cor.TEXT_GREEN_BOLD + (i + 1) + " " + Produtos[i] + " = "
												+ quantidade[i]);
							}
							System.out.println(Cor.TEXT_BLUE_BOLD
									+ "\n\tPor favor, digite o ID do produto que deseja solicitar:"
									+ Cor.TEXT_RESET);
							idProduto = leia.nextInt();
							if (idProduto < 1 || idProduto > Produtos.length) {
								System.err.println(Cor.TEXT_RED_BOLD
										+ "ID do produto não válido!" + Cor.TEXT_RESET);
							} else {
								continuarCaseB = false;
							}
						} catch (Exception e) {
							System.err.println(Cor.TEXT_RED_BOLD + "ID do produto não válido!"
									+ Cor.TEXT_RESET);
						}
					} while (continuarCaseB);

					System.out
							.println(Cor.TEXT_BLUE_BOLD + "\n\tDigite a quantidade desejada:" + Cor.TEXT_RESET);
					quant = leia.nextInt();

					quantidade[idProduto - 1] -= quant;
					System.out.println(Cor.TEXT_BLUE_BOLD +
							"==============================================================================================="
							+ Cor.TEXT_RESET);

					System.out.println(
							Cor.TEXT_BLUE_BOLD + "\n\tDoação solicitada! Confira nosso estoque atual" + Cor.TEXT_RESET);
					for (int i = 0; i < Produtos.length; i++) {
						System.out.println(Cor.TEXT_GREEN_BOLD + (i + 1) + " " + Produtos[i] + " = " + quantidade[i]
								+ Cor.TEXT_RESET);
					}
					System.out.println(Cor.TEXT_BLUE_BOLD + "\n\tPor favor retire sua doação no endereço abaixo: "
							+ Cor.TEXT_RESET);

					if (localb == 1) {
						System.out.println(Cor.TEXT_GREEN_BOLD + "\nDoa Brasil, 11-1234-5678. Av. Itaquera, 1000"
								+ Cor.TEXT_RESET);
					}
					if (localb == 2) {
						System.out.println(Cor.TEXT_GREEN_BOLD
								+ "\nVidas que importam, 11-8765-4321. Av. Paulista, 5000" + Cor.TEXT_RESET);
					}
					if (localb == 3) {
						System.out.println(Cor.TEXT_GREEN_BOLD + "\nPró Vida, 11 1234-1234. Av. Belmira Marim, 510"
								+ Cor.TEXT_RESET);
					}
					if (localb == 4) {
						System.out.println(Cor.TEXT_GREEN_BOLD
								+ "\nGeração Guerreiro, 11 1234-1234. Av. Cruzeiro do Sul, 1000" + Cor.TEXT_RESET);
					}

					break;

				case 3:
					System.out.println(Cor.TEXT_BLUE_BOLD
							+ "     _________________________________________________________________");
					System.out.println("    /\\                                                                \\");
					System.out.println("(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)");
					System.out.println("    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''/");
					System.out.println("    (                                                                 (");
					System.out.println("     )                     " + Cor.TEXT_BLUE_UNDERLINED
							+ "3 - INFORMAÇÕES ÚTEIS" + Cor.TEXT_RESET + "                       )");
					System.out.println(Cor.TEXT_BLUE_BOLD
							+ "    (                                                                 (");
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
					System.out.println("     )" + Cor.TEXT_GREEN_BOLD
							+ "https://github.com/Projeto-Java-Generation/Projeto_Java/tree/main" + Cor.TEXT_RESET
							+ ")");
					System.out.println(Cor.TEXT_BLUE_BOLD
							+ "    (                                                                 (");
					System.out.println("    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''\\");
					System.out.println("(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)");
					System.out.println("    \\/________________________________________________________________/"
							+ Cor.TEXT_RESET);
					break;

				case 4:
					leia.nextLine();
					System.out.println(Cor.TEXT_BLUE_UNDERLINED + "\n4 - CADASTRO DE ONGS.\n" + Cor.TEXT_RESET);
					System.out.println(Cor.TEXT_BLUE_BOLD + "Digite o nome da ONG:" + Cor.TEXT_RESET);
					nomeOng = leia.nextLine();
					System.out.println(Cor.TEXT_BLUE_BOLD + "\nDigite o telefone da ONG:" + Cor.TEXT_RESET);
					String telOng = leia.nextLine();
					System.out.println(Cor.TEXT_BLUE_BOLD + "\nDigite o nº o CNPJ da ONG:" + Cor.TEXT_RESET);
					String docOng = leia.nextLine();
					System.out.println(Cor.TEXT_GREEN_BOLD + zona + Cor.TEXT_RESET + "\n" + Cor.TEXT_BLUE_BOLD
							+ "Digite o nº referente a  localização da ONG:" + Cor.TEXT_RESET);
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
					do {
						try {
							System.out.println(Cor.TEXT_BLUE_BOLD
									+ "\nDigite uma senha para ela (apenas números inteiros): " + Cor.TEXT_RESET);
							senhaOng = leia.nextInt();
						} catch (Exception e) {
							System.err.println(Cor.TEXT_RED_BOLD + "Digite apenas numeros inteiros!" + Cor.TEXT_RESET);
						}
					} while (continuarCaseB);
					Ong ong = new Ong(nomeOng, docOng, telOng, localizacao, estoqueOng);
					ong.exibirOngNova();
					ongCadastradaB = true;
					break;
				case 5:
					System.out.println(Cor.TEXT_GREEN_BOLD
							+ "\nObrigade por usar nossa plataforma! Esperamos ver você em breve!" + Cor.TEXT_RESET);
					continuar = false;
					break;

				default:
					System.err.println(Cor.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cor.TEXT_RESET);
					break;
			}
			continuarCaseBo = true;
		} while (continuar);

		leia.close();
	}
}
