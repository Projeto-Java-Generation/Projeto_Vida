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
		int opcao, localb;

		List<Estoque> estoqueZonaLeste = new ArrayList<Estoque>();
		estoqueZonaLeste.add(new Estoque("Cesta Básica", 10));
		estoqueZonaLeste.add(new Estoque("Agasalho", 5));
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

		System.out.println("-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("             Bem-vinde ao Projeto Vida!              ");
		System.out.println("-----------------------------------------------------");
		System.out.println("                                                     ");
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

		System.out.println("-----------------------------------------------------");
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
		System.out.println("-----------------------------------------------------");

		opcao = leia.nextInt();

		switch (opcao) {
			case 1:
				System.out.println("1 - OFERECER DOAÇÃO.");
				System.out.println("\nFicamos felizes com sua atitude, ela pode salvar vidas.");
				System.out.println("\nPor favor, selecione o produto que deseja doar");

				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + " " + Produtos[i]);
				}
				while (idProduto <= 0 || idProduto > 3) {

					System.out.println("selecione o produto que deseja doar: ");
					idProduto = leia.nextInt();

				}

				do {
					System.out.println("\nInsira quantas unidades do produto (" + Produtos[idProduto - 1]
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
									+ " por sua contribuicao, ela vai fazer a diferenca na vida de alguem!");
							System.out.println(
									"\nFoi doado " + estoque.getQuantidade() + " do produto " + estoque.getNome()
											+ "para a ONG: " + ong.getNomePessoa());
							System.out.println("\nVeja como ficou nosso estoque depois da sua contribuicao");

							// System.out.println("O item " + estoque.getNome() + " está disponível na ONG "
							// + ong.getNomePessoa());

						}
					}
				}
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + " " + Produtos[i] + quantidade[i]);
				}
				break;
			case 2:
				System.out.println("2 - SOLICITAR DOAÇÃO.");
				System.out.println("\nPor favor, selecione o produto que deseja solicitar: ");

				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + " " + Produtos[i] + " = " + quantidade[i]);
				}
				while (idProduto <= 0 || idProduto > 3) {

					System.out.println("Selecione o produto que deseja solicitar: ");
					idProduto = leia.nextInt();

				}
				System.out.println("\nDigite a quantidade desejada:");
				quant = leia.nextInt();
				quantidade[idProduto - 1] -= quant;
				System.out.println("\nDoação solicitada! Confira nosso estoque atual ");
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + " " + Produtos[i] + " = " + quantidade[i]);
				}
				System.out.println("\nPor favor retire sua doação no endereço abaixo: ");

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
				break;

			case 3:
				System.out.println("3 - INFORMAÇÕES ÚTEIS.");
				System.out.println("\nO Projeto Vida é um programa desenvolvido para facilitar a doação de doadores por ONGs próximas."
				+"O programa visa promover a solidariedade entre as pessoas, contribuindo para um mundo mais justo e solidário." 
				+"Com o Projeto Vida, a doação se torna mais fácil e acessível, contribuindo para melhorar a qualidade de vida de quem mais precisa."
				+"\nO projeto foi desenvolvido pela equipe composta por: Erenilda Tavares, Juliana Lopes, Larissa Senezio, Mariane Anjos, Renan Gonçalves e Renato Nunes");
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
				leia.close();
				System.exit(4);
				break;

			default:
				System.out.println("\nOpção Inválida!\n");
				break;
		}
	}
}
