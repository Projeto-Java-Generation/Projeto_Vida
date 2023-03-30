package projetoJavaGrupo;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class menu {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String[] Produtos = { "Cesta Básica ", "Agasalho ", "Agua " };
		int[] quantidade = { 10, 10, 10 };
		int idProduto = 0, quant = 0;

		String zona = "1 - Zona Leste\n2 - Zona Oeste\n3 - Zona Sul\n4 - Zona Norte";
		String nome, tel, doc, localizacao = "";
		int opcao, localb, continuarCaseI;

		List<Estoque> estoqueZonaLeste = new ArrayList<Estoque>();
		estoqueZonaLeste.add(new Estoque("Cesta Básica", quantidade[0]));
		estoqueZonaLeste.add(new Estoque("Agasalho", quantidade[1]));
		List<Estoque> estoqueZonaSul = new ArrayList<Estoque>();
		estoqueZonaSul.add(new Estoque("Água", 1));
		estoqueZonaSul.add(new Estoque("Agasalho", 5));
		List<Estoque> estoqueZonaNorte = new ArrayList<Estoque>();
		estoqueZonaSul.add(new Estoque("Água", 1));
		estoqueZonaSul.add(new Estoque("Agasalho", 5));
		List<Estoque> estoqueZonaOeste = new ArrayList<Estoque>();
		estoqueZonaSul.add(new Estoque("Água", 1));
		estoqueZonaSul.add(new Estoque("Agasalho", 5));

		List<Ong> ongs = new ArrayList<Ong>();
		ongs.add(new Ong("Doa + Brasil", "11-1234-5678", "40.545.193/0001-00", "Zona Leste", estoqueZonaLeste));
		ongs.add(new Ong("Vidas que importam", "11-8765-4321", "89.848.378/0001-00", "Zona Oeste", estoqueZonaOeste));
		ongs.add(new Ong("Pro vida", "11 1234-1234", "15.904.852/0001-00", "Zona Sul", estoqueZonaSul));
		ongs.add(new Ong("Geração Guerreiro", "11 1234-1234", "18.953.214/0001-00", "Zona Norte", estoqueZonaNorte));
		/*
		 * for (Ong ong : ongs) {
		 * System.out.println("Nome: " + ong.getNomePessoa());
		 * System.out.println("Telefone: " + ong.getTelefone());
		 * System.out.println("CNPJ: " + ong.getDocumento());
		 * System.out.println("Localização: " + ong.getLocalizacao());
		 * System.out.println("Estoque:");
		 * List<Estoque> estoqueOng = ong.getEstoque();
		 * for (Estoque estoque : estoqueOng) {
		 * System.out.println("- " + estoque.getNome() + ": " +
		 * estoque.getQuantidade());
		 * }
		 * System.out.println();
		 * }
		 */
		

		System.out.println("===============================================================================================");
		System.out.println("  8888888b.                     d8b          888            888     888 d8b      888           ");
		System.out.println("  888   Y88b                    Y8P          888            888     888 Y8P      888           ");
		System.out.println("  888    888                                 888            888     888          888           ");
		System.out.println("  888   d88P 888d888  .d88b.   8888  .d88b.  888888  .d88b. Y88b   d88P 888  .d88888  8888b.   ");
		System.out.println("  8888888P   888P    d88  88b   888 d8P  Y8b 888    d88  88b Y88b d88P  888 d88  888      88b  ");
		System.out.println("  888        888     888  888   888 88888888 888    888  888  Y88o88P   888 888  888 .d888888  ");
		System.out.println("  888        888     Y88..88P   888 Y8b.     Y88b.  Y88..88P   Y888P    888 Y88b 888 888  888  ");
		System.out.println("  888        888       Y88P     888   Y8888    Y888   Y88P      Y8P     888   Y88888  Y888888  ");
		System.out.println("                                888                                                            ");
		System.out.println("                               d88P                                                            ");
		System.out.println("                             888P                                                              ");
		System.out.println("===============================================================================================");
		System.out.println("\nDigite seu nome:                                   ");
		nome = leia.nextLine();
		System.out.println("\nDigite o nº do documento de identidade:            ");
		doc = leia.nextLine();
		System.out.println("\nDigite o nº do telefone:                           ");
		tel = leia.nextLine();
		System.out.println(zona);
		System.out.println("\nEscolha sua localização                            ");
		localb = leia.nextInt();
		if (localb == 1) {
			localizacao = "Zona Leste";
		}
		if (localb == 2) {
			localizacao = "Zona Oeste";
		}
		if (localb == 3) {
			localizacao = "Zona Sul";
		}
		if (localb == 4) {
			localizacao = "Zona Norte";
		}

		Pessoa pessoa1 = new Pessoa(nome, doc, tel, localizacao);
		pessoa1.exibir();

		boolean continuar = true, continuarCaseB = true;
		do{
			continuar = true;
		System.out.println("-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("              Bem-vinde "+nome+"!            ");
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
		System.out.println("-----------------------------------------------------");

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

				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + " " + Produtos[i]);
				}
				/*
				 * if (idProduto < 1 || idProduto > Produtos.length) {
					System.out.println("ID do produto não válido!");
				}

				System.out.println("\nDigite a quantidade desejada:");
				quant = leia.nextInt();
				if (quant < 1 || quant > quantidade[idProduto]) {
					System.out.println("Quantidade inserida não válida!");
				}
				 */
					System.out.println("\tSelecione o produto que deseja doar: ");
					idProduto = leia.nextInt();
					if(idProduto < 1 || idProduto > Produtos.length){
						System.out.println("ID do produto não válido!");
					}

				do {
					System.out.println("\n\tInsira quantas unidades do produto (" + Produtos[idProduto - 1]
							+ ") você deseja doar: ");
					quant = leia.nextInt();

				} while (quant < 1);

				quantidade[idProduto - 1] += quant;

				if (localb == 1) {
					estoqueZonaLeste.add(new Estoque(Produtos[idProduto - 1], quant));
				}
				if (localb == 2) {
					estoqueZonaOeste.add(new Estoque(Produtos[idProduto - 1], quant));
				}
				if (localb == 3) {
					estoqueZonaSul.add(new Estoque(Produtos[idProduto - 1], quant));
				}
				if (localb == 4) {
					estoqueZonaNorte.add(new Estoque(Produtos[idProduto - 1], quant));
				}

				for (Ong ong : ongs) {
					List<Estoque> estoqueOng = ong.getEstoque();
					for (Estoque estoque : estoqueOng) {
						if (estoque.getNome().equals(Produtos[idProduto - 1])) {
							System.out.println("\nObrigade! " + nome
									+ " por sua contribuição, ela vai fazer a diferença na vida de alguém!");
							System.out.println(
									"\nFoi doado " + estoque.getQuantidade() + " do produto " + estoque.getNome()
											+ "para a ONG: " + ong.getNomePessoa());
							System.out.println("\nVeja como ficou nosso estoque depois da sua contribuição");

						}
					}
				}
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + " " + Produtos[i] + quantidade[i]);
				}
				System.out.println("\t\tDeseja continuar na página de doação?\n1 - Sim\n2 - Não");
				continuarCaseI = leia.nextInt();
				if(continuarCaseI == 2){
					continuarCaseB = false;
				}
			} while(continuarCaseB);
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
				if(continuarCaseI == 2){
					continuarCaseB = false;
				}
			}while(continuarCaseB);
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
				Ong ong = new Ong(nomeOng, docOng, telOng, localizacao, estoqueZonaSul);
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
	} while(continuar);
	}
}
